import java.util.*;

public class Collections {
    public static void main(String[] args) {

        Iterable iter;
        Collections coll;

        Set set;
        List list;
        Queue que;
        Map map;

        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Albin");
        nameList.add("Yin");
        nameList.add("Sofie");
        nameList.add("Fredrik");



        /*String[] names = new String[5];
        names[0] = "Albin";
        names[1] = "Yin";
        names[2] = "Sofie";
        names[4] = "Fredrik";

        System.out.println(names[2]);

        System.out.println(names.length);

        for (String name : nameList) {
            System.out.println(name);
        }

        for(String name : names){
            System.out.println(name);
        }*/



        //System.out.println(names[2]);

        //Fält /String[]/ Statiskt och svårt att lägga till.

        int index = 0;

        boolean found = false;

        String query = "Fredrik";

        found = nameList.contains(query);

        /*while (index < ((ArrayList<String>) nameList).size && !found) {
            String name = nameList.get(index);
            if (name[index].equals(query)) {
                found = true;
            } else {
                index++;
            }
        }*/
        System.out.println("Found name: " + found);

        //isEmpty()
        System.out.println("Is list empty? " + nameList.isEmpty());

        //remowe(element)

        System.out.println(nameList.get(2));
        nameList.remove("Yin");
        System.out.println(nameList.get(2));

        //clear
        nameList.clear();
        System.out.println("Is list empty? " + nameList.isEmpty());
    }
}