package Faculdade.Java.Aula07;

/*Criar a classe base Veiculo com os atributos:
- String marca
- int ano
- Método: exibirDados()

Criar a subclasse Carro com o atributo:
- int portas
- Método: abrirPortas()

Criar a subclasse Moto com o atributo:
- boolean temPartidaEletrica
- Método: empinar()

No main(), ler os dados com Scanner, instanciar um carro e uma moto e exibir os comportamentos.

Exemplo de saída esperada:
Digite a marca do carro: Toyota
Digite o ano: 2020
Digite o número de portas: 4
Marca: Toyota
Ano: 2020
Este carro tem 4 portas.
Abrindo todas as portas...

Digite a marca da moto: Honda
Digite o ano: 2022
A moto tem partida elétrica? (true/false): true
Marca: Honda
Ano: 2022
A moto tem partida elétrica.

Empinando a moto! */

import java.util.Scanner;

class Veiculos{
    String marca;
    int ano;

    void exibirDados(){
    System.out.println("A marca do veículo é: " + marca + ".");
    System.out.println("O ano do veículo: " + ano + ".");
    }
}

class Carro extends Veiculos{
    int portas;

    void abrirPorta(){
        System.out.println("Você abriu as portas: " + portas);
    }
}

class Moto extends Veiculos{
    boolean temPartidaEletrica;

    void exibirPartidaEletrica() {
        if (temPartidaEletrica) {
            System.out.println("A moto tem partida elétrica.");
        } else {
            System.out.println("A moto não tem partida elétrica.");
        }
    }
    void empinar(){
        System.out.println("Você empinou a moto!(vândalo)");
    }
}



public class ExercicioHeranca1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Carro carro = new Carro();
    
        System.out.println("Digite a marca do carro: ");
        carro.marca = scanner.nextLine();

        System.out.println("Digite o ano do seu carro: ");
        carro.ano = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite o número de portas: ");
        carro.portas = scanner.nextInt();

        System.out.println();
        carro.exibirDados();
        carro.abrirPorta();

        System.out.println("\n-------------------------------------------\n");

        Moto moto = new Moto();

        System.out.println("Digite a marca da moto: ");
        moto.marca = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Digite o ano da moto: ");
        moto.ano = scanner.nextInt();

        System.out.println("A moto tem partida elétrica? (true/false)");
        moto.temPartidaEletrica = scanner.nextBoolean();


        System.out.println();
        moto.exibirDados();
        moto.exibirPartidaEletrica();
        moto.empinar();
        
    }
}