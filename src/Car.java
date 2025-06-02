public class Car {
    private String brand;
    private String model;
    private int year;
    private int speed;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Getter ve Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void printInfo() {
        System.out.println("Marka: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + year);
        System.out.println("Hız: " + speed + " km/s");
    }

    // Polymorphic metod
    public void start() {
        System.out.println("Araba çalışıyor...");
    }
}
