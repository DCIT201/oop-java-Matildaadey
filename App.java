public class App {

    public static void main(String[] args) {
        // Create Vehicles
        Car car = new Car("B101", "Benz", 50, 0);
        Motorcycle motorcycle = new Motorcycle("R001", "Range Rover", 30, 0);
        Truck truck = new Truck("F001", "Ferrari", 100, 0);

        // Creating a new Customer
        Customer customer = new Customer("Richard", "R0123456");

        // Adding vehicles
        RentalAgency agency = new RentalAgency("Marley Institute");
        agency.addVehicle(car);
        agency.addVehicle(motorcycle);
        agency.addVehicle(truck);

        // displaying available vehicles
        agency.displayAvailableVehicles();

        // Renting a Vehicle
        RentalTransaction transaction = new RentalTransaction(car, customer, 5);
        transaction.printTransactionDetails();

        // Return Vehicle
        car.setAvailable(true);
    }
}
