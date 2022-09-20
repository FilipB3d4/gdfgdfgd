package zadania2;

import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        int x;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbe sekund: ");
        x = keyboard.nextInt();
        if(x==60){
            System.out.println("Minuta");
        }
        if(x==3600){
            System.out.println("Godzina");
        }
        if(x==86400){
            System.out.println("Dzien");
        }


    }
}
