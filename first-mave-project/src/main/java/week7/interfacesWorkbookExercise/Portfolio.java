package week7.interfacesWorkbookExercise;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String owner;
    private String name;
    List<Valuable> valuableList = new ArrayList<>();

    public Portfolio(String owner, String name) {
        this.owner = owner;
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Valuable> getValuableList() {
        return valuableList;
    }

    public void setValuableList(List<Valuable> valuableList) {
        this.valuableList = valuableList;
    }

    public void add(Valuable valuable) {
        valuableList.add(valuable);
    }

    public double getValue() {
        double totalValue = 0;
        for(Valuable valuable : valuableList) {
            totalValue += valuable.getValue();
        }
        return totalValue;
    }

    public Valuable getMostValuable() {
        if (valuableList.isEmpty()) {
            return null;
        }

        Valuable mostValuable = valuableList.get(0);

        for (Valuable valuable : valuableList) {
            if (valuable.getValue() > mostValuable.getValue()) {
                mostValuable = valuable;
            }
        }

        return mostValuable;
    }

    public Valuable getLeastValuable() {
        if (valuableList.isEmpty()) return null;

        Valuable leastValuable = valuableList.get(0);
        for (Valuable valuable : valuableList) {
            if (valuable.getValue() < leastValuable.getValue()) {
                leastValuable = valuable;
            }
        }
        return leastValuable;
    }
}