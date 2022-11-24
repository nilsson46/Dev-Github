public abstract class Bay {

    private Vehicle vehicle;
    private String bayName;


    protected Bay(String bayName) {
        this.vehicle = null;
        this.bayName = bayName;

    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getBayName() {
        return bayName;
    }


}
