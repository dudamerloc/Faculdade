package Faculdade.Java.Aula06.ExerciciosdaAula;

/*1. Criar uma classe Livro com os atributos:

título: (String)
páginas: (Int)
disponível: (Boolean)

Os atributos  devem ser privados, e vocês deverão:
Criar os métodos GET para acessar os valores, inicializar os valores no main( ) usando o construtor e exibir as informações do livro usando apenas os métodos GET.

Saída esperada:
Título: 
Total de páginas:
Status: */

import java.util.Scanner; // Importa a classe Scanner, que será usada para ler entradas do usuário

class Livro {
    private String titulo;  // Atributo privado que armazena o título do livro
    private int numeroPag;  // Atributo privado que armazena o número de páginas do livro
    private boolean disponivel; // Atributo privado que indica se o livro está disponível

    // Construtor que recebe os valores do título, número de páginas e disponibilidade
    public Livro(String titulo, int paginas, boolean disponivel){
        this.titulo = titulo;       // Inicializa o atributo 'titulo' com o valor fornecido
        this.numeroPag = paginas;  // Inicializa o atributo 'numeroPag' com o valor fornecido
        this.disponivel = disponivel;  // Inicializa o atributo 'disponivel' com o valor fornecido
    }

    // Getter para obter o título do livro
    public String getTitulo(){
        return titulo; // Retorna o valor do atributo 'titulo'
    }

    // Getter para obter o número de páginas do livro
    public int getNumeroPag(){
        return numeroPag; // Retorna o valor do atributo 'numeroPag'
    }

    // Getter para verificar se o livro está disponível
    public boolean disponivel(){
        return disponivel; // Retorna o valor do atributo 'disponivel'
    }
}

public class Biblioteca{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler entradas do usuário

        // Solicita ao usuário para digitar o título do livro
        System.out.println("Digite o título do livro: ");
        String titulo = scanner.nextLine(); // Lê o título do livro fornecido pelo usuário

        // Solicita ao usuário para digitar o número de páginas do livro
        System.out.println("Digite o número de páginas: ");
        int numeroPag = scanner.nextInt(); // Lê o número de páginas fornecido pelo usuário

        // Solicita ao usuário para informar se o livro está disponível
        System.out.println("O livro está disponível? (true/false)");
        boolean disponivel = scanner.nextBoolean(); // Lê o valor booleano (true/false) sobre a disponibilidade do livro

        // Cria um objeto 'livro' da classe Livro, passando os valores informados pelo usuário
        Livro livro = new Livro(titulo, numeroPag, disponivel);

        // Exibe as informações do livro utilizando os métodos getters
        System.out.println("\n=== Informações do livro ===");
        System.out.println("Título: " + livro.getTitulo()); // Exibe o título do livro utilizando o getter getTitulo()
        System.out.println("Total de páginas: " + livro.getNumeroPag()); // Exibe o número de páginas utilizando o getter getNumeroPag()

        // Verifica se o livro está disponível e exibe a mensagem correspondente
        if(livro.disponivel()){ // Chama o método disponivel() para verificar se o livro está disponível
            System.out.println("Status: Disponível para empréstimo"); // Se disponível, exibe essa mensagem
        } else {
            System.out.println("Status: Indisponível"); // Caso contrário, exibe essa mensagem
        }

        scanner.close(); // Fecha o scanner para liberar os recursos
    }
}
