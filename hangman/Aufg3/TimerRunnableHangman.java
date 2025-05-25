package hangman.Aufg3;

import javax.swing.*;

public class TimerRunnableHangman implements Runnable {
    private final GameGUI game;

    public TimerRunnableHangman(GameGUI game) {
        this.game = game;
    }

    @Override
    public void run() {
        while (game.timeLeft > 0) {
            game.timeLeft--;

            SwingUtilities.invokeLater(() -> {
                game.timeLabel.setText("Time left: " + game.timeLeft);
            });

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                return;
            }
        }

        SwingUtilities.invokeLater(() -> {
            game.endGame(false);
        });
    }
}

