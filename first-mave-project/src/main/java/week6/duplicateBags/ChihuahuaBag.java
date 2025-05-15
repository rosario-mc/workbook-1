package week6.duplicateBags;

import java.util.ArrayList;
import java.util.List;

public class ChihuahuaBag {
    private List<Chihuahua> items = new ArrayList<>();

    public void addItems(Chihuahua item) {
        items.add(item);
    }

    public void printContents() {
        for (Chihuahua c : items) {
            System.out.println(c);
        }
    }
}
