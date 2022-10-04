
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayÖvning2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> goods = new ArrayList<>();
        String inputGoods ="";
        //int sizeOfGoods = Integer.parseInt(inputGoods);
        //Måste få in en int som räknar antalet i listan för att kunna avsluta vid 10. kanske number of strings in list eller något

        /*goods.add("Äpplen");
        goods.add("Bananer");
        goods.add("Mjölk");*/

        while (!inputGoods.equalsIgnoreCase("DONE")) {
            System.out.println("Vilken vara vill du lägga till?");
            inputGoods = scanner.nextLine();
            //kanske size redan här?
            if (inputGoods.equalsIgnoreCase("DONE")) {
            } else {

                goods.add(inputGoods);

            }
            if (inputGoods.length()<=10) {
                System.out.println("Varukorgen är full!");
            } else {

                System.out.println("Här är dina varor: ");
                for (int i = 0; i < goods.size(); i++) {
                    System.out.println(goods.get(i));
                }
            }

        }

    }
}

