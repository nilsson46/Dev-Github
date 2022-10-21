import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static OutPrint outPrint = new OutPrint();
    UnloadingPlace unloadingPlace = new UnloadingPlace();

    public void menu() {
        List<Vehicle> vehicleList = new ArrayList<>();

        boolean quit = false;
        while (!quit) {
            Scanner scanner = new Scanner(System.in);
            outPrint.FirstMenu();
            int choiceOfAction = scanner.nextInt();

            if (choiceOfAction == 1) {
                System.out.println(vehicleList.get(0)+ " " + unloadingPlace.getBays().get(0).getBayName());
                System.out.println(vehicleList.get(1) + " " + unloadingPlace.getBays().get(1).getBayName());
                System.out.println(vehicleList.get(2) + " " + unloadingPlace.getBays().get(2).getBayName());
                System.out.println(vehicleList.get(3) + " " + unloadingPlace.getBays().get(3).getBayName());
                System.out.println(vehicleList.get(4) + " " + unloadingPlace.getBays().get(4).getBayName());
            } else if (choiceOfAction == 2) {

                outPrint.secondMenu();

                Vehicle vehicle = null;
                int choiceOfTruck = scanner.nextInt();
                if (choiceOfTruck == 1) {
                    vehicle = new Van("Van");
                    vehicleList.add(vehicle);
                }
                if (choiceOfTruck == 2) {
                    vehicle = new SmallTruck("SmallTruck");
                    vehicleList.add(vehicle);

                } else if (choiceOfTruck == 3) {
                    vehicle = new HeavyTruck("HeavyTruck");
                    vehicleList.add(vehicle);
                }
                if (vehicle != null) {

                    System.out.println("Vikt på lastbilen :");
                    int weight = scanner.nextInt();
                    vehicle.setWeight(weight);

                    System.out.println("Lastbil registrerad för kaj " + unloadingPlace.getBays().get(0).getBayName());
                }
            } else if (choiceOfAction == 3) {
                quit = true;
                System.out.println("Tack för besöket. Ha en bra dag!");
            }
        }
    }
}

