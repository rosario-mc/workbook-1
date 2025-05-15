package week6.duplicateBags;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    private List<T> items = new ArrayList<>();

    public void addItems(T item) {
        items.add(item);
    }

    public String getFirstItem() {
        if (items.isEmpty()) {
            return "No items in the bag";
        } else {
            return items.get(0).toString();
        }
    }

    public void printContents(String header) {
        System.out.println(header);
        for (T t : items) {
            System.out.println(t);
        }
    }
}
