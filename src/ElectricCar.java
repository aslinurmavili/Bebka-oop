public class ElectricCar extends Car {
    public ElectricCar(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void start() {
        System.out.println("Elektrikli araba sessizce çalıştı.");
    }
}
