import java.util.Scanner;

public class JavaCalculatorScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hey, and welcome to my calculator!\n Enter the first digit: ");

        int first = scanner.nextInt();

        System.out.println("Enter the second digit: ");

        int second = scanner.nextInt();

        int plus = first + second;

        int minus = first - second;

        int multiply = first * second;

        int divide = first / second;

        System.out.println("Summation for " + first + " and " + second
        + " is: " + plus);

        System.out.println("Subtraction for " + first + " and " + second
        + " is: " + minus);

        System.out.println("Multiplication for " + first + " and " + second
        + " is: " + multiply);

        System.out.println("Division for " + first + " and " + second
        + " is: " + divide);

    }
}

