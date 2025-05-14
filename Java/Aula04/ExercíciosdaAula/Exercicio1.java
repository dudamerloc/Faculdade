package Faculdade.Java.Aula04.ExercíciosdaAula;

/* 1)Criar uma classe Produto que tenha nome, preço e quantidade. O programa deve permitir que o usuário cadastre um produto e exiba as informações na tela.

Exemplo de Entrada:

Digite o nome do produto: Teclado Mecânico
Digite o preço do produto: 299.99
Digite a quantidade em estoque: 10

Exemplo de Saída:

Produto: Teclado Mecânico
Preço: R$299.99
Quantidade: 10 unidades */

import java.util.Scanner;

class Produto{
    String nome;
    double preco;
    int quantidade;

    void atributos(){
        System.out.println("O produto é: " + nome);   
        System.out.println("o preço dos produto: " + preco);   
        System.out.println("Quantidade de produtos: " + quantidade);   
    }
}

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Digite o nome do produto: ");
        produto.nome = scanner.nextLine();

        System.out.println("Digite o preço do produto: ");
        produto.preco = scanner.nextDouble();

        System.out.println("Digite a quantidade de produtos: ");
        produto.quantidade = scanner.nextInt();

        produto.atributos();
        scanner.close();

    }
    
}
