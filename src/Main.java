public class Main {
    public static void main(String[] args) {
        CarRentalServices carRentalServices = new CarRentalServices();

        // Adding some cars
    // Example: Add these in your main method or setup code
        Car car1 = new Car(1, "Civic", "Honda", 45.0);
        Car car2 = new Car(2, "Corolla", "Toyota", 50.0);
        Car car3 = new Car(3, "Model 3", "Tesla", 100.0);
        Car car4 = new Car(4, "Mustang", "Ford", 80.0);
        Car car5 = new Car(5, "Camry", "Toyota", 55.0);
        Car car6 = new Car(6, "Accord", "Honda", 60.0);
        Car car7 = new Car(7, "Charger", "Dodge", 75.0);
        Car car8 = new Car(8, "Altima", "Nissan", 50.0);
        Car car9 = new Car(9, "Impala", "Chevrolet", 65.0);
        Car car10 = new Car(10, "3 Series", "BMW", 90.0);

        // ... Add more cars to make a total of 10
        carRentalServices.addCar(car1);
        carRentalServices.addCar(car2);           
        carRentalServices.addCar(car3);
        carRentalServices.addCar(car4);
        carRentalServices.addCar(car5);
        carRentalServices.addCar(car6);
        carRentalServices.addCar(car7);
        carRentalServices.addCar(car8);
        carRentalServices.addCar(car9);
        carRentalServices.addCar(car10);

        carRentalServices.runMenu();
    }
    
}

        