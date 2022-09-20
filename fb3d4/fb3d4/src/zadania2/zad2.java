package zadania2;

import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        int x,a;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj dzien: ");
        x =keyboard.nextInt();
        int x2;
        Scanner keyboard2 = new Scanner(System.in);
        System.out.println("Podaj miesiac: ");
        x2 = keyboard2.nextInt();
        int x3;
        Scanner keyboard3 = new Scanner(System.in);
        System.out.println("Podaj rok: ");
        x3 = keyboard3.nextInt();

        a=x*x2;
        if(a==x3){
            System.out.println("Data jest magiczna");
        }
        else{
            System.out.println("Data nie jest magiczna");
}

    }
}
