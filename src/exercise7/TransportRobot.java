package src.exercise7;

public class TransportRobot extends BaseRobot{


    public TransportRobot(String name, boolean running) {
        super(name, running);
    }

    @Override
    public void PerformTask() {
        if(!this.isRunning()){
            System.out.println("Schalte den Roboter an");
            return;
        }
        for(int i = 0; i < 3; i++){
            System.out.println(name + " is transporting packages");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
