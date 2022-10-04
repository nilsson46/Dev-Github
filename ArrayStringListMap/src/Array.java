public class Array {
        public static void main(String[] args) {
       /* String[] names = new String[10];
        names[0] ="Jakob";
        names[1] = "Anna";
        names[2] = "Berit";
        names[3] = "Kerstin";

        //System.out.println(names[0]);
        //System.out.println(names[4]);
        //System.out.println(names[100]);// array index out of bounds section.
        //System.out.println(names[1000]); // array index out of bounds section.
        for (int i = 0; i < names.length; i++) {
            if(names[i] !=null){
                System.out.println(names[i]);
            }
        }
        for (int i = 0; i < names.length; i++) {
            String name = names[i];

            if(name !=null){
                System.out.println(name);
            }
        }
        System.out.println("for each list");
        for(String name : names){
            System.out.println(name);
        }
        */
            int[] numbers = new int[10];
            numbers[0] = 2;
            numbers[1] = 136;
            numbers[5] = 2;
            numbers[7]= 64;
            // numbers --> (2, 136, 0, 0, 2, 0, 64, 0, 0)
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            System.out.println("Sum of the numbers is " + sum);
            System.out.println("Average value is " +(sum/ numbers.length));
        }

    //sout (names.get(i));
    // names.(forEach(name->{sout(name)
    // names.forEach(System.out::println);
    }

