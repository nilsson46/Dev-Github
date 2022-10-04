public class Strings {
    public static void main(String[] args) {
        String fruit = "Bananer";
        String fruit2 = "Aplle";
        String fruit3 = "Citrus";
        System.out.println(fruit3.compareTo(fruit2));

        /*System.out.println("Before trim: " + fruit);
        // Tar bort mellanslagen innan och efter Bananer
        System.out.println("After trim: " + fruit.trim());

        System.out.println(fruit.compareTo("   Bananer     "));
        */
        /*char[] characters = fruit.toCharArray();

        for (int i = 0; i < fruit.length(); i++) {
            char character = characters[i];

            if(character != ' ') {
                System.out.println(character);
            }

        }*/


        /*char [] characters = fruit.toCharArray();

        for (int i = 0; i < characters.length ; i++) {
            System.out.println(characters[i]);

        }

        for(char character : fruit.toCharArray()){
            System.out.println(character);
        }*/
    }
}
