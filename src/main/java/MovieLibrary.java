
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class MovieLibrary {

    private List<Movie> movies;

    public List<Movie> getMovies() {
        return movies;
    }

    public void showMoviesFromYear(Scanner scanner) {

        System.out.println("od: ");
        int before = scanner.nextInt();
        System.out.println("do: ");
        int after = scanner.nextInt();
        StringBuilder sb = new StringBuilder();

        final List<Movie> moviesFromYear = new ArrayList<>();
        movies.stream()
                .filter(movie -> movie.getDate() >= before && movie.getDate() <= after)
                .forEach(moviesFromYear::add);

        sb.append("Filmy z lat ").append(before).append(" - ").append(after).append(": ");

        if(moviesFromYear.size() == 0){
            System.out.println("Żaden z filmów nie spełnia kryteriów wyszukiwania. \n");
            return;
        }

        for (int i = 0; i < moviesFromYear.size(); i++) {
            sb.append(moviesFromYear.get(i).getTitle());
            if (i != moviesFromYear.size() - 1) {
                sb.append(", ");
            }
        }

        System.out.println(sb);
        System.out.println();
    }

    public void showInfoRandomMovie() {
        final Random rand = new Random();
        final Movie randomMovie = movies.get(rand.nextInt(movies.size()));

        System.out.println(randomMovie.toString());
        System.out.println();
    }

    public void showMoviesWithActor(Scanner scanner) {

        System.out.println("Imię: ");
        String name = scanner.next();
        System.out.println("Nazwisko: ");
        String lastName = scanner.next();

        for (Movie movie : movies) {
            for (Actor actor : movie.getActors()) {
                if (actor.getFirstName().equalsIgnoreCase(name) && actor.getLastName().equalsIgnoreCase(lastName)) {
                    System.out.println(movie.getTitle());
                }
            }
        }
        System.out.println();
    }
}
