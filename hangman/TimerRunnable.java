package hangman;
import hangman.Aufg3.HangmanGame;

import javax.swing.SwingUtilities;

public class TimerRunnable implements Runnable {

    private final Timer game;

    public TimerRunnable(Timer game) {
        this.game = game;

    }

    @Override
    public void run() {
    // TODO: Implement the countdown loop
    // - Decrease timeLeft every second
    // - Update the time label using SwingUtilities.invokeLater ()
    // - End the game if time runs out
        while (game.timeLeft >0){
            game.timeLeft--;

            // GUI-Update sicher machen:
            SwingUtilities.invokeLater(() -> {
                game.timeLabel.setText("Time left: " + game.timeLeft);
            });

            try{
                Thread.sleep(1000); //sorgt dafür, dass der Thread schläft für gewisse Millisekunden
            } catch (InterruptedException e){
                e.printStackTrace();
                return;
            }
        }
        // Wenn Zeit abgelaufen, Spiel beenden
        SwingUtilities.invokeLater(() -> {
            game.endGame(false);
        });
    }
}
