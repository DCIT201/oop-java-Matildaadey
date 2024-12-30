import java.util.ArrayList;

public class RentalAgency {

    private String agencyName;
    private ArrayList<Vehicle> vehicleInventory;

    public RentalAgency(String agencyName) {
        this.agencyName = agencyName;
        this.vehicleInventory = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleInventory.add(vehicle);
    }

    public void displayAvailableVehicles() {
        for (Vehicle vehicle : vehicleInventory) {
            if (vehicle.isAvailableForRental()) {
                System.out.println(vehicle.getVehicleId() + " - " + vehicle.getModel());
            }
        }
    }
}
