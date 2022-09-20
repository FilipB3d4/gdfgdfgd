package zadania2;

import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        double x,ciezar;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj mase: ");
        x = keyboard.nextDouble();
        ciezar=x*9.8;
        if(ciezar>=1000){
            System.out.println("Obiekt jest zbyt ciezki");
        }
        if(ciezar<=10){
            System.out.println("Obiekt jest za lekki");
        }
        if(x>=11 && x<=999){
            System.out.println("Obiekt ma dobra wage");
        }
    }
}
