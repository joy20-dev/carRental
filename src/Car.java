public class Car{
    private int carId;
    private String model;
    private String carBrand;
    private double basePrice;
    private boolean isAvailable;

    public Car(int carId ,String model, String carBrand, double basePrice) {
        this.carId = carId;
        this.model = model;
        this.carBrand = carBrand;
        this.basePrice = basePrice;
        this.isAvailable = true;
    }
    

    public int getCarId() {
        return carId;
    }


    public void setCarId(int carId) {
        this.carId = carId;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public void rentCar() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Car is not available for rent.");
        }
    }

    public double calculateTotalCost(int rentalDays){
        return basePrice * rentalDays;
    }

    public void returnCar() {
        isAvailable = true;
    }

    @Override
    public String toString() {
        return carId + " " + carBrand + " " + model + " - $" + basePrice + (isAvailable ? " (Available)" : " (Not Available)");
    }
}