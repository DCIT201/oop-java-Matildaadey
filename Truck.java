public class Truck extends Vehicle {
    private double baseRentalRate;

    public Truck(String vehicleId, String model, double baseRentalRate, int days) {
        super(vehicleId, model, baseRentalRate, days);
        this.baseRentalRate = baseRentalRate;
    }

    public double calculateRentalCost(int days) {
        System.out.println(baseRentalRate * days * +25); // an additional 25 cedis is added for tax and servicing fee
                                                         // for the trucks
        return days;
    }

    public boolean isAvailableForRental() {
        return geIsAvailableForRental();
    }
}
