package src.HA9.A2;

public class Student {

    private String name, major;
    private int year;

    public Student(String name, String major, int year) {
        this.name = name;
        this.major = major;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override //nur für mich zum testen von etwas
    public String toString() {
        return name + " (Year " + year + ")";
    }
}
