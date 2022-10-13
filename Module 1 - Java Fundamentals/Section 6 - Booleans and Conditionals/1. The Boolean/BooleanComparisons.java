// Comparisons

public class BooleanComparisons {
    public static void main(String[] args) {
        
        // Variables
        int chemistryGrade = 95;
        int biologyGrade = 75;
        int englishGrade = 75;
        double sales = 37.55;
        double costs = 5.55;
        int dogs = 4;
        int cats = 4;

        // Greater than comparison
        System.out.println("\nGreater than comparison: ");
        System.out.println(biologyGrade > chemistryGrade);
        System.out.println(sales > costs);

        // Less than comparison
        System.out.println("\nLess than comparison: ");
        System.out.println(biologyGrade < chemistryGrade);
        System.out.println(sales < costs);

        // Greater than or equal to comparison
        System.out.println("\nGreater than or equal to comparison: ");
        System.out.println(chemistryGrade >= englishGrade);
        System.out.println(biologyGrade >= englishGrade);

        // Less than or equal to comparison
        System.out.println("\nLess than or equal to comparison: ");
        System.out.println(chemistryGrade <= englishGrade);
        System.out.println(biologyGrade <= englishGrade);

        // Equal to comparison
        System.out.println("\nEqual to comparison: ");
        System.out.println(dogs == cats);
        System.out.println(chemistryGrade == englishGrade);
        System.out.println(biologyGrade == englishGrade);
        
        // Different than comparison
        System.out.println("\nNot equal to comparison: ");
        System.out.println(dogs != cats);
        System.out.println(chemistryGrade != englishGrade);
        System.out.println(biologyGrade != englishGrade);

        // Equals comparison
        System.out.println("\nEquals comparison: ");
        String sentence1 = "I love this course!";
        String sentence2 = "I love this course!";
        System.out.println(sentence1.equals(sentence2));

        // Not equals comparison
        System.out.println("\nNot equals comparison: ");
        System.out.println(!sentence1.equals(sentence2));

    }
}