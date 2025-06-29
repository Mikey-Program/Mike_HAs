package src.HA9;

import src.HA9.A1.CoursePhase;
import src.HA9.A2.Student;
import src.HA9.A2.StudentFormatter;
import src.HA9.A3.Movie;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Aufgabe 1: alle "Statuse" ausgegeben
        for (CoursePhase phase : CoursePhase.values()) {
            System.out.println(phase + ": " + phase.getMessage());
        }

        System.out.println();

        //Aufgabe 2; Lambda-Expressions
        StudentFormatter shorter = student ->
                student.getClass().getSimpleName() + " " +  student.getName() + ", Year: " + student.getYear();

        StudentFormatter detailed = student ->
                student.getName() + " studies " + student.getMajor() + " in Year " + student.getYear();

        Student s = new Student("Alice", "Physics", 2);

        System.out.println(shorter.format(s));
        System.out.println(detailed.format(s));

        System.out.println();

        //Aufgabe 3: Streams and Comparators
        List<Movie> movies = List.of(
                new Movie("Road House", 6.7, 1989),
                new Movie("The Dark Knight", 9.0, 2008),
                new Movie("Inception", 8.8, 2010),
                new Movie("Interstellar", 8.6, 2014),
                new Movie("The Equalizer", 8.2, 2014),
                new Movie("Avengers 2", 8.5, 2015),
                new Movie("The Creator", 9, 2023),
                new Movie("Blood & Sinners", 10, 2025)
        );

        movies.stream()
                .filter(m -> m.getRating() >= 8.5)  // nur 2. Jahrgang
                .sorted(Comparator.comparing(Movie::getYear) // aufsteigend nach Jahr nach Name
                        .thenComparing(Comparator.comparing(Movie::getRating).reversed())) // absteigend nach Rating
                .forEach(System.out::println);  // ausgeben
    }
}
