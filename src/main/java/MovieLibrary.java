import java.util.List;

public class MovieLibrary {

    private final List<Movie> movies;

    public MovieLibrary(List<Movie> movies) {
        this.movies = movies;
    }

    public void showMoviesFromYear(int before, int after) {

        StringBuilder sb = new StringBuilder();
        List<Movie> moviesFromYear = movies.stream()
                .filter(movie -> movie.getDate() > before && movie.getDate() < after)
                .toList();

        sb.append("Filmy z lat ").append(before).append(" ").append(after).append(" : ");

        for (Movie movie : moviesFromYear) {
            sb.append(movie.getTitle());
            sb.append(", ");
        }
        System.out.println(sb);
    }

    public void showInfoRandomMovie(){

    }

    public void showMoviesWithActor(){

    }
}

//        Movie[] objects = moviesFromYear.toArray();
//
//        for (int i = 0; i < objects.length; i++) {
//
//        }