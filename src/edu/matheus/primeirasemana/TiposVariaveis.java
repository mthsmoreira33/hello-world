package edu.matheus.primeirasemana;

import java.util.Date;

public class TiposVariaveis {
    public static void main(String[] args) {
        //tipos inteiros
        byte timeDeFutebol = 11; //-128 até 127
        //casting
        byte timeDeFutebolCasting = (byte) timeDeFutebol;
        short paisesMundo = 193;
        //casting
        short paisesMundoCasting = (short) paisesMundo;
        int populacaoBrasil = 220000000;
        long celulasCorpoHumano = 37000000000000L;

        //tipos float
        float alturaMichaelJordan = 1.96F;
        double preco = 200.50;

        //outros tipos
        Date hoje = new Date();

        System.out.println("Quantas jogadores titulares tem num time de futebol: " + timeDeFutebolCasting + "\n Países reconhecidos pela ONU: " + paisesMundoCasting + "\n População do Brasil: " + populacaoBrasil + "\n Células no Corpo Humano: " + celulasCorpoHumano + "\n Altura do Michael Jordan: " + alturaMichaelJordan + "\n Preço: R$" + preco + "\n Data de hoje: " + hoje);
    }
}
