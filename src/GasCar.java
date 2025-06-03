public class GasCar extends Car {
    public GasCar(String brand, String model, int year) {
        super(brand, model, year);
    }

    @Override
    public void start() {
        System.out.println("Benzinli araba motor sesiyle çalıştı.");
    }
}
