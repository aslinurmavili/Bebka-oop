public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla", 2020);

        System.out.println("İlk Araç Bilgileri:");
        myCar.printInfo();

        myCar.setBrand("Honda");
        myCar.setModel("Civic");
        myCar.setYear(2024);

        System.out.println("\nGüncellenmiş Araç Bilgileri:");
        myCar.printInfo();
    }
}
