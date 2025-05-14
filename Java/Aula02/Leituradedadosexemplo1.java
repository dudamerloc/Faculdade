package Faculdade.Java.Aula02;

import java.util.Scanner;

public class Leituradedadosexemplo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número decimal (Use . ou ,): ");
        String entrada = scanner.nextLine().replace(",", ".");

        double numero = Double.parseDouble(entrada);

        System.out.println("Número Digitado: " + numero);

        scanner.close();
    }
}
