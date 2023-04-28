public class CursoJava{
    public static void main(String[] args){
        mensagem("Aprendendo sobre classes\n", 1);
        System.out.println("Valor: " + somaT(25,28));
        System.out.println(soma(20,30,40,50));
        System.out.println(soma(10.5,10.5,20.5,20.5));

    }

    public static int soma(int... numeros){
        int res =0 ;
        for(int n:numeros){
            res+=n;
        }
        return res;
    }

    public static Double soma(Double... numeros){
        Double res =0.0 ;
        for(Double n:numeros){
            res+=n;
        }
        return res;
    }

    public static int somaT(int n1, int n2){
        int res=n1+n2;
        return res;

    }

    public static void mensagem(String m, int x){
        
        for(int i=0;i<x;i++){
        System.out.println(m);
        }
    }
}