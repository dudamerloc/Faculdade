package Faculdade.Java.AtividadesPraticas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

interface Emprestavel {
    void emprestar() throws LivroIndisponivelException;
    void devolver();
}

class LivroDuplicadoException extends Exception {
    public LivroDuplicadoException(String mensagem) {
        super(mensagem);
    }
}

class LivroIndisponivelException extends Exception {
    public LivroIndisponivelException(String mensagem) {
        super(mensagem);
    }
}

class Livro implements Emprestavel {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true; 
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    @Override
    public void emprestar() throws LivroIndisponivelException {
        if (!disponivel) {
            throw new LivroIndisponivelException("Livro já está emprestado.");
        }
        disponivel = false;
        System.out.println("Livro emprestado com sucesso!");
    }

    @Override
    public void devolver() {
        disponivel = true;
        System.out.println("Livro devolvido com sucesso!");
    }

    public void exibirDados() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponível: " + (disponivel ? "Sim" : "Não"));
        System.out.println("----------------------------");
    }
}

public class Atividade03SistemaBiblioteca {
    static Scanner scanner = new Scanner(System.in);
    static Map<String, Livro> livros = new HashMap<>();
    static Set<String> isbnsRegistrados = new HashSet<>();

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("\n--- Sistema de Biblioteca ---");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Emprestar Livro");
            System.out.println("3. Devolver Livro");
            System.out.println("4. Listar Todos os Livros");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa buffer

            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    emprestarLivro();
                    break;
                case 3:
                    devolverLivro();
                    break;
                case 4:
                    listarLivros();
                    break;
                case 5:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }

    static void cadastrarLivro() {
        try {
            System.out.print("Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Autor: ");
            String autor = scanner.nextLine();
            System.out.print("ISBN: ");
            String isbn = scanner.nextLine();

            if (isbnsRegistrados.contains(isbn)) {
                throw new LivroDuplicadoException("ISBN já cadastrado!");
            }

            Livro livro = new Livro(titulo, autor, isbn);
            livros.put(isbn, livro);
            isbnsRegistrados.add(isbn);
            System.out.println("Livro cadastrado com sucesso!");
        } catch (LivroDuplicadoException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    static void emprestarLivro() {
        System.out.print("Digite o ISBN do livro: ");
        String isbn = scanner.nextLine();
        Livro livro = livros.get(isbn);

        if (livro != null) {
            try {
                livro.emprestar();
            } catch (LivroIndisponivelException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    static void devolverLivro() {
        System.out.print("Digite o ISBN do livro: ");
        String isbn = scanner.nextLine();
        Livro livro = livros.get(isbn);

        if (livro != null) {
            livro.devolver();
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    static void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (Livro livro : livros.values()) {
                livro.exibirDados();
            }
        }
    }
}
