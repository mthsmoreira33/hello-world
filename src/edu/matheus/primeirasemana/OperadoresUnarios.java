package edu.matheus.primeirasemana;

public class OperadoresUnarios {
    public static void main(String[] args) {
        int positivo = + 5;
        int negativo = - 4;

        System.out.println(- positivo);
        System.out.println(negativo * (-1));

        int numero = 5;
        numero++;

        System.out.println(numero);
        System.out.println(numero++); //imprime primeiro o numero e depois incrementa
        System.out.println(++numero); //incrementa primeiro depois imprime

        boolean booleano = true;

        System.out.println(!booleano);
        System.out.println(booleano);

        booleano = !booleano;

        System.out.println(booleano);

    }
}
