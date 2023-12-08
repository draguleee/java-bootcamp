import java.util.Arrays;

/**
 * Workbook 6.12 - Lottery Tickets
 */

public class LotteryTickets {
    public static void main(String[] args) {
        
        // Create an array to store 6 integer numbers 
        // The integer numbers represent lottery numbers
        int[] ticket1 = {34, 43, 45, 65, 21, 54};

        // Copy all the elements of ticket1 to ticket2
        // Change the third value to 54
        int[] ticket2 = Arrays.copyOf(ticket1, ticket1.length);
        ticket2[2] = 54;

        // Print the tickets
        System.out.print("Ticket 1 numbers: ");
        printTicketNumbers(ticket1);
        System.out.print("Ticket 2 numbers: ");
        printTicketNumbers(ticket2);
    } 

    /**
     * printTicketNumbers - prints the number from a 6/49 lottery ticket
     * @param ticket (int[])
     * @return none
     */
    public static void printTicketNumbers(int[] ticket) {
        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " ");
        }
        System.out.println();
    }
}

