package zadania1;

import java.util.Scanner;

public class zad16 {
    public static void main(String[] args) {
    Scanner klawiatura = new Scanner(System.in);
    double calosc,podatek,napiwek,cena;
        System.out.println("cena za posilek: ");
        cena=klawiatura.nextInt();
        klawiatura.nextLine();
        podatek=0.0675;
        napiwek=0.20;
        calosc=cena*(podatek+napiwek);
        System.out.println(calosc);
        System.out.println(podatek*cena);
        System.out.println(napiwek*cena);
    }
}
