public class Vehicle {
    private int speed;

    // int parametreli metot (mevcut)
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // double parametreli metot (overload)
    public void setSpeed(double speed) {
        this.speed = (int) speed; // double değeri int'e dönüştürerek kaydediyoruz
    }

    public int getSpeed() {
        return speed;
    }

    public void start() {
        System.out.println("Araç çalıştırılıyor...");
    }
}
