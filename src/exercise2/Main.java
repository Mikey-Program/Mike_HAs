package src.exercise2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //create test obejcts:
//        Person person = new Person("John", "Doe", 30);
//        System.out.println(person.getInfo());

        ArrayList<String> courses = new ArrayList<>();
        courses.add("Mathematics");
        courses.add("Programming");
        courses.add("Machine learning");
        Student student = new Student("Jane", "Smith", 20, 12345, 2, courses);
        System.out.println(student.getInfo());

        PhDStudent phdStudent = new PhDStudent("Alice", "Johnson", 28, 67890, 4, courses, "Quantum Computing");
        System.out.println(phdStudent.getInfo());



    }
}
