package zadania1;

import java.util.Scanner;

public class zad17 {
    public static void main(String[] args) {
        double cena,ilosc,prowizja,calosc,broker,r;
        ilosc=600;
        cena=21.77;
        broker=0.02;
        calosc=ilosc*cena;
        prowizja=calosc*broker;
        r=calosc-prowizja;
        System.out.println(calosc);
        System.out.println(prowizja);
        System.out.println(r);
    }
}
