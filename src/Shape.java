public abstract class Shape {
    // Abstract metod: gövdesi yok alt sınıflarda override edilmeli
    public abstract void draw();

    public void info() {
        System.out.println("Bu bir şekildir.");
    }
}
