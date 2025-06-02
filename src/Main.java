public class Main {
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", "Corolla", 2020);
        myCar.setSpeed(120); // Vehicle’dan gelen speed özelliği

        System.out.println("İlk Araç Bilgileri:");
        myCar.printInfo();


        myCar.setBrand("Honda");
        myCar.setModel("Civic");
        myCar.setYear(2024);
        myCar.setSpeed(150);

        System.out.println("\nGüncellenmiş Araç Bilgileri:");
        myCar.printInfo();
    }
}
