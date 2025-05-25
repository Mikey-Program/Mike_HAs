package hangman;


public class Timer extends Game {

    protected Thread timerThread;

    protected boolean timerRunning;

    // Override startGame () to also start the timer
    @Override
    protected void startGame(){
        this.startTimer();
        super.startGame();
    }

    // Implement startTimer () to create and start the timer thread
    public void startTimer(){
        timerRunning=true;
        timerThread = new Thread(new TimerRunnable(this));
        timerThread.start();
    }

}