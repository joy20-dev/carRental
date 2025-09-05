import java.util.List;
import java.util.ArrayList;



import java.util.Scanner;

public class CarRentalServices {

    private List<Car> cars;
    private List<Customer> customers;
    private List<Rental> rentals;
    private int nextCustomerId = 1; // To assign unique IDs to new customers

    public CarRentalServices() {
        cars = new ArrayList<>();
        customers = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void rentCar(Car car, Customer customer, int rentalDays) {
        if (car.isAvailable()) {
            car.rentCar();
            Rental rental = new Rental(car, customer, rentalDays);
            rentals.add(rental);
            System.out.println("Car rented successfully to custID :" + customer.getCustId() + "customer name :"+ customer.getName() + " for " + rentalDays + " days. Total cost: $" + rental.calculateTotalCost() );
        }
    }

    // This class can be expanded to include methods for managing cars, customers,
    // and rentals.

    public void returnCar(Car car) { // customer trying to return the car
        Rental rentalToRemove = null;
        for (Rental rentalInfo : rentals) {
            if (rentalInfo.getCar().equals(car)) {
                rentalToRemove = rentalInfo;
                break;
            }
        }
        if (rentalToRemove != null) {
            car.returnCar();
            rentals.remove(rentalToRemove);
            System.out.println("Car returned successfully. "
                    + rentalToRemove.getCustomer().getCustId() + " "
                    + rentalToRemove.getCustomer().getName());

        }

    }

    // user interface methods can be added here for interaction
    public void runMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            

            // Display menu and handle user input
            System.out.println("\n--- Car Rental Menu ---");
            System.out.println("1. View Available Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Return a Car");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if(choice == 1){
                for (Car car : cars) {
                    if(car.isAvailable())
                        System.out.println(car);
                        
                }
            }
            else if(choice ==2){
                System.err.println("checking for error");
                System.out.println("Enter Customer ID: ");
                int custId = scanner.nextInt();
                scanner.nextLine();
                Customer customerFound = null;  //store found customer
                for (Customer customer :customers ){ //check if customer exists
                    System.out.println("chec");
                    if(customer.getCustId() == custId){
                        customerFound = customer;
                        break;
                    }
                
                }
                if(customerFound != null){  //if customer exists, proceed to rent car
                    System.out.println("enter car Id to rent: ");
                    int carId = scanner.nextInt();
                    scanner.nextLine();
                    boolean carRented = false;
                    for(Car car : cars ){
                        if(car.getCarId() == carId && car.isAvailable()){
                            System.out.println("Enter number of rental days: ");
                            int rentalDays = scanner.nextInt();
                            scanner.nextLine();
                            carRented = true;
                            rentCar(car, customerFound, rentalDays);
                            break;
                            
                        }
                    
                    }
                    if(!carRented){
                            System.out.println("Car is not available");
                    }
                }
                    
                
                else{ //if customer does not exist, register new customer
                    System.out.println("Customer not found, pls register first");
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.println("Enter email: ");       
                    String email = scanner.nextLine();
                    System.out.println("Enter phone number: "); 
                    String phoneNumber = scanner.nextLine();
                    Customer newCustomer = new Customer(name, email, phoneNumber, nextCustomerId);
                    addCustomer(newCustomer);
                    System.out.println("Customer registered with ID: " + nextCustomerId);
                    nextCustomerId++;
                }
            
            }
            else if(choice ==3){
                System.out.println("enter car id to be returned:");
                int carId = scanner.nextInt();
                scanner.nextLine();
                boolean found = false;
                for(Car car :cars){
                    if(car.getCarId()== carId && !car.isAvailable()){
                        returnCar(car);
                        found = true;
                        break;
                        
                    }
                    
            
                }
                if(!found){
                    System.out.println("Car not found or already available");
                }
            
            }
            else if (choice == 4) {
                System.out.println("Exiting...");
                scanner.close();
                return ;
                
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            } 

        

    
        }

    }
}

