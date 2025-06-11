package sqlExercises.SakilaMovies.WithDataManager;

public class Film {
    private int film_id;
    private String title;
    private String description;
    private double release_year;
    private double length;

    public Film(int filmID, String title, String description, double releaseYear, double length) {
        this.film_id = filmID;
        this.title = title;
        this.description = description;
        this.release_year = releaseYear;
        this.length = length;
    }

    public int getFilm_id() {
        return film_id;
    }

    public void setFilm_id(int film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRelease_year() {
        return release_year;
    }

    public void setRelease_year(double release_year) {
        this.release_year = release_year;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
