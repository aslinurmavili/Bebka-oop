import java.util.HashSet;

public class MeyveSeti {
    public void yazdir() {
        HashSet<String> meyveler = new HashSet<>();

        // Aynı elemanları eklemeye çalışalım
        meyveler.add("elma");
        meyveler.add("elma"); // tekrar
        meyveler.add("muz");
        meyveler.add("kiraz");

        System.out.println("Meyve Seti:");
        for (String meyve : meyveler) {
            System.out.println("- " + meyve);
        }
    }
}
