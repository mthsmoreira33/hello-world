package edu.matheus.primeirasemana;

public class Equals {
    public static void main(String[] args) {
        String nomeUm = "Matheus";
        String nomeDois = new String("Matheus");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));
    }
}
