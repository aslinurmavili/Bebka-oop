public class Main {
    public static void main(String[] args) {
        // Polymorphism ile Car türünde ama ElectricCar nesnesi
        Car myCar = new ElectricCar("Tesla", "Model 3", 2023);
        myCar.setSpeed(120);

        System.out.println("İlk Araç Bilgileri:");
        myCar.printInfo();

        // start metodu override edildiği için ElectricCar versiyonu çalışır
        myCar.start();

        // Değerleri güncelle
        myCar.setBrand("Tesla");
        myCar.setModel("Model Y");
        myCar.setYear(2024);
        myCar.setSpeed(150);

        System.out.println("\nGüncellenmiş Araç Bilgileri:");
        myCar.printInfo();

        myCar.start();

        //benzinli araba
        System.out.println("\n---");

        Car gasCar = new GasCar("Toyota", "Corolla", 2020);
        gasCar.setSpeed(130);

        System.out.println("Benzinli Araç Bilgileri:");
        gasCar.printInfo();
        gasCar.start();
    }
}
