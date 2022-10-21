public abstract class Bay {

    private Vehicle vehicle;
    private String bayName;


    protected Bay (String bayName){
        this.vehicle = null;
        this.bayName = bayName;

    }

    public String getBayName() {
        return bayName;
    }
}
