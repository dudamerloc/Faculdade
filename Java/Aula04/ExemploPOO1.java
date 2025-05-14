package Faculdade.Java.Aula04;

/*o que é uma classe? 
Uma classe é um modelo (molde) que define atributos (características) e métodos (ações) de um objeto.
Imagine que uma classe seja um "molde de bolo". 
Com esse molde, podemos fazer vários bolos (objetos) iguais, mas com recheios diferentes.*/

class Carro{ //Classe
    String modelo;
    int ano;

    void buzinar(){ //Método
        System.out.println("Bii Bii!");


    }
}

/*A classe Carro define o que um carro deve ter (modelo e ano) e o que ele pode fazer (buzinar()) */

/*O que é um Objeto? 
 * Um objeto é uma instância de uma classe. Ele representa um exemplo real do que foi definido no molde. 
 * Se a Classe Carro é um molde do bolo, o objeto meuCarro é um bolo feito com esse molde. */
public class ExemploPOO1 {
    public static void main(String[] args) {
        // Criando um objeto da classe carro
        Carro meuCarro = new Carro();

        //Definindo valores para os atributos 
        meuCarro.modelo = "Opala";
        meuCarro.ano = 1969;

        //Chamando um método do objeto
        meuCarro.buzinar();

        //Exibindo  valores do objeto
        System.out.println("Meu carro é um " + meuCarro.modelo + " do ano " + meuCarro.ano);

    }
}