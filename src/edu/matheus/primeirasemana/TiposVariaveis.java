package edu.matheus.primeirasemana;

public class TiposVariaveis {
    public static void main(String[] args) {
        //tipos inteiros
        byte timeDeFutebol = 11; //-128 até 127
        short paisesMundo = 193;
        int populacaoBrasil = 220000000;
        long celulasCorpoHumano = 37000000000000L;

        //tipos float
        float alturaMichaelJordan = 1.96F;
        double preco = 200.50;

        System.out.println("Quantas jogadores titulares tem num time de futebol: " + timeDeFutebol + "\n Países reconhecidos pela ONU: " + paisesMundo + "\n População do Brasil: " + populacaoBrasil + "\n Células no Corpo Humano: " + celulasCorpoHumano + "\n Altura do Michael Jordan: " + alturaMichaelJordan + "\n Preço: R$" + preco);
    }
}
