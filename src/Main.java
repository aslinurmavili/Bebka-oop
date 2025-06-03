import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Polymorphism: ElectricCar örneği
        Car myCar = new ElectricCar("Tesla", "Model 3", 2023);
        myCar.setSpeed(120);

        System.out.println("İlk Araç Bilgileri:");
        myCar.printInfo();
        myCar.start();

        myCar.setBrand("Tesla");
        myCar.setModel("Model Y");
        myCar.setYear(2024);
        myCar.setSpeed(150);

        System.out.println("\nGüncellenmiş Araç Bilgileri:");
        myCar.printInfo();
        myCar.start();

        // Benzinli araç örneği
        System.out.println("\n---");
        Car gasCar = new GasCar("Toyota", "Corolla", 2020);
        gasCar.setSpeed(130);
        System.out.println("Benzinli Araç Bilgileri:");
        gasCar.printInfo();
        gasCar.start();

        // Method Overloading
        Calculator calc = new Calculator();
        int sumTwo = calc.add(5, 10);
        int sumThree = calc.add(2, 4, 6);
        System.out.println("İki sayının toplamı: " + sumTwo);
        System.out.println("Üç sayının toplamı: " + sumThree);

        // Static method
        int result = MathUtils.multiply(5, 7);
        System.out.println("Çarpım sonucu: " + result);

        // this ve super kullanımı
        Student student = new Student("Ahmet", 21, "2023456");
        student.printInfo();

        // Abstract sınıf kullanımı
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();

        // Interface kullanımı
        Animal dog = new Dog();
        Animal cat = new Cat();
        dog.sound();
        cat.sound();

        // Enum kullanımı
        Gun bugun = Gun.CUMA;
        System.out.println("Bugün günlerden: " + bugun);

        // SehirListesi kullanımı
        SehirListesi liste = new SehirListesi();
        liste.yazdir();


        //Meyveseti
        MeyveSeti set = new MeyveSeti();
        set.yazdir();

        //ogrenci notları
        OgrenciNotlari ogrenciNotlari = new OgrenciNotlari();
        ogrenciNotlari.yazdir();



        //Bolme  işlemi
        Scanner scanner = new Scanner(System.in);
        BolmeIslemi islemler = new BolmeIslemi();

        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        try {
            int sonuc = islemler.bol(sayi1, sayi2);
            System.out.println("Sonuç: " + sonuc);
        } catch (ArithmeticException e) {
            System.out.println("Hata: Bir sayı sıfıra bölünemez!");
        }

        scanner.close();


        // ArrayList
        ArrayList<Integer> sayilar = new ArrayList<>();


        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(40);
        sayilar.add(50);

        // Lambda ifadesi ile forEach kullanımı
        sayilar.forEach(sayi -> System.out.println(sayi));


        //  Wrapper Sınıfları
        int sayi = 16;


        Integer sayiWrapper = sayi;

        int sayiTekrar = sayiWrapper;


        //Autoboxing: Java, int gibi primitive tipleri otomatik olarak Integer gibi nesneye çevirir.
        //Unboxing: Integer gibi nesnelerden tekrar primitive tipe otomatik dönüş yapılır.

        System.out.println("Orijinal int: " + sayi);
        System.out.println("Integer (Wrapper): " + sayiWrapper);
        System.out.println("Tekrar int (Unboxed): " + sayiTekrar);

    }
}

