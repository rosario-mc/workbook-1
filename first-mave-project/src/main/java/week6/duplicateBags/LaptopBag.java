package week6.duplicateBags;

import java.util.ArrayList;
import java.util.List;

public class LaptopBag {
    private List<Laptop> items = new ArrayList<>();

    public void addItem(Laptop item) {
        items.add(item);
    }

    public void printContents() {
        for (Laptop l : items) {
            System.out.println(l);
        }
    }
}
