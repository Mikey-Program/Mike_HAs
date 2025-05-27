package hangman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordFinder extends Timer {
    //In class: Create function to process file input
    public String chooseRandomWordFromFile(int length) throws IOException {
        //TODO: Implementation (In-class task)

        String file = "words.txt";
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));

        } catch ( FileNotFoundException e) {
             e.getMessage();
             }

        return null;
    }

    @Override
    protected void startGame() {
        int length = 4;
        try {
            currentWord = chooseRandomWordFromFile(length);

            if (currentWord == null) {
                System.out.println("No word found.");
                System.exit(0);
                return;
            }

            currentWord = currentWord.toLowerCase();
            guessedLetters.clear();
            attemptsLeft = 6;

            timeLeft = 60;
            updateDisplay();
            inputField.setEnabled(true);
            inputField.requestFocus();

            startTimer();


        } catch (IOException e) {

            System.err.println(e.getMessage());
            System.exit(0);
        }
    }
}


