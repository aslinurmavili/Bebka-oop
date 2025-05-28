public class Main {
    public static void main(String[] args) {
        //nesne oluşturduk
        Car myCar = new Car("Toyota", "Corolla", 2020);

        System.out.println("İlk Araç Bilgileri:");
        myCar.printInfo();

        //setter metoduyla nesne içinde değiştirme yaptık
        myCar.setBrand("Honda");
        myCar.setModel("Civic");
        myCar.setYear(2024);

        System.out.println("\nGüncellenmiş Araç Bilgileri:");
        myCar.printInfo();
    }
}
