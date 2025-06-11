package SakilaMovies.WithDataManager;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SakilaDataManager {
    private DataSource ds;

    public SakilaDataManager(DataSource ds) {
        this.ds = ds;
    }

    public List<Actor> getActor(String lastName) {
        List<Actor> actors = new ArrayList<>();
        String actor_sql = "SELECT actor_id, first_name, last_name FROM sakila.actor WHERE last_name = ?;";

        try (
                Connection conn = ds.getConnection();
                PreparedStatement statement = conn.prepareStatement(actor_sql)
        ) {
            statement.setString(1, lastName);
            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    int actor_id = rs.getInt("actor_id");
                    String first_name = rs.getString("first_name");
                    String last_name = rs.getString("last_name");
                    actors.add(new Actor(actor_id, first_name, last_name));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return actors;
    }

    public List<Film> getFilms(int actorId) {
        List<Film> films = new ArrayList<>();
        String film_sql = """
                SELECT f.film_id, title, description, release_year, length
                FROM sakila.film AS f
                JOIN film_actor AS fa ON f.film_id = fa.film_id
                JOIN actor AS a ON fa.actor_id = a.actor_id
                WHERE fa.actor_id = ?;
                """;

        try (
                Connection conn = ds.getConnection();
                PreparedStatement statement = conn.prepareStatement(film_sql)
        ) {
            statement.setInt(1, actorId);
            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    int film_id = rs.getInt("film_id");
                    String title = rs.getString("title");
                    String description = rs.getString("description");
                    double release_year = rs.getDouble("release_year");
                    double length = rs.getDouble("length");
                    films.add(new Film(film_id, title, description, release_year, length));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return films;
    }
}