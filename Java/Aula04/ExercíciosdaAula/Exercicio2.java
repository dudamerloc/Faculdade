package Faculdade.Java.Aula04.ExercíciosdaAula;

/*2) Criar uma classe Aluno para armazenar **nome, nota 1 e nota 2**. O programa deve calcular a **média do aluno** e informar se ele foi **aprovado ou reprovado** (nota mínima 7.0).

Exemplo de Entrada:

Digite o nome do aluno: Maria
Digite a primeira nota: 8.5
Digite a segunda nota: 6.0

Exemplo de Saída:

Aluno: Maria
Média: 7.25
Status: Aprovado */

import java.util.Scanner;

class Aluno{
    String nome;
    double nota1;
    double nota2;

    void boletim(){
       
        double media = ((nota1 + nota2) / 2);
        String status;
        
        if(media >= 7.0){
            status = "Aprovado";           
            
        }else{
            status = "Reprovado";
        }

        System.out.println("Nome do Aluno: " + nome + ".");
        System.out.println("A média é: " + media);
        System.out.println("Status do aluno: " + status );

      
    }
}

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite o nome do Aluno: ");
        aluno.nome = scanner.nextLine();

        System.out.println("Digite a primeira nota do aluno: ");
        aluno.nota1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota do aluno");
        aluno.nota2 = scanner.nextDouble();
       

        aluno.boletim();
        scanner.close();
        
    }  
}
