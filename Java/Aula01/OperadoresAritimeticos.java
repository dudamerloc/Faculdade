package Faculdade.Java.Aula01;

import java.util.Scanner;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        //Criando o Scanner para entrada - tipo o Scanf em C

        Scanner scanner = new Scanner(System.in); //

        //Solicitar ao usuário dois números
        System.out.println("Digite o Primeiro Número"); // tipo o printf em C
        double num1 = scanner.nextDouble();

        System.out.println("Digite o Segundo Número");
        double num2 = scanner.nextDouble();

        //Realizando operações aritiméticas
        double soma = num1 + num2;
        double subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        double divisao = num1 / num2;
        double modulo = num1 % num2;
        double potencia = Math.pow(num1, num2);
        double raiz = Math.sqrt(num1);

        //Exibindo Resultados
        System.out.println("Soma: " + soma);        
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);
        System.out.println("Modulo: " + modulo);
        System.out.println("Potencia: " + potencia);
        System.out.println("Raiz: " + raiz);

        scanner.close();
    }
}
