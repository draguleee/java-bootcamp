// Continue and Break

public class ContinueBreak {
    public static void main(String[] args) {
        
        // Continue - skips a run, then proceed to the next one
        for(int i=0 ; i<=10 ; i++) {
            if(i%2 != 0) {
                continue;
            }
            System.out.println(i);
        }

        // Break - completely breaks the loop
        for(int i=0 ; i<=10 ; i++) {
            if(i%2 != 0) {
                break;
            }
            System.out.println(i);
        }
    }
}