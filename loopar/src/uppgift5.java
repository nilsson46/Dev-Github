import java.util.Random;
import java.util.Scanner;

public class uppgift5 {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int gameMode;
        int randomNumber = 0;
        System.out.println("Gissa rätt slumpat nummer.\n Välj svårighetsgrad \n 1 = Lätt(1-10) \n 2 = Medel(1-100) \n 3 = Svår(1-1000)");
        gameMode = scanner.nextInt();


        if( gameMode == 1) {
            randomNumber = random.nextInt(10) + 1;
            System.out.println("Din gissning(1-10): ");
        } else if (gameMode == 2) {
            randomNumber = random.nextInt(100) + 1;
            System.out.println("Din gissning(1-100): ");
        } else if (gameMode == 3) {
            randomNumber = random.nextInt(1000) + 1;
            System.out.println("Din gissning(1-1000): ");
        }

        //System.out.println("Nummret: " + randomNumber);
        while(true) {

            int playerGuess = scanner.nextInt();

            System.out.println("");

            if (playerGuess == randomNumber) {
                System.out.println("WOW! Du gissade rätt");

                break;
            } else if (playerGuess > randomNumber) {
                System.out.println("Tyvärr fel... Siffran är lägre. Gissa igen");
            } else if (playerGuess < randomNumber) {
                System.out.println("Ajdå... det var fel. Siffran är högre. Gissa igen");
            }
        }

    }
}