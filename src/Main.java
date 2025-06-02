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
        gasCar.start(); // GasCar’daki override metodu çalışır


        //calculator
        Calculator calc = new Calculator();

        int sumTwo = calc.add(5, 10);           // İki parametreli metot çağrılır
        int sumThree = calc.add(2, 4, 6);       // Üç parametreli metot çağrılır

        System.out.println("İki sayının toplamı: " + sumTwo);
        System.out.println("Üç sayının toplamı: " + sumThree);

        // Nesne oluşturmadan sınıf ismi ile doğrudan çağırıyoruz
        int result = MathUtils.multiply(5, 7);
        System.out.println("Çarpım sonucu: " + result);

        //this ve super kullanımı
        Student student = new Student("Ahmet", 21, "2023456");
        student.printInfo();


        //Abstract Sınıf Kullanımı
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        circle.draw();
        rectangle.draw();


        //ınterface
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.sound();
        cat.sound();
    }
}
