import java.util.HashMap;
import java.util.Map;

public class OgrenciNotlari {
    public HashMap<String, Integer> getNotlar() {
        HashMap<String, Integer> notlar = new HashMap<>();

        notlar.put("Ahmet", 90);
        notlar.put("Ayşe", 85);
        notlar.put("Mehmet", 75);

        return notlar;
    }

    public void yazdir() {
        HashMap<String, Integer> notlar = getNotlar();
        System.out.println("Öğrenci Notları:");
        for (Map.Entry<String, Integer> entry : notlar.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
