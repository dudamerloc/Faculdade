package Faculdade.Java.Aula11;

/*
Um Map é uma estrutura que armazena pares de chaves e valor
Cada chave é unica(não pode se repetir)
Pode ser pensado como um Dicionário
*/

import java.util.HashMap;
import java.util.Map;
public class ExemploMap {
    public static void main(String[]args){
    //Criando um Map onde a chave é String (nome) e o valor Integer(idade)
        Map<String, Integer> pessoas = new HashMap<>();

    //Add Elementos
        pessoas.put("Duda", 19);
        pessoas.put("Victor", 19);
        pessoas.put("Julia", 20);
    //Posso atualizar a idade da Ana
        pessoas.put("Victor", 20);

    //Imprimindo Map
        System.out.println("Lista de pessoas: ");
        for(String nome : pessoas.keySet()){
            Integer idade = pessoas.get(nome);
            System.out.println(nome + "-" + idade + " anos");
        }
    //Verificando se uma pessoa está no Map
        if (pessoas.containsKey("Duda")){
            System.out.println("Duda está cadastrada!");
        }
    //Removendo uma pessoa
        pessoas.remove("Julia");

    //Mostrando o tamanho do Map
        System.out.println("Quantidade de pessoas cadastradas: " + pessoas.size());
    }
}
