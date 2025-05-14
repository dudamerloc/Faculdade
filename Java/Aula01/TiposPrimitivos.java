package Faculdade.Java.Aula01;

public class TiposPrimitivos {
    public static void main(String[] args){
        byte valorByte = 127;
        short valorShort = 3200;
        int valorInt = 2147483647;
        long valorLong = 9223372036854775807L;

        float valorFloat = 3.14f;
        double valorDouble = 3.1415926535;

        char valorChar = 'A';
        boolean valorBooleano = true;

        System.out.println("=== Demonstração de Tipos Primitivos ===");
        System.out.println("Byte: " + valorByte);
        System.out.println("Short: " + valorShort);
        System.out.println("Int: " + valorInt);
        System.out.println("Long: " + valorLong);
        System.out.println("Float: " + valorFloat);
        System.out.println("Double: " + valorDouble);
        System.out.println("Char: " + valorChar);
        System.out.println("Boolean: " + valorBooleano);
    } 
}
