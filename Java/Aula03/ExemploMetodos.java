package Faculdade.Java.Aula03;

public class ExemploMetodos{
    public static void main(String[] args) {
        int resultadoSoma = somar(10, 5);
        double resultadoMultiplicacao = multiplicar(4.5, 2);

        System.out.println("Soma: " + resultadoSoma);
        System.out.println("Multiplicação: " + resultadoMultiplicacao);
    }

    //Método para somar dois números inteiros
    public static int somar(int a, int b){
        return a + b;
    }

    //Métodopara multiplicar dois números decimais
    public static double multiplicar(double n1, double n2){
        return n1 * n2;
    }
}