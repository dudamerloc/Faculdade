package Faculdade.Java.Aula12;

import java.io.BufferedReader; //Permite escrever texto em um arquivo
import java.io.FileReader; //Cria ou abre um arquivo para gravação
import  java.io.IOException; //Representa erros de entrada/saida, como falhas ao acessar o arquivo

public class LerArquivo {
    public static void main(String[]args) {
        String nomeArquivo = "Saida.txt";

        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println("Linha lida: " + linha);
                }
            }catch(IOException e){
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        }
    }
