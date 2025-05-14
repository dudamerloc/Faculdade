package Faculdade.Java.Aula06.ExerciciosdaAula;

/*# **Exercícios de Fixação Encapsulamento**

Exercício: Sistema de Conta Bancária

Criar uma classe ContaBancaria que represente uma conta simples com as seguintes funcionalidades:

- **Cadastrar cliente** com nome e número da conta.
- **Consultar saldo.**
- **Realizar depósito.**
- **Realizar saque com verificação de saldo.**
- **Mostrar dados da conta.**

Exemplo da Tela do Programa:

Nome do titular: Lucas

Número da conta: 1234

=== Menu ===

1 - Consultar saldo
2 - Depositar
3 - Sacar
4 - Exibir dados da conta
5 - Sair

Escolha uma opção: 2

Valor para depósito: 1000

Depósito de R$1000.0 realizado com sucesso! */

import java.util.Scanner;

class ContaBancaria {
    private String titular;
    private int numeroConta;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    // Getters
    public String getTitular() {
        return titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saque inválido. Verifique o valor e o saldo disponível.");
        }
    }

    public void exibirDados() {
        System.out.println("\n=== Dados da conta: ===");
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo atual: R$" + saldo);
    }
}

public class ExerciciodeFixacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Cadastro da conta bancária
        System.out.println("=== Cadastro da conta bancária: ===");
        System.out.print("Nome do titular: ");
        String nome = scanner.nextLine();

        System.out.print("Número da conta: ");
        int numero = scanner.nextInt();
        
        // Criação da conta bancária
        ContaBancaria conta = new ContaBancaria(nome, numero);

        int opcao;
        do {
            System.out.println("\n == Menu == ");
            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Exibir dados da conta");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$" + conta.getSaldo());
                    break;
                case 2:
                    System.out.print("Valor para depósito: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 3:
                    System.out.print("Valor para saque: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 4:
                    conta.exibirDados();
                    break;
                case 5:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();
    }
}

