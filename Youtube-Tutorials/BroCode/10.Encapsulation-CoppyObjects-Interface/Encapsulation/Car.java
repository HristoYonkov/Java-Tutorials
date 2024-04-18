public class Car {
    Car(String brand, String model, int year) {
        // another way of setting the parameters.
        this.setBrand(brand);
        this.model = model;
        this.year = year;
    }

    private String brand;
    private String model;
    private int year;

    // getters
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {   
        return year;
    }

    // setters
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
}
