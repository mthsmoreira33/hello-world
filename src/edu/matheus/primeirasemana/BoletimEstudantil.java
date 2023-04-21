package edu.matheus.primeirasemana;

public class BoletimEstudantil {
    public static void main(String[] args) {
        int nota = 9;
        if (nota < 6)
            System.out.println("REPROVADO");
        else if (nota == 6)
            System.out.println("RECUPERAÇÃO");

        else
            System.out.println("APROVADO");
    }
}
