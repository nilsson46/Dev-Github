import java.util.Scanner;

public class Main {

    //Startpunkt
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey, What is your name?");

        String name = scanner.next();

        System.out.println("Hey " + name);

        //System.out.println(name + " Is a beautiful name");

        System.out.println("So " + name + " What is your address?");

        String address = scanner.next();

        System.out.println(name + " What is your phone number?");

        String phoneNumber = scanner.next();

        System.out.println(name + '\n' + address + '\n' + phoneNumber);





    }


}