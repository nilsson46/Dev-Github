import java.util.Random;
import java.util.Scanner;

public class dice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int userScore = 0;
        int cpuScore = 0;
        String again;

        do {
            System.out.println("Välkommen till en härlig omgång av tärning mot CPU:n.\n Hur många rundor vill du kasta?");
            int rounds = scanner.nextInt();

            int userDice = 0;
            int cpuDice = 0;


            for (int i = 0; i < rounds; i++) {
                userDice = random.nextInt(6) + 1;
                cpuDice = random.nextInt(6) + 1;

                if (cpuDice > userDice) {
                    cpuScore += 1;
                } else if (cpuDice < userDice) {
                    userScore += 1;
                }
            }

            System.out.println("Antalet prickar på alla tärningar som du kastade:" + userDice);
            System.out.println("Totala antalet rundor du vann:" + userScore);
            System.out.println("CPU antal prickar på tärningarna datorn kastade:" + cpuDice);
            System.out.println("Totala antalet rundor datorn vann: " +cpuScore);

            if (cpuScore > userScore) {
                System.out.println("Datorn vann tyvärr över dig...");

            } else if (cpuScore < userScore) {
                System.out.println("Grattis du vann över datorn!!!");
            } else {
                System.out.println("Du fick samma resultat som datorn :/");
            }

            System.out.println("Vill du kasta igen?(j/n)");
            again = scanner.next();
        }while (again.equals("j")) ;




    }
}
