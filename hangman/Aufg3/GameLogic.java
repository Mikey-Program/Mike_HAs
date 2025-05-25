package hangman.Aufg3;

public interface GameLogic {

    void handelGuess(char guess);

    boolean hasWon();

    void endGame(boolean won);
}
