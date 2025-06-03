import java.util.ArrayList;

public class SehirListesi {
    public ArrayList<String> getSehirler() {
        ArrayList<String> sehirler = new ArrayList<>();
        sehirler.add("İzmir");
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("Bursa");
        sehirler.add("Denizli");
        return sehirler;
    }

    public void yazdir() {
        System.out.println("\nŞehir Listesi:");
        for (String sehir : getSehirler()) {
            System.out.println("- " + sehir);
        }
    }
}
