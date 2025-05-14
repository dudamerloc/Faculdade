package Faculdade.Java.Aula01;

import java.util.Scanner;

public class CompiladoresRelacionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro Número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o Segundo Número: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + "==" + num2 + "->" + (num1 == num2));
        System.out.println(num1 + "!=" + num2 + "->" + (num1 != num2));
        System.out.println(num1 + ">" + num2 + "->" + (num1 > num2));
        System.out.println(num1 + "<" + num2 + "->" + (num1 < num2));
        System.out.println(num1 + ">=" + num2 + "->" + (num1 >= num2));
        System.out.println(num1 + "<=" + num2 + "->" + (num1 <= num2));
        
        scanner.close();
    } 
	}
