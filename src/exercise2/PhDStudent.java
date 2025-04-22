package src.exercise2;

import java.util.ArrayList;

public class PhDStudent extends Student{

    private String dissTopic;

    public PhDStudent(String firstName, String lastName, int age, int matNumber, int semester, ArrayList<String> courses, String dissTopic) {
        super(firstName, lastName, age, matNumber, semester, courses);
        this.dissTopic = dissTopic;
    }

    @Override
    public String getInfo(){
        return super.getInfo() + " dissertion Topic: " +dissTopic;
    }

    public String getDissTopic() {
        return dissTopic;
    }

    public void setDissTopic(String dissTopic) {
        this.dissTopic = dissTopic;
    }
}
