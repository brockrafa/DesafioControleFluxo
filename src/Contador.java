import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws ParametrosInvalidosException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int parm1 = sc.nextInt();
        System.out.println("Digite o segundo parametro");
        int parm2 = sc.nextInt();
        try{
           contar(parm1, parm2);
            
        }catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
        
    }
    private static void contar(int parm1,int parm2) throws ParametrosInvalidosException{
        if(parm1 > parm2){
            throw new ParametrosInvalidosException();
        }
        int cont = parm2 - parm1;

        for(int i=1;i<=cont;i++){
            System.out.println("Imprimindo o numero " + i);
        }
    }
}
