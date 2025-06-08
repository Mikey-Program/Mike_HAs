package src.HA8;

import java.io.*;
import java.util.*;

//Wie bei ShapeFactory wieder von GPT - kann alles nachvollziehen, aber kaum selber schreiben
public class PersistentShapeManager {

    public static void saveShapesToFile(Collection<? extends Shape> shapes, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            for (Shape shape : shapes) {
                writer.write(shape.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Fehler beim Schreiben der Datei: " + e.getMessage());
        }
    }

    public static List<Shape> loadShapesFromFile(String filename) {
        List<Shape> shapes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    Shape shape = ShapeFactory.fromString(line);
                    shapes.add(shape);
                } catch (IllegalArgumentException e) {
                    System.err.println("Ungültige Zeile übersprungen: \"" + line + "\"");
                }
            }
        } catch (IOException e) {
            System.err.println("Fehler beim Lesen der Datei: " + e.getMessage());
        }

        return shapes;
    }

    public static void clearFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, false))) {
            // Absichtlich nichts schreiben → Datei wird geleert
        } catch (IOException e) {
            System.err.println("Fehler beim Leeren der Datei: " + e.getMessage());
        }
    }
}
