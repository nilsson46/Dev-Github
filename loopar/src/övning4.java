public class övning4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {


            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " Fizzbuzz" + " kan delas med både tre och fem");
            } else if (i % 3 == 0) {
                System.out.println(i + " Fizz" + " kan delas med tre");
            } else if (i % 5 == 0) {
                System.out.println(i + " Buzz" + " kan delas med fem");
            } else {
                System.out.println(i);

            }
        }

    }

}

//        Random random = new Random();
//        System.out.println("Välj svårighetsgrad: \n 1 = Lätt \n 2 = Mellan \n 3 = Svår");
//        int guesses= 0;
//        String difficulty = scanner.next();
//
//        if (difficulty = 1
//
//        //int numberEasy = random.nextInt(10);
//        //int numberMedium = random.nextInt(100);
//        //int numberHard = random.nextInt(1000);
//
//        int guess = -1; //Varför -?
//
//        while (guess!=number) {
//            System.out.println("Vad kan talet vara?");
//            guess = scanner.nextInt();
//            if (guess < number) {
//                System.out.println("Lågt... Försök igen");
//            } else if (guess > number) {
//                System.out.println("Högt... Försök igen");
//            } else {
//                System.out.println("Wow, du lyckades gissa rätt!");
//            }
//
//        }
//
//    }