import java.util.Scanner;

public class uppgift3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ber om personnummer
        String socialSecurityNumber;
        System.out.println("Skriv in ett personnummer nedan: (ÅÅMMDDXXXX)");
        socialSecurityNumber = scanner.nextLine();


        if (socialSecurityNumber.length() == 10) {
            System.out.println("Detta gick väll bra");
        } else
            System.out.println("Fel inmatning av personnummer");

        // Dela upp string i char för att multiplicera dessa siffror med 2 och 1

        //String g = "line";
        char SSN1 = socialSecurityNumber.charAt(0);
        char SSN2 = socialSecurityNumber.charAt(1);
        char SSN3 = socialSecurityNumber.charAt(2);
        char SSN4 = socialSecurityNumber.charAt(3);
        char SSN5 = socialSecurityNumber.charAt(4);
        char SSN6 = socialSecurityNumber.charAt(5);
        char SSN7 = socialSecurityNumber.charAt(6);
        char SSN8 = socialSecurityNumber.charAt(7);
        char SSN9 = socialSecurityNumber.charAt(8);
        char SSN10 = socialSecurityNumber.charAt(9);

        int int1 = Character.getNumericValue(SSN1) * 2;
        //if (int1 >9) int Modulus % 17 =7. Det som är number = (number + (number / 10)) % 10

        //String firstNumber =Integer.toString(i);
        int int2 = Character.getNumericValue(SSN2) * 1;
        int int3 = Character.getNumericValue(SSN3) * 2;
        int int4 = Character.getNumericValue(SSN4) * 1;
        int int5 = Character.getNumericValue(SSN5) * 2;
        int int6 = Character.getNumericValue(SSN6) * 1;
        int int7 = Character.getNumericValue(SSN7) * 2;
        int int8 = Character.getNumericValue(SSN8) * 2;
        int int9 = Character.getNumericValue(SSN9) * 1;
        int int10 = Character.getNumericValue(SSN10) * 2;

        // returns 'l'


        //System.out.println(int1+,int2);
        System.out.println(int2);


        // addera upp till nästa heltal efter du har slått ihop allt.
    }

}
