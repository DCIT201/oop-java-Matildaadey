public class Car extends Vehicle {
    private double baseRentalRate;

    public Car(String vehicleId, String model, double baseRentalRate, int days) {
        super(vehicleId, model, baseRentalRate, days);
        this.baseRentalRate = baseRentalRate;
    }

    public void calculateRentalCost(int days) {
        System.out.println(baseRentalRate * days);
    }

    public boolean isAvailableForRental() {
        return geIsAvailableForRental();
    }

}
