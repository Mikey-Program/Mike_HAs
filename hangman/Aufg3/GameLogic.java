package hangman.Aufg3;

public interface GameLogic {

    void handleGuess(char guess);

    boolean hasWon();

    void endGame(boolean won);
}
