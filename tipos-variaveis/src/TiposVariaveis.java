public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        //int numeroNormal = numeroCurto;
        //short numeroCurto2 = numeroNormal;

        int numero = 1;
        numero = 2;

        System.out.println(numero);

        //Constante - são variaveis que não mudam
        final double VALOR_DE_PI = 3.14;

        //Operador ternário
        int a, b;
        a = 5;
        b = 6;
        String resultado = a==b ?"verdadeiro" : "falso";
        System.out.println(resultado);
        
    }
}
