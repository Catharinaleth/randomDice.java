package com.company;

public class Raflebæger {
    Terning[] terninger;

    Raflebæger(int antalTerninger) { //konstruktør
        terninger = new Terning[antalTerninger];//new er objekter, her har vi terning som er objekt
        for (int i = 0; i < terninger.length ; i++) {
            terninger[i] = new Terning(6);

        }
    }
    void ryst() {
        for(Terning t : terninger) {
            t.kast();
        }
    }
    int sum() {
        int resultat = 0;
        for(Terning t : terninger) {
            resultat += t.getVærdi();
            //System.out.println(resultat);
        }
        return resultat;
    }
    boolean erDerSlåetEn(int slag) { // søgning

        for (int i = 0; i < terninger.length; i++) {
            if (terninger[i].getVærdi() == slag) {
                return true;
            }
        }
         return false;
    }

  //  String resultat () {
    //    String res = "";
   // }
}
