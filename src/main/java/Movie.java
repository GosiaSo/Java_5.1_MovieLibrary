import java.util.ArrayList;
import java.util.List;

public class Movie {

    private String title;
    private Director director;
    private Genre genre;
    private int date;
    private ArrayList<Actor> actors;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    public void setActors(ArrayList<Actor> actors) {
        this.actors = actors;
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
    DRAMA, THRILLER, FANTASY, ACTION
}
