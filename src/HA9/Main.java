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
                new Movie("Road House", 7.2, 2005),
                new Movie("Avengers", 8.5, 2015),
                new Movie("The Creator", 9, 2023),
                new Movie("Blood & Sinners", 10, 2025)
        );

        movies.stream()
                .filter(m -> m.getRating() >= 8.5)  // nur 2. Jahrgang
                .sorted(Comparator.comparing(Movie::getRating)) // alphabetisch nach Name
                .forEach(System.out::println);  // ausgeben
    }
}
