package zadania2;

import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        int x;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbe x: ");
        x = keyboard.nextInt();
        if (x == 10) {
            System.out.println("X");
        }
        if (x == 9) {
            System.out.println("IX");
        }
        if (x == 8) {
            System.out.println("VIII");
        }
        if (x == 7) {
            System.out.println("VII");
        }
        if (x==6) {
            System.out.println("VI");
        }
        if (x==5) {
            System.out.println("V");
        }
        if (x==4) {
            System.out.println("IV");
        }
        if (x==3) {
            System.out.println("III");
        }
        if (x==2) {
            System.out.println("II");
        }
        if (x==1) {
            System.out.println("I");
        }
        if (x==0) {
            System.out.println("Blad");
        }
        }
}
