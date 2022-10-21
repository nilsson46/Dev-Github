import java.util.List;

public abstract class Vehicle {
    private int weight;
    private String typeOfTruck;

    public Vehicle(String typeOfTruck) {
        this.typeOfTruck = typeOfTruck;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getTypeOfTruck() {
        return typeOfTruck;
    }

    @Override
    public String toString() {
        return typeOfTruck + " " + weight + "kg"; /*"weight='" + weight + '\'' +
                ", typeOfTruck='" + typeOfTruck + '\'' +
                '}';*/
    }
}