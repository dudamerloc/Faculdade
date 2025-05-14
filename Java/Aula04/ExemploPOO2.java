package Faculdade.Java.Aula04;

import java.util.Scanner;

class Pessoa{
    String nome;
    int idade;

    void dizerOlá(){
        System.out.print("Olá, meu nome é " + nome); //println pula uma linha(a resposta sai na linha de baixo)
        System.out.println(" e tenho " + idade + " anos");
    }
}

public class ExemploPOO2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        // nextLine lê toda a frase, só o next lê só a palavra
        System.out.println("Digite seu nome: ");
        pessoa.nome = scanner.nextLine();

        System.out.println("Digite sua idade: ");
        pessoa.idade = scanner.nextInt();

        pessoa.dizerOlá();
        scanner.close();
    }
} 
