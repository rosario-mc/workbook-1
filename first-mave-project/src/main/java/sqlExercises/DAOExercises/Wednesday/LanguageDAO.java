package sqlExercises.DAOExercises.Wednesday;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LanguageDAO {
    private DataSource ds;

    public LanguageDAO(DataSource ds) {
        this.ds = ds;
    }

    public List<Language> getAll() {
        List<Language> languages = new ArrayList<>();
        String lan_sql = "SELECT * FROM sakila.language;";
        try (
                Connection con = ds.getConnection();
                PreparedStatement ps = con.prepareStatement(lan_sql)
        ) {
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("language_id");
                    String name = rs.getString("name");
                    languages.add(new Language(id, name));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return languages;
    }

    public List<Language> getById(int lan_id) {
        List<Language> languages_id = new ArrayList<>();
        String id_sql = "SELECT * FROM sakila.language WHERE language_id = ?;";
        try (
                Connection con = ds.getConnection();
                PreparedStatement ps = con.prepareStatement(id_sql);
        ) {
            ps.setInt(1, lan_id);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("language_id");
                    String name = rs.getString("name");
                    languages_id.add(new Language(id, name));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return languages_id;
    }

    public List<Language> getByName(String lanName) {
        List<Language> languages_name = new ArrayList<>();
        String name_sql = "SELECT * FROM sakila.language WHERE name = ?;";
        try(Connection con = ds.getConnection();
            PreparedStatement ps = con.prepareStatement(name_sql);
        ) {
            ps.setString(1, lanName);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("language_id");
                    String name = rs.getString("name");
                    languages_name.add(new Language(id, name));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return languages_name;
    }
}
