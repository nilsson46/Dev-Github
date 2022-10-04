import java.util.Scanner;

public class uppgift {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean amIDone = true;
        System.out.println("Hej och välkommen");

        while(amIDone) {

            System.out.println("""
                    Välj ett av följande alternativ:\s
                     1. Addera två tal\s
                     2. Räkna bokstäver i en sträng
                     3. Spegelvänd en sträng\s
                     4. Summera alla tal i en sträng\s
                     5. Klar""");

            int choiceOfAction = scanner.nextInt();

            if (choiceOfAction == 1) {

                System.out.println("Vilka tal vill du addera?");

                addNumbers();

            } else if (choiceOfAction == 2) {
                System.out.println("Skriv önskat ord och få reda på hur många bokstäver det är");

                writtenWord();

            } else if (choiceOfAction == 3) {

                System.out.println("Skriv önskad text: ");

                mirroredWord();


            } else if (choiceOfAction == 4) {
                System.out.println("Vilka tal vill du summera?");
                sumOfNumbers();

            } else if (choiceOfAction == 5) {

                System.out.println("Ha det bra :D");
                amIDone = false;
            }
        }
    }

     static void addNumbers() {
        Scanner userNumber = new Scanner(System.in);
        System.out.println("Första numret: ");
        int firstUserNumber = userNumber.nextInt();
        System.out.println("Andra numret: ");
        int secondUserNumber = userNumber.nextInt();
        int sumOfNumbers = firstUserNumber + secondUserNumber;

        System.out.println("Det totala värdet är: " + sumOfNumbers);
    }

    static void writtenWord() {
        Scanner userWord = new Scanner(System.in);
        String input = userWord.nextLine();
        int lengthOfWord = input.length();
        System.out.println("Ordet innehåller " + lengthOfWord + " bokstäver");

    }

    static void mirroredWord() {
        Scanner userWord = new Scanner(System.in);
        String input = userWord.nextLine();
        String wordInReverse ="";
        for(int i=input.length();i>0;--i){
            wordInReverse = wordInReverse + (input.charAt((i-1)));
        }
        System.out.println("Baklängesen blir ordet: " + wordInReverse);
            mirroredWord();

    }

    static void sumOfNumbers(){
        Scanner userNumbers = new Scanner(System.in);
        String input = userNumbers.nextLine();
        int sum = 0;

        for (int i = 0; i <input.length() ; i++) {
            if(Character.isDigit(input.charAt(i)))
                sum=sum+Character.getNumericValue(input.charAt(i));

        }
        System.out.println("Summan blir : " + sum);
    }
}


