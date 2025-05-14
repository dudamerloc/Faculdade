package Faculdade.Java.AtividadesPraticas;

import java.util.ArrayList;
import java.util.Scanner;

abstract class Veiculo{
    int id;
    String marca;
    int ano;

    public Veiculo(int id, String marca, int ano) {
        this.id = id;
        this.marca = marca;
        this.ano = ano;
    }

    public abstract void exibirDados();
}

class Onibus extends Veiculo{
    int capacidadePassageiros;
    String tipo;

    public Onibus(int id, String marca, int ano, int capacidadePassageiros, String tipo){
        super(id, marca, ano);
        this.capacidadePassageiros = capacidadePassageiros;
        this.tipo = tipo;
    }

    public void abrirPortas(){
        System.out.println("As portas do ônibus foram abertas.");
    }

    public void fecharPortas(){
        System.out.println("As portas do ônibus foram fechadas.");
    }

    @Override
    public void exibirDados(){
        System.out.println("Ônibus:");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Capacidade de Passageiros: " + capacidadePassageiros);
        System.out.println("Tipo: " + tipo);
    }
}

class Metro extends Veiculo{
    int numeroVagoes;
    boolean temArCondicionado;

    public Metro(int id, String marca, int ano, int numeroVagoes, boolean temArCondicionado){
        super(id, marca, ano);
        this.numeroVagoes = numeroVagoes;
        this.temArCondicionado = temArCondicionado;
    }

    public void embarcarPassageiros(int qtd){
        System.out.println(qtd + " passageiros embarcaram no metrô.");
    }

    public void desembarcarPassageiros(int qtd){
        System.out.println(qtd + " passageiros desembarcaram do metrô.");
    }

    @Override
    public void exibirDados(){
        System.out.println("Metrô:");
        System.out.println("ID: " + id);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.println("Número de Vagões: " + numeroVagoes);
        System.out.println("Tem Ar-Condicionado: " + (temArCondicionado ? "Sim" : "Não"));
    }
}

class Garagem{
    ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculo v){
        veiculos.add(v);
        System.out.println("Veículo adicionado com sucesso!");
    }

    public void listarTodos() {
        for (Veiculo v : veiculos){
            v.exibirDados();
            System.out.println("---------------------------");
        }
    }

    public void listarPorTipo(){
        for (Veiculo v : veiculos){
            if (v instanceof Onibus){
                System.out.println("Tipo: Ônibus");
            } else if (v instanceof Metro){
                System.out.println("Tipo: Metrô");
            }
            v.exibirDados();
            System.out.println("---------------------------");
        }
    }

    public void contarVeiculos(){
        int qtdOnibus = 0, qtdMetro = 0;
        for (Veiculo v : veiculos) {
            if (v instanceof Onibus) qtdOnibus++;
            if (v instanceof Metro) qtdMetro++;
        }
        System.out.println("Total de Ônibus: " + qtdOnibus);
        System.out.println("Total de Metrôs: " + qtdMetro);
    }
}


public class Atividade02SistemaTransporteApp{
    static Scanner scanner = new Scanner(System.in);
    static Garagem garagem = new Garagem();
    static int idAtual = 1;

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- Sistema de Transporte Público ---");
            System.out.println("1. Cadastrar ônibus");
            System.out.println("2. Cadastrar metrô");
            System.out.println("3. Listar todos os veículos");
            System.out.println("4. Listar veículos por tipo");
            System.out.println("5. Executar ação específica");
            System.out.println("6. Mostrar total de veículos por tipo");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa buffer

            switch (opcao) {
                case 1:
                    cadastrarOnibus();
                    break;
                case 2:
                    cadastrarMetro();
                    break;
                case 3:
                    garagem.listarTodos();
                    break;
                case 4:
                    garagem.listarPorTipo();
                    break;
                case 5:
                    executarAcao();
                    break;
                case 6:
                    garagem.contarVeiculos();
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
    }

    static void cadastrarOnibus() {
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        System.out.print("Capacidade de passageiros: ");
        int capacidade = scanner.nextInt();
        scanner.nextLine(); // Limpa buffer
        System.out.print("Tipo (articulado, convencional, micro-ônibus): ");
        String tipo = scanner.nextLine();

        Onibus onibus = new Onibus(idAtual++, marca, ano, capacidade, tipo);
        garagem.adicionarVeiculo(onibus);
    }

    static void cadastrarMetro() {
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        System.out.print("Número de vagões: ");
        int vagoes = scanner.nextInt();
        System.out.print("Tem ar-condicionado? (true/false): ");
        boolean ar = scanner.nextBoolean();

        Metro metro = new Metro(idAtual++, marca, ano, vagoes, ar);
        garagem.adicionarVeiculo(metro);
    }

    static void executarAcao() {
        System.out.print("Digite o ID do veículo para executar ação: ");
        int idBusca = scanner.nextInt();
    
        for (Veiculo v : garagem.veiculos) {
            if (v.id == idBusca) {
                System.out.print("Deseja abrir as portas? (true/false): ");
                boolean abrirPortas = scanner.nextBoolean();
                if (abrirPortas) {
                    if (v instanceof Onibus) {
                        ((Onibus) v).abrirPortas();
                    } else if (v instanceof Metro) {
                        System.out.println("Portas do metrô abertas.");
                    }
                }
    
                System.out.print("Quantos passageiros embarcaram? ");
                int embarcar = scanner.nextInt();
                if (v instanceof Metro) {
                    ((Metro) v).embarcarPassageiros(embarcar);
                } else {
                    System.out.println(embarcar + " passageiros embarcaram no ônibus.");
                }
    
                System.out.print("Quantos passageiros desembarcaram? ");
                int desembarcar = scanner.nextInt();
                if (v instanceof Metro) {
                    ((Metro) v).desembarcarPassageiros(desembarcar);
                } else {
                    System.out.println(desembarcar + " passageiros desembarcaram do ônibus.");
                }
    
                System.out.print("Deseja fechar as portas? (true/false): ");
                boolean fecharPortas = scanner.nextBoolean();
                if (fecharPortas) {
                    if (v instanceof Onibus) {
                        ((Onibus) v).fecharPortas();
                    } else if (v instanceof Metro) {
                        System.out.println("Portas do metrô fechadas.");
                    }
                }
    
                return;
            }
        }
    
        System.out.println("Veículo com ID " + idBusca + " não encontrado.");
    }       
}


