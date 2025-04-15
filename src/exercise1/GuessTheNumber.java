package src.exercise1;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        int numberToGuess = (int) (Math.random()*20) +1;
        Scanner scanner = new Scanner(System.in);
        //Variables that manage the game's state
        boolean abgabe=false;
        int versuche = 0;

        // noch hinzufügen wenn man nach 5 versuchen falsch hat - Ausgabe usw.
        for(int i = 0; i<5; i++){
            System.out.println("Guess a number between 1 and 20)");
            int gegebeneZahl = scanner.nextInt();

            if(numberToGuess < gegebeneZahl) {
                System.out.println("too small, guess again");
                continue;
            }
            else if(numberToGuess > gegebeneZahl) {
                System.out.println("too big, guess again");
                continue;
            }
            else{
                System.out.println("you guessed Right!");
                abgabe = true;
                versuche = i;
                break;
            }
        }
        System.out.println("You needed" +versuche+" to guess right! ");
    }
}