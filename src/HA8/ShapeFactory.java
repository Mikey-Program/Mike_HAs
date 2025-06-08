package src.HA8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ShapeFactory {

    //Von GPT: (Ich habe iwi die reader/writer Dinge niczt mitbekommen und muss die immernoch nachholen
    public static Shape fromString(String input) {
        if (input == null || !input.contains(":")) {
            throw new IllegalArgumentException("Ungültiges Format: " + input);
        }

        // Zerlege in Typ und Parameter-Teil
        String[] parts = input.split(":");
        String shapeType = parts[0].trim();
        String parameters = parts[1].trim();

        switch (shapeType) {
            case "Circle":
                double radius = parseSingleValue(parameters, "radius");
                return new Circle(radius);

            case "Rectangle":
                double width = parseSingleValue(parameters, "width");
                double length = parseSingleValue(parameters, "length");
                return new Rectangle(width, length);

            default:
                throw new IllegalArgumentException("Unbekannter Shape-Typ: " + shapeType);
        }
    }
    //Hilfsmethode
    private static double parseSingleValue(String paramString, String key) {
        for (String param : paramString.split(",")) {
            String[] kv = param.trim().split("=");
            if (kv.length == 2 && kv[0].trim().equals(key)) {
                return Double.parseDouble(kv[1].trim());
            }
        }
        throw new IllegalArgumentException("Parameter nicht gefunden: " + key);
    }
    //Ich nehme dazu trotzdem gerne Feedback :D
    // War eine Hilfsmethode nötig/hilfreich oder geht es auch kürzer?
}

