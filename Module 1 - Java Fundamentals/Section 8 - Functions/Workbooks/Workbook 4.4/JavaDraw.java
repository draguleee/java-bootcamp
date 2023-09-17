import java.util.Scanner;

/**
 * Workbook 4.4 - JavaDraw: Drawing with Java
 */
public class JavaDraw {
    public static void main(String[] args) {

        // Create the Scanner
        Scanner scan = new Scanner(System.in);

        // The user can choose to draw a butterfly, elephant, bear or snake
	System.out.print( "\nWhich animal would you like to draw?\n" );
        System.out.println( "Write 1 for butterfly " );
	System.out.println( "Write 2 for elephant  " );
	System.out.println( "Write 3 for bear      " );
        System.out.println( "Write 4 for snake     " );
        System.out.print("\nYour choice: ");
        int choice = scan.nextInt();

        // Call the draw function
        draw(choice);

        // Close the Scanner
        scan.close();
    }


    /**
     * draw - draws an animal that the user chooses.
     * @param choice (int)
     * @return none
     * 
     * Inside the function: 
     *  • Based on the choice, draw:
     *      1. a butterfly
     *      2. elephant
     *      3. bear
     *      4. snake
     */  
    public static void draw(int choice) {
        switch (choice) {

            // Case 1: Butterfly
            case 1: System.out.println("  .==-.                   .-==.     ");
                    System.out.println("   \\()8`-._  `.   .'  _.-'8()/     ");
                    System.out.println("   (88\"   ::.  \\./  .::   \"88)     ");
                    System.out.println("    \\_.'`-::::.(#).::::-'`._/      ");
                    System.out.println("      `._... .q(_)p. ..._.'         ");
                    System.out.println("        \"\"-..-'|=|`-..-\"\"       ");
                    System.out.println("        .\"\"' .'|=|`. `\"\".       ");
                    System.out.println("      ,':8(o)./|=|\\.(o)8:`.        ");
                    System.out.println("     (O :8 ::/ \\_/ \\:: 8: O)      ");
                    System.out.println("      \\O `::/       \\::' O/       ");
                    System.out.println("       \"\"--'         `--\"\"      ");
                    break;

            // Case 2: Elephant
            case 2: System.out.println("       _..--\"\"-.                  .-\"\"--.._ ");
                    System.out.println("   _.-'         \\ __...----...__ /         '-._");
                    System.out.println(" .'      .:::...,'              ',...:::.      '.");
                    System.out.println("(     .'``'''::;                  ;::'''``'.     )");
                    System.out.println(" \\             '-)              (-'             /");
                    System.out.println("  \\             /                \\             /");
                    System.out.println("   \\          .'.-.            .-.'.          /");
                    System.out.println("    \\         | \\0|            |0/ |         /");
                    System.out.println("    |          \\  |   .-==-.   |  /          |");
                    System.out.println("     \\          `/`;          ;`\\`          /");
                    System.out.println("      '.._      (_ |  .-==-.  | _)      _..'");
                    System.out.println("          `\"`\"-`/ `/'        '\\` \\`-\"`\"`");
                    System.out.println("               / /`;   .==.   ;`\\ \\");
                    System.out.println("         .---./_/   \\  .==.  /   \\ \\");
                    System.out.println("        / '.    `-.__)       |    `\"");
                    System.out.println("       | =(`-.        '==.   ;");
                    System.out.println("        \\  '. `-.           /");
                    System.out.println("         \\_:_)   `\"--.....-'");
                    break;

            // Case 3: Teddy Bear
            case 3: System.out.println("            ___   .--. ");
                    System.out.println("      .--.-\"   \"-' .- |");
                    System.out.println("     / .-,`          .'");
                    System.out.println("     \\   `           \\");
                    System.out.println("      '.            ! \\");
                    System.out.println("        |     !  .--.  |");
                    System.out.println("        \\        '--'  /.____");
                    System.out.println("       /`-.     \\__,'.'      `\\");
                    System.out.println("    __/   \\`-.____.-' `\\      /");
                    System.out.println("    | `---`'-'._/-`     \\----'    _");
                    System.out.println("    |,-'`  /             |    _.-' `\\");
                    System.out.println("   .'     /              |--'`     / |");
                    System.out.println("  /      /\\              `         | |");
                    System.out.println("  |   .\\/  \\      .--. __          \\ |");
                    System.out.println("   '-'      '._       /  `\\         /");
                    System.out.println("               `\\    '     |------'`");
                    System.out.println("                 \\  |      |");
                    System.out.println("                  \\        /");
                    System.out.println("                   '._  _.'");
                    System.out.println("                      ``");
                    break;
        
            // Case 4: Snake
            case 4: System.out.println("         ,,'6''-,.");
                    System.out.println("        <====,.;;--.");
                    System.out.println("        _`---===. \"\"\"==__");
                    System.out.println("      //\"\"@@-\\===\\@@@@ \"\"\\\\");
                    System.out.println("     |( @@@  |===|  @@@  ||");
                    System.out.println("      \\\\ @@   |===|  @@  //");
                    System.out.println("        \\\\ @@ |===|@@@ //");
                    System.out.println("         \\\\  |===|  //");
                    System.out.println("___________\\\\|===| //_____,----\"\"\"\"\"\"\"\"\"\"-----,_");
                    System.out.println("  \"\"\"\"---,__`\\===`/ _________,---------,____    `,");
                    System.out.println("             |==||                           `\\   \\");
                    System.out.println("            |==| |                             )   |");
                    System.out.println("           |==| |       _____         ______,--'   '");
                    System.out.println("           |=|  `----\"\"\"     `\"\"\"\"\"\"\"\"         _,-'");
                    System.out.println("            `=\\     __,---\"\"\"-------------\"\"\"''");
                    System.out.println("                \"\"\"\"		");
                    break;

            // Default case: Invalid option
            default: System.out.println("Invalid option!"); break;

        }
    }

}
