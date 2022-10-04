import java.util.HashMap;
import java.util.Map;

public class Maps {

        public static void main(String[] args) {
            /*Map<String, String> monthDictionary = new HashMap<>();

            monthDictionary.put("Januari", "January");

            System.out.println(monthDictionary.get("Januari"));*/
        Map<String, String> encryptions = new HashMap<>();

        // Create operations
            encryptions.put("hey","545454");
            encryptions.put("abc","91ik");
            //read operation
            System.out.println(encryptions.get("abc"));

            for (String key : encryptions.keySet()){
                System.out.println("key: " + key);
                System.out.println("Value: " + encryptions.get(key));

            }

            //update operations
            encryptions.put("hey", "qiopwrei1");
            System.out.println(encryptions);

            //Delete operations

            String removedEncryptions = encryptions.remove("hey");

            System.out.println("Removed: " +removedEncryptions);
        }
    }

