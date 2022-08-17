import java.util.List;

public class Movie {

    private String title;
    private Director director;
    private Genre genre;
    private int date;
    private List<Actor> actors;

    public String getTitle() {
        return title;
    }

    public Director getDirector() {
        return director;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getDate() {
        return date;
    }

    public List<Actor> getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title= '" + title + '\'' +
                ", director= " + director +
                ", genre= " + genre +
                ", date= " + date +
                ", actors= " + actors.toString() +
                '}';
    }
}

enum Genre {
    DRAMA, THRILLER, COMEDY, DOCUMENTARY
}
