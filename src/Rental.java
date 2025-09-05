public class Rental {
    private Car car;
    private Customer customer;
    private int rentalDays;


    public Rental(Car car, Customer customer, int rentalDays) {
        this.car = car;
        this.customer = customer;
        this.rentalDays = rentalDays;
    }


    public Car getCar() {
        return car;
    }


    public void setCar(Car car) {
        this.car = car;
    }


    public Customer getCustomer() {
        return customer;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public int getRentalDays() {
        return rentalDays;
    }


    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double calculateTotalCost() {
        return car.calculateTotalCost(rentalDays);
    }

}
