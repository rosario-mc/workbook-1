package sqlExercises.NorthwindShippers;

public class Shipper {
    private int ShipperID;
    private String CompanyName;
    private String Phone;

    public Shipper() {
    }

    public Shipper(int shipperID, String companyName, String phone) {
        ShipperID = shipperID;
        CompanyName = companyName;
        Phone = phone;
    }

    public int getShipperID() {
        return ShipperID;
    }

    public void setShipperID(int shipperID) {
        ShipperID = shipperID;
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    @Override
    public String toString() {
        return String.format(
                "\nShipper Info\n" +
                        "-------------\n" +
                        "ID           : %d\n" +
                        "Company Name : %s\n" +
                        "Phone        : %s\n",
                ShipperID, CompanyName, Phone
        );
    }
}
