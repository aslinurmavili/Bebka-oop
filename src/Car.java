public class Car {
    //encapsulation için private yaptım
    private String brand;
    private String model;
    private int year;


//Constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }



    // setter: veriyi değiştirme metodu
    //getter: veriyi okuma metodu



//get metotları encapsulation için
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

//setter encapsulation
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

//bilgileri ekrana yazdırıyoruz
    public void printInfo() {
        System.out.println("Marka: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + year);
    }
}
