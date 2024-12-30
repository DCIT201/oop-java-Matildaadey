public class Motorcycle extends Vehicle {
    private double baseRentalRate;

    public Motorcycle(String vehicleId, String model, double baseRentalRate, int days) {
        super(vehicleId, model, baseRentalRate, days);
        this.baseRentalRate = baseRentalRate;
    }

    public void calculateRentalCost(int days) {
        System.out.println(baseRentalRate * days * 0.95); // I am giving a 5% discount for all motorcycles
    }

    public boolean isAvailableForRental() {
        return geIsAvailableForRental();
    }
}
