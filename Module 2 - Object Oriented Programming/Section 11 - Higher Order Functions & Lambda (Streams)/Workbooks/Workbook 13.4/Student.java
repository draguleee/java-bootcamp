/**
 * Student class
 */

public class Student {

    // Instance variables (private)
    private String name;
    private double score;

    // Constructor for Student class
    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    // Getter for name
    public String getName() {
        return this.name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for score
    public double getScore() {
        return this.score;
    }

    // Setter for score
    public void setScore(double score) {
        this.score = score;
    }

}
