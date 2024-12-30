public class RentableCar extends Car implements Rentable {

    public RentableCar(String vehicleId, String model, double baseRentalRate, int days) {
        super(vehicleId, model, baseRentalRate, days);
    }

    public void rent(Customer customer, int days) {
        if (isAvailableForRental()) {
            System.out.println("Car rented to: " + customer.getName());
            setAvailable(isAvailableForRental());
        } else {
            System.out.println("Car is not available for rental");
        }
    }

    public void returnVehicle() {
        setAvailable(isAvailableForRental());
        System.out.println("Car returned");
    }
}
