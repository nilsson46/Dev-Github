import java.util.Arrays;
import java.util.Scanner;

public class ArrayÖvning1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5];


        for (int i = 0; i < names.length; i++) {
            System.out.println("Skriv in namn:");
            names[i] = scanner.nextLine();
        }



            System.out.println(Arrays.toString(names));
            //System.out.println(names[(names.length- 1)-i]);
        }

        /*for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);*/


    }



