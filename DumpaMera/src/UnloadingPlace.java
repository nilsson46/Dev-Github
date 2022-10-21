import java.util.ArrayList;
import java.util.List;

public class UnloadingPlace {
    private List<Bay> bays;
    Vehicle vehicle;
    Van van;
    public UnloadingPlace() {
        bays = new ArrayList<>();
        bays.add(new VanBay("A"));
        bays.add(new VanBay("B"));
        bays.add(new SmallTruckBay("C"));
        bays.add(new SmallTruckBay("D"));
        bays.add(new HeavyTruckBay("E"));
    }

    public List<Bay> getBays() {
        return bays;
    }

    public void addVehicle(Vehicle vehicle) {

        for (Bay bay : bays) {
            if (bay.getBayName().equals("A") && vehicle.getWeight()<5000)  {
                addVehicle(vehicle);
            } else if (bay.getBayName().equals("B")) {
                addVehicle(vehicle);
            } else if (bay.getBayName().equals("C") && vehicle.getWeight()< 9000)  {
                addVehicle(vehicle);
            } else if (bay.getBayName().equals("D")) {
                addVehicle(vehicle);
            } else if (bay.getBayName().equals("E")) {
                addVehicle(vehicle);
            }
        }
    }
}