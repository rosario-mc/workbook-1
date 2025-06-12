package sqlExercises.NorthwindShippers;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShipperDAO {
    private DataSource ds;

    public ShipperDAO(DataSource ds) {
        this.ds = ds;
    }

    public List<Shipper> getAll() {
        List<Shipper> shippers = new ArrayList<>();
        String sql = "SELECT * FROM northwind.shippers;";
        try (
                Connection con = ds.getConnection();
                PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
        ) {
            while (rs.next()) {
                Shipper shipper = new Shipper(rs.getInt("ShipperID"), rs.getString("CompanyName"), rs.getString("Phone"));
                shippers.add(shipper);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return shippers;
    }

    public void add(Shipper shipper) {
        String add_sql = "INSERT INTO northwind.shippers(CompanyName, Phone) VALUES (?, ?);";
        try (
                Connection con = ds.getConnection();
                PreparedStatement ps = con.prepareStatement(add_sql);
        ) {
            ps.setString(1, shipper.getCompanyName());
            ps.setString(2, shipper.getPhone());
            int rowsAffected = ps.executeUpdate();
            if (rowsAffected != 1) {
                throw new SQLException("Insertion failed! " + shipper);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void update(int idUpdate, Shipper shipper) {
        String update_sql = "UPDATE northwind.shippers SET Phone = ? WHERE ShipperID = ?;";
        try (
                Connection con = ds.getConnection();
                PreparedStatement ps = con.prepareStatement(update_sql);
        ) {
            ps.setString(1, shipper.getPhone());
            ps.setInt(2, idUpdate);
            ps.executeUpdate();
        } catch (
                SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void delete(int idDel) {
        String del_sql = "DELETE FROM northwind.shippers WHERE ShipperID = ?;";
        try (
                Connection con = ds.getConnection();
                PreparedStatement ps = con.prepareStatement(del_sql);
        ) {
            ps.setInt(1, idDel);
            ps.executeUpdate();
        } catch (
                SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}