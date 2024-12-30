public abstract class Vehicle {

    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailableForRental;
    private int days;

    public Vehicle(String vehicleId, String model, double baseRentalRate, int days) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.days = days;
        this.baseRentalRate = baseRentalRate;
        this.isAvailableForRental = true;
    }

    abstract void calculateRentalCost(int days);

    abstract boolean isAvailableForRental();

    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public int getDays() {
        return days;
    }

    public boolean geIsAvailableForRental() {
        return isAvailableForRental;
    }

    public double getBaseRentalRate() {
        return baseRentalRate;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailableForRental = isAvailable;
    }

    public void setBaseRentalRate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
}
