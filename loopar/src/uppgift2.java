import java.util.Scanner;

public class uppgift2 {
    public static void main(String[] args) {
        int year;

        Scanner scanner = new Scanner(System.in);
        String again;
        do {
            System.out.println("Skriv valfritt årtal för att se om det är ett skottår eller ej: ");

            year = scanner.nextInt();

            if (year % 4 == 0 ) {
                System.out.println(year + " Är ett skottår");
            } else {
                System.out.println(year +" Är inte ett skottår");
            }

            System.out.println("Vill du testa ett nytt årtal? (j/n)");
            again = scanner.next();
        }while ( again.equals("j"));
    }
}


