public abstract class Vehicle {
    private int weight;
    private String typeOfTruck;

    public Vehicle(String typeOfTruck, int weight) {
        this.weight = weight;
        this.typeOfTruck = typeOfTruck;
    }

    public int getWeight() {

        return weight;
    }




    public String getTypeOfTruck() {
        return typeOfTruck;
    }

    @Override
    public String toString() {
        return typeOfTruck + " " + weight + "kg";

    }
}