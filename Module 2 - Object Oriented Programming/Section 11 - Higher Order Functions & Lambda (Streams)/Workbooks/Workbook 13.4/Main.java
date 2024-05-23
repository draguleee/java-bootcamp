import java.util.Arrays;
import java.util.List;

/**
 * Main class
 * 
 * 
 * The Process
 * 
 * 1. Convert your data source into a stream of elements.
 * 
 * 2. Add a filter operation to the pipeline.
 *    Filter: receives a stream of elements and returns a filtered stream
 * 
 * 3. Add a map operation to the pipeline.
 *    Map: transforms every element in the stream
 * 
 * 4. Add a sorted operation to the pipeline.
 *    Sorted: receives a stream and returns a sorted stream
 * 
 * 5. Add another map operation to the pipeline.
 * 
 * 6. Add a foreach operation to the pipeline.
 *    Foreach: receives a stream and produces an output
 */

public class Main {
    public static void main(String[] args) {

        // Create an ArrayList of Student objects (1)
        List<Student> students = Arrays.asList(
            new Student("Alice", 85.6),
            new Student("Bob", 73.2),
            new Student("Charlie", 64.1),
            new Student("Dave", 92.7),
            new Student("Eve", 77.4),
            new Student("Frank", 59.3),
            new Student("Gina", 91.4),
            new Student("Hannah", 76.8),
            new Student("Igor", 68.9),
            new Student("Jasmine", 82.5)
        );

        // The process (see steps)
        students.stream()
            .filter(student -> student.getScore() > 80)
            .forEach(student -> System.out.println("Congratulations " + student.getName() + " for achieving a score of " + student.getScore())); // terminal operation
    }
}
