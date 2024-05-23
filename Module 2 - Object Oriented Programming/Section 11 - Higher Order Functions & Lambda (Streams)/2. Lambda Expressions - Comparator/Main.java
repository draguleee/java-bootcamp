import java.util.Arrays;
import java.util.List;

/**
 * Comparator Examples
 * 
 * The Process:
 * 1. Higher order functions need to know your intent in order to run
 * 2. You need to express your intent in the form of a Lambda expression
 */

public class Main {
    public static void main(String[] args) {

        // Create a List of Integers
        List<Integer> integers = Arrays.asList(25, 19, 23, 45, 38, 23, 59, 12);

        // Sort the List in ascending order
        integers.sort((right, left) -> {
            return right.compareTo(left);
        });

        // Print the List
        System.out.println(integers);
    }

}


/**************IMPERATIVE APPROACH**************
 * 
        for (int i = 0; i < integers.size(); i++) {
            for (int j = i + 1; j < integers.size(); j++) {
                if (integers.get(i).compareTo(integers.get(j)) > 0) {
                    int temp = integers.get(i);
                    integers.set(i, integers.get(j));
                    integers.set(j, temp);
                }
            }
        }
 */