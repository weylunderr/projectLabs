package org.fasttrackit.catel;

public class TamagotchiGame {
    public static void main (String[] args){


        Catel dog1 = new Catel();
        // crearea unei instante ??
        // initializat cu null, orice string in java incepe cu null


         dog1.setName("Rex");


         // alt catel

        Catel dog2 = new Catel();
        dog2.setName("Maximilianus");


        // cum lucreaza clasele in memorie
        // aloca zone de memorie pentru fiecare clasa

        for ( int zi=0; i<15; zi++) {
            dog2.mananca();
            // dog are greutate i; varsta 0;
            // la 10 kg are 1 an lmao
            System.out.println(dog2.getVarsta());
            System.out.println("-------------------");

        }

        // tiparim pe ecran ce varsta are la sfarsit


        System.out.println("Catelul"+dog2.getName()+ " are varsta " + dog.getVarsta());

    }
}
