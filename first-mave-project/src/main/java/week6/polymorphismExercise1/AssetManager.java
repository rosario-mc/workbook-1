package week6.polymorphismExercise1;

import java.util.ArrayList;
import java.util.List;

public class AssetManager  {
    public static void main(String[] args) {
        List<Asset> myAssets = new ArrayList<>();
        myAssets.add(new House("Tahoe Home", "05/16/2020", 500000, "123 Oak Rd, Lake Tahoe, CA 95123", 2, 3830, 8177));
        myAssets.add(new House("San Jose Home", "12/24/2000", 300000, "456 Street Rd, San Jose CA, 95123", 2, 4000, 7000));
        myAssets.add(new Vehicle("Daily Driver", "04/25/2016", 2000, "Honda Civic", 1995, 215236));
        myAssets.add(new Vehicle("Minivan", "06/15/2022", 15000, "Dodge Grand Caravan", 2021, 78000));

        for (Asset asset : myAssets) {
            System.out.println(asset);
            System.out.printf("%-60s: $%, .2f\n", "CURRENT VALUE", asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("\nNOTE: THIS IS A PROPERTY LOCATED AT " + house.getAddress()) ;
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("\nNOTE: VEHICLE DETAILS: " + vehicle.getYear() + " " + vehicle.getMakeModel());
            }

            System.out.println("------------------------------------------------------------");
        }
    }
}
