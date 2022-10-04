import java.util.Random;
import java.util.Scanner;

public class intro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Minsta värde:");
        int min = Integer.parseInt(scanner.next());
        System.out.println("Största värde:");
        int max = Integer.parseInt(scanner.next());

        int result = throwDice(20);
        System.out.println(result);
    }

    public static int throwDice(int size){
        int result = throwDice(size, 4, 20);
        return result;
    }

    public static int throwDice(int size, int min, int max) {
        if(size <min){
            size=min;
            System.out.println(size + " was to low, reset to size 4");
        } else if (size>max){
            size =max;
            System.out.println(size + "was to great, reset to size 20");
        }

        Random random = new Random();
        int result = random.nextInt(size) + 1;

            return result;

        }
    }

