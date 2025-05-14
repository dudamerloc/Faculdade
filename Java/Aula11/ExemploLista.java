package Faculdade.Java.Aula11;

import java.util.ArrayList;
import java.util.List;

public class ExemploLista {
    public static void main(String[] args) {
        
// Criação de uma lista
        List<String> nomes = new ArrayList<>();
        
        //Adicionando elementos a lista
        nomes.add("Duda");
        nomes.add("Victor");
        nomes.add("Julia");
        nomes.add("Felipe");
        
        // Acessando elementos pelos indices 
        System.out.println("Todos os nomes: " + nomes.get(0));
        
        //Percorrendo a lista
        System.out.println("Todos os nomes: ");
        for(String nome : nomes){
            System.out.println(nome);
        }
        
        //Verificando o tamanho da lista
        System.out.println("Tamanho da lista: " + nomes.size());
        
        // Removendo um elemento
        nomes.remove("Felipe");
        System.out.println("Nomes apóes remoção: ");
        for(String nome : nomes){
            System.out.println(nome);
        }
    }
}
