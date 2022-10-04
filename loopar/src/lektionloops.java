import java.util.Scanner;

public class lektionloops {
    public static void main(String [] args) {

        //for( int i = 1; i <= 10 ; i++) {
        //System.out.println("Välkommen till en loop");
        //}

        String again;

        //while ( again.equals("j") ){
        Scanner scanner = new Scanner(System.in);
       do {
        System.out.println("Välj en multiplikationstabell: ");
        int choosenNumber = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i <= 10; i++) {
            int answer = i * choosenNumber;
            System.out.println(i + "*" + choosenNumber + "=" + answer);
        }

        System.out.println("Vill du se en tabell till? (j/n)");
        again = scanner.nextLine();
    } while ( again.equals("j") );

    }
}
