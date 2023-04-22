package edu.matheus.primeirasemana;

public class OperadoresString {
    public static void main(String[] args) {
        String nomeCompleto = "Matheus " + "Moreira";

        System.out.println(nomeCompleto);

        String concatenador;

        concatenador = 1 + 1 + 1 + "1";

        System.out.println(concatenador);
        
        concatenador = 1 + 1 + "1" + 1;

        System.out.println(concatenador);
        
        concatenador = 1 + "1" + 1 + 1;

        System.out.println(concatenador);
        
        concatenador = "1" + (1 + 1 + 1);

        System.out.println(concatenador);
        
    }
}
