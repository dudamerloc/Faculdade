package Faculdade.Java.Aula05;

/*O que é um construtor?
Um construtor é um método especial dentro de uma classe que é executado automaticamente quando um objeto é criado. O objetivo do construtor é inicializar os atributos do objeto. 

Regras do construtor RM  JAVA:

Mesmo nome de classe;
 Não possui retorno nem (void)
 Executando automaticamente ao criar um objeto(new)*/

class Carro1{
    String modelo;
    int ano;

    //construtor da classe 
    public Carro1(String modelo, int ano){
        this.modelo = modelo;
        this.ano = ano;
    }

    void Imprimir(){
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);
    }
 }

public class ExemploConstrutor {
    public static void main(String[] args) {
        //criando um objeto com o construtor
        Carro1 carro = new Carro1("Civic", 2022);
        carro.Imprimir();
    }
    
}

