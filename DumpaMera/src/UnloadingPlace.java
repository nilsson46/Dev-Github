import java.util.ArrayList;
import java.util.List;

public class UnloadingPlace {
    private List<Bay> bays;
    private Bay bayA = new VanBay("A");
    private Bay bayB = new VanBay("B");
    private Bay bayC= new VanBay("C");
    private Bay bayD = new VanBay("D");
    private Bay bayE = new VanBay("E");



    Vehicle vehicle;
    public UnloadingPlace() {
        bays = new ArrayList<>();
        bays.add(bayA);
        bays.add(bayB);
        bays.add(bayC);
        bays.add(bayD);
        bays.add(bayE);
    }

    public List<Bay> getBays() {
        return bays;
    }

    public void addVehicle(Vehicle vehicle) {

        for (Bay bay : bays) {
            if (bay.getBayName().equals("A") && vehicle.getWeight()<5000)  {
                bayA.setVehicle(vehicle);
                break;
            } else if (bay.getBayName().equals("B") && vehicle.getWeight()<3000){
                bayB.setVehicle(vehicle);
                break;
            } else if (bay.getBayName().equals("C") && vehicle.getWeight()< 9000)  {
                bayC.setVehicle(vehicle);
                break;
            } else if (bay.getBayName().equals("D")) {
                bayD.setVehicle(vehicle);
                break;
            } else if (bay.getBayName().equals("E")) {
                bayE.setVehicle(vehicle);
                break;
            }
        }
    }
}

