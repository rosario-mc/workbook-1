package sqlExercises.NorthwindShippers;

import org.apache.commons.dbcp2.BasicDataSource;


import javax.sql.DataSource;
import java.util.List;
import java.util.Scanner;

public class Journey {
    static Scanner scanner = new Scanner(System.in);
    private static ShipperDAO shipperDAO;

    public static void start(String[] args) {
        if (args.length < 2) {
            System.out.println("MISSING 2 ARGUMENTS: (Usage: java App <username> <password>)");
            return;
        }
        String username = args[0];
        String password = args[1];
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl("jdbc:mysql://localhost:3306/sakila");
        ds.setUsername(username);
        ds.setPassword(password);
        shipperDAO = new ShipperDAO(ds);
        journeyDisplay(ds);
    }

    public static void journeyDisplay(DataSource ds){
        Shipper shipper = new Shipper();

        System.out.print("Hello! \nPlease enter the new shipper's data please.\nEnter Company Name :");
        shipper.setCompanyName(scanner.nextLine());

        System.out.print("\nEnter the Company's Phone Number: ");
        shipper.setPhone(scanner.nextLine());
        System.out.println("\nShipper Added!");
        shipperDAO.add(shipper);

        printShippers(shipperDAO.getAll());

        System.out.print("\n\nLet's Update a Shipper's Phone Number.\nEnter Shipper's ID: ");
        int id =  Integer.parseInt(scanner.nextLine());

        System.out.print("\nEnter The New Phone Number: ");
        shipper = new Shipper();
        shipper.setPhone(scanner.nextLine());
        System.out.print("\nPhone Number Updated!");
        shipperDAO.update(id, shipper);

        printShippers(shipperDAO.getAll());

        System.out.print("\n\nLet's Delete Inactive Shippers.\nPlease Enter Shipper ID: ");
        int idDel =  Integer.parseInt(scanner.nextLine());
        shipperDAO.delete(idDel);
        System.out.print("\nShipper Deleted!");

        printShippers(shipperDAO.getAll());

        System.out.println("\n\nGood Bye!\nSystem Closing...");
    }

    public static void printShippers(List<Shipper>shippers){
        for(Shipper shipper : shippers){
            System.out.println(shipper);
        }
    }
}