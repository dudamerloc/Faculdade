package Faculdade.Java.Aula02;

import java.util.Scanner;

public class Leituradedados{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número inteiro: ");
        int inteiro = scanner.nextInt();

        System.out.println("Digite um número Decimal: ");
        double decimal = scanner.nextDouble();

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.next();
            //Lê apenas a primeira palavra
        scanner.nextLine();

        System.out.println("Digite frase completa: ");
        String frase = scanner.nextLine();
            //Lê a linha inteira

        System.out.println("\n=== Dados Lidos===");
        System.out.println("Número inteiro: " + inteiro);
        System.out.println("Número decimal: " + decimal);
        System.out.println("A palavra é: " + palavra);
        System.out.println("A frase é: " + frase);

        scanner.close();
    }
}