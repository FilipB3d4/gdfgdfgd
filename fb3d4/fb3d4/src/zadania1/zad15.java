package zadania1;

public class zad15 {
    public static void main(String[] args) {
   String city="Warszawa";
        int dlugosc;

        dlugosc = city.length();

        char inicjal = city.charAt(0);


        System.out.println("Długość " + dlugosc);
        System.out.println(inicjal );

        String male, duze;

        male = city.toLowerCase();
        duze = city.toUpperCase();

        System.out.println(city + " " + " " + duze);
    }
}
