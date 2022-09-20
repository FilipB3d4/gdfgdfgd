package zadania2;

import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
    int x,srednia;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj pierwszy wynik: ");
        x = keyboard.nextInt();
        int x2;
        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("Podaj drugi wynik: ");
        x2 = keyboard2.nextInt();
        int x3;
        Scanner keyboard3 = new Scanner(System.in);
        System.out.println("Podaj trzeci wynik: ");
        x3 = keyboard3.nextInt();
        srednia=x+x2+x3/3;
        if(srednia>=90){
            System.out.println("5");
        }
        if(srednia>=80 && srednia<=89){
            System.out.println("4");
        }
        if(srednia>=70 && srednia<=79){
            System.out.println("3");
        }
        if(srednia>=60 && srednia<=69){
            System.out.println("2");
        }
        if(srednia<=60){
            System.out.println("1");
        }
    }
}
