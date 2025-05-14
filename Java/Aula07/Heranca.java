package Faculdade.Java.Aula07;

/*O que é Herança?
É o mecanismo da POO que permite uma classe herdar atributos e métodos de outra. */

import java.util.Scanner;

class Pessoa{
    String nome;
    int idade;

    void apresentar(){
        System.out.println("Meu nome é: " + nome);
        System.out.println("Tenho " + idade + " anos. " );
    }
}

class Aluno extends Pessoa{
    String curso;

    void estudar(){
        System.out.println(nome + " está estudando " + curso + ".");
    }
}

class Professor extends Pessoa{
    String disciplina;

    void lecionar(){
        System.out.println(nome + " está lecionando " + disciplina + ".");
    }
}

public class Heranca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Dados do aluno
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do aluno: ");
        aluno.nome = scanner.nextLine(); 

        System.out.println("Digite a idade do aluno: ");
        aluno.idade = scanner.nextInt();
        scanner.nextLine(); //LIMPAR O BUFFER(caso contrario vai passar reto da p´rxima pergunta)

        System.out.println("Digite o curso do aluno:");
        aluno.curso = scanner.nextLine();

        System.out.println();
        aluno.apresentar();;
        aluno.estudar();

        System.out.println("\n-------------------------------------------\n");

        // Dados do professor
        Professor professor = new Professor();
        
        System.out.println("Digite o nome do professor: ");
        professor.nome = scanner.nextLine();

        System.out.println("Digite a idade do professor: ");
        professor.idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a disciplina do professor:");
        professor.disciplina = scanner.nextLine();

        System.out.println();
        professor.apresentar();
        professor.lecionar();
        scanner.close();        
    }   
}
