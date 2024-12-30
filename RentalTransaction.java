import java.util.Date;

public class RentalTransaction {
    private Vehicle vehicle;
    private Customer customer;
    private Date rentalDate;
    private Date returnDate;
    private double rentalCost;

    public RentalTransaction(Vehicle vehicle, Customer customer, int days) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.rentalDate = new Date();
        this.returnDate = new Date(System.currentTimeMillis() + (long) days * 24 * 60 * 60 * 1000);
        this.rentalCost = (double) vehicle.calculateRentalCost(days);
    }

    public void printTransactionDetails() {
        System.out.println("Rental Transaction:");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Vehicle: " + vehicle.getModel());
        System.out.println("Rental Cost: " + rentalCost);
        System.out.println("Return Date: " + returnDate);
    }
}
