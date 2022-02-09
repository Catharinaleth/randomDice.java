package com.company;
import java.util.Random;

public class Terning {
    // et slag, som har en defualt på 0:
    int slag;
    int sider;


    public Terning(int antalSider) {   //konstruktør med parameter
        sider = antalSider;
    }
    //Definerer en metode for et random kast:
     void kast() { // kan også hedde public static int etc..
        Random r = new Random();
        slag = r.nextInt(6)+1;
         System.out.println("kast() kaldt" + slag);
          // return random;
    }

    //metode som returnere slag værdien
    int getVærdi() {
        return slag;
    }

    int getSider() {
        return sider;
       // return side1 + side2 + side3 + side4;
    }

}



