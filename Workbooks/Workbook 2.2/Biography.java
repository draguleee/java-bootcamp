import java.util.zip.Adler32;

// Workbook 2.2

public class Biography {
    public static void main(String[] args) {

        // Necessary variables
        String name = "Andre";
        int age = 23;
        String country = "Romania";
        String sport = "BMX";
        int hours = 4;
        String game = "Valorant";
        String subject = "Physics";
        char grade = 'A';

        // Biography
        System.out.println("My name is " + name + ". I'm " + age + " years old, and I'm from " + country + ".");
        System.out.println("My favourite sport is " +  sport + ". I play for " + hours + " hours a day.");
        System.out.println("When I'm tired, I like to play " + game + ".");
        System.out.println("In school, my favourite subject was " + subject + ", I scored a " + grade + ".");
    }
}
