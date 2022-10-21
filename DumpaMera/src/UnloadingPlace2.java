import java.util.ArrayList;
import java.util.List;

public class UnloadingPlace2 {
    public List<String> station = new ArrayList<>();
    public List<Vehicle> ramp = new ArrayList<>();

    public String unloadingPlace (){
        station.add("A");
        station.add("B");
        station.add("C");
        station.add("D");
        station.add("E");

        for(int i = 0; i <5; i++){
            ramp.add(null);
        }
        return unloadingPlace();
    }
}
