package src.exercise1;

import java.util.Arrays;
import java.util.Scanner;

public class PizzaDeluxe {
    public static void main (String[] args) {
        Scanner scan = new Scanner((System.in));

        String[] toppings = {"Salami", "Schinken", "Champignons", "Paprika", "Zwiebeln"};

        double[] prices = {1.0, 1.5, 1.0, 0.8, 0.5};

        System.out.println("Welcome to Pizza Deluxe!");
        System.out.println("Topping");
        System.out.println(Arrays.toString(toppings));
        System.out.println(Arrays.toString(prices));

        System.out.print("Choose your toppings (e.g., 1 3 4): ");

    }
}
