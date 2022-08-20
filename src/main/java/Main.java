import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final ObjectMapper mapper = new ObjectMapper();
        MovieLibrary movieLibrary;
        try {
            movieLibrary = mapper.readValue(new File("src/main/resources/movies.json"), MovieLibrary.class);

        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            int menuOption = provideMenuOption(scanner);
            switch (menuOption) {
                case 1 -> movieLibrary.showMoviesFromYear(scanner.nextInt(), scanner.nextInt());
                case 2 -> movieLibrary.showInfoRandomMovie();
                case 3 -> movieLibrary.showMoviesWithActor();
                case 4 -> {
                    scanner.close();
                    System.exit(0);
                }
            }
        }

    }

    private static int provideMenuOption(Scanner scanner) {

        System.out.println("""
                Wybierz co chcesz zrobić:\s
                 1. Podaj kolejno dwie daty by wyświetlić nazwy filmów wydanych pomiędzy tymi datami
                 2. Wyświetl wszystkie informacje o losowym filmie
                 3. Podaj imię i nazwisko aktora by wyświetlić nazwy filmów, w których zagrał.
                 4. Zakończ program.""");

        return scanner.nextInt();
    }
}

