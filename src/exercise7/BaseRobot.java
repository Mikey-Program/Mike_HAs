package src.exercise7;

public abstract class BaseRobot implements ControllableRobot{

    protected String name;
    private boolean running;

    public BaseRobot(String name, boolean running) {
        this.name = name;
        this.running = running;
    }

    @Override
    public void start() {
        this.running = true;
    }

    @Override
    public void stop() {
        this.running = false;
    }

    @Override
    public boolean isRunning() {
        return this.running;
    }

    @Override
    public abstract void PerformTask();
}
