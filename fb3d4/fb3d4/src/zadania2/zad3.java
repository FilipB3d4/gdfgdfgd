package zadania2;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        int x,BMI;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wage: ");
        x = keyboard.nextInt();
        int x2;
        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("Podaj wzrost: ");
        x2 = keyboard2.nextInt();
        BMI=x/x2;
        if(BMI<=18.5){
            System.out.println("Niedowaga");
        }
        if(BMI>=25){
            System.out.println("Nadwaga");
        }


    }
}
