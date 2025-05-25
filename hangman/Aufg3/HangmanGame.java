package hangman.Aufg3;

import hangman.TimerRunnable;

public class HangmanGame extends GameGUI implements GameLogic, TimerLogic {

    protected Thread timerThread;
    protected boolean timerRunning;

    // Konstruktor:
    public HangmanGame() {
        super(); // GUI initialisieren
    }

    @Override
    protected void handleGuess(char guess) {
        if(currentWord.indexOf(guess) == -1){
            attemptsLeft--;
            System.out.println("Leider falsch geraten");
            updateDisplay();
            if(attemptsLeft == 0){
                endGame(hasWon());
            }
        } else if (guessedLetters.contains(guess)){
            System.out.println("Du hast diesen Buchtstaben schon erraten");
        } else {
            System.out.println("Richtiger Buchstabe!");
            guessedLetters.add(guess);
            updateDisplay();
            if(hasWon()){
                endGame(hasWon());
            }
        }
    }


    @Override
    public void handelGuess(char guess) {
        //IntelliJ will, dass ich diese Methode zweimal habe - wieso?
    }

    @Override
    public boolean hasWon() {
        for (int i = 0; i < currentWord.length(); i++){
            if(!guessedLetters.contains(currentWord.charAt(i))){
                return false;
            }
        }
        return true;
    }

    @Override
    public void endGame(boolean won) {
        if(won){
            System.out.println("Du hast gewonnen!");
        } else {
            System.out.println("Du hast verloren!");
        }
        inputField.setEnabled(false);

        try{
            Thread.sleep(3000); //sorgt dafür, dass der Thread schläft für gewisse Millisekunden -
            // will auch sehen, dass man gewinnt und nicht direkt ausmachen - aber sieht iwi schlecht aus, wenn man es ausführt
        } catch (InterruptedException e){
            e.printStackTrace();
            return;
        }

        System.exit(0); //oder dispose() ? GPT beides empfohlen - ich weiß nicht was "best practice" usw. ist
        // und was hier erwartet wird.
    }

    public void startTimer() {
        timerRunning=true;
        timerThread = new Thread(new TimerRunnableHangman(this));
        timerThread.start();
    }
}
