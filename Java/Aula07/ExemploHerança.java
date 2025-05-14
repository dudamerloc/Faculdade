package Faculdade.Java.Aula07;

// Classe mãe (superclasse) que será estendida por outras

import java.util.Scanner;

class Pessoa{
    // Atributos protected: acessíveis pelas subclasses diretamente
    protected String nome;
    protected int idade;

    // Construtor que inicializa nome e idade
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    // Método comum que será herdado e possivelmente sobrescrito
    public void apresentar(){
        System.out.println("Sou " + nome + ", tenho " + idade + " anos.");
    }
}

//Funcionario herda de Pessoa(superclasse)
class Funcionario extends Pessoa{
    protected double salario;

    //Construtor da subclase chama o construtor da superclasse com super()
    public Funcionario(String nome, int idade, double salario){
        super(nome,idade); // super: chama o construtor de classe mãe (Pessoa)
        this.salario = salario;
    }

    // Sobrescrita de métodp: altera o comportamento de apresentar()
    @Override //so0bre escrita de método
    public void apresentar(){
        super.apresentar(); // Chama o método da superclasse para reaproveitar o código
        System.out.println("Sou um funcionário e meu salário é R$: " + salario);
    }
}

// Gerente Herda de Funcionário, que Herda da classe Pessoa(herança em cadeia)
class Gerente extends Funcionario{
    private String setor;

    // Construtor que também chama o construtor da superclasse Funcionario
    public Gerente(String nome, int idade, double salario, String setor){
        super(nome, idade, salario); // Chamada em cadeia: Gerente --> Funcionario --> Pessoa
        this.setor = setor;
        }
        
        //Sobrescrita novamente do método Apresentar()
        @Override
        public void apresentar(){
            super.apresentar(); // Chama apresentar() de funcionario
            System.out.println("Atuo como gerente do setor de " + setor);
    }
}
    public class ExemploHerança {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Entrada de dados para criar o objeto gerente
            System.out.println("Digite o nome do gerente: ");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite o salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer do teclado

            System.out.println("Digite o setor: ");
            String setor = scanner.nextLine();
            
            // Instancia um objeto da subclasse Gerente
            Gerente gerente = new Gerente(nome, idade, salario, setor);

            System.out.println("\n--------Apresentação--------");

            // Chama o método apresentar() da classe Gerente
            gerente.apresentar();
            scanner.close();
        }       
    }
