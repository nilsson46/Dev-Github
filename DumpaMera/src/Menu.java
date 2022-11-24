import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    static OutPrint outPrint = new OutPrint();
    UnloadingPlace unloadingPlace = new UnloadingPlace();

    public void menu() {

        boolean quit = false;
        while (!quit) {
            Scanner scanner = new Scanner(System.in);
            outPrint.FirstMenu();
            int choiceOfAction = scanner.nextInt();

            if (choiceOfAction == 1) {
                System.out.println(unloadingPlace.getBays().get(0).getBayName() + " - " + unloadingPlace.getBays().get(0).getVehicle());
                System.out.println(unloadingPlace.getBays().get(1).getBayName() + " - " + unloadingPlace.getBays().get(1).getVehicle());
                System.out.println(unloadingPlace.getBays().get(2).getBayName() + " - " + unloadingPlace.getBays().get(2).getVehicle());
                System.out.println(unloadingPlace.getBays().get(3).getBayName() + " - " + unloadingPlace.getBays().get(3).getVehicle());
                System.out.println(unloadingPlace.getBays().get(4).getBayName() + " - " + unloadingPlace.getBays().get(4).getVehicle());

            } else if (choiceOfAction == 2) {

                System.out.println("Vikt på lastbilen :");
                int weight = scanner.nextInt();

                outPrint.secondMenu();
                Vehicle vehicle = null;
                int choiceOfTruck = scanner.nextInt();
                if (choiceOfTruck == 1) {
                    vehicle = new Van(weight);
                    unloadingPlace.addVehicle(vehicle);
                } else if (choiceOfTruck == 2) {
                    vehicle = new SmallTruck(weight);
                    unloadingPlace.addVehicle(vehicle);

                } else if (choiceOfTruck == 3) {
                    vehicle = new HeavyTruck(weight);
                    unloadingPlace.addVehicle(vehicle);
                }
                if (vehicle != null) {


                    System.out.println("Lastbil registrerad för kaj ");
                }
            } else if (choiceOfAction == 3) {
                quit = true;
                System.out.println("Tack för besöket. Ha en bra dag!");
            }
        }
    }
}