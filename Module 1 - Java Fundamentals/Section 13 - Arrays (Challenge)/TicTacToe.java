import java.util.Scanner;

/**
 * Challenge 6 - Tic Tac Toe
 */

public class TicTacToe {

    // Create the Scanner
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        
        // Prompt the user to play Tic Tac Toe
        System.out.println("\nLet's play Tic Tac Toe");

        // Create the board
        char[][] board = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'}
        };

        // Print the board
        printBoard(board);

        // Play the game :)
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                System.out.println("\nTurn: X");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'X';
            } else {
                System.out.println("\nTurn: O");
                int[] spot = askUser(board);
                board[spot[0]][spot[1]] = 'O';
            }
            printBoard(board);
            if (checkWinner(board) == 3) {
                System.out.println("X wins!");
                break;
            } else if (checkWinner(board) == -3) {
                System.out.println("O wins!");
                break;
            } else if (i == 8) {
                System.out.println("It's a tie!");
            }
        }

        // Close the Scanner
        scan.close();
    }


    /** 
     * printBoard() - prints the Tic Tac Toe board
     * @param board (char[][])
     * @return none
     */       
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {  
            System.out.print("\n\t");
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    } 

   /** 
     * askUser() - function that lets the user choose a spot
     * @param board (char[][] board)
     * @return spot (int[])
     * 
     * Inside the function
     *   1. Asks the user: - pick a row and column number: 
     *   2. Check if the spot is taken. If so, let the user choose again.
     *   3. Return the row and column in an int[] array.
     * 
     */
    public static int[] askUser(char[][] board) {
        int[] spot = new int[2];
        System.out.print("- pick a row and column number: ");
        spot[0] = scan.nextInt();
        spot[1] = scan.nextInt();
        while (board[spot[0]][spot[1]] != '_') {
            System.out.print("Spot taken! Try again: ");
            spot[0] = scan.nextInt();
            spot[1] = scan.nextInt();
        }
        return spot;
    }

    /** 
     * checkWin() - function that determines the winner
     * @param board (char[][])
     * @return count (int)
     * 
     * Inside the function:
     * checkRow() - checks every row for a straight X or straight O.
     * checkColumn() - checks every column for a straight X or straight O
     * checkLeft() - checks the left diagonal for a straight X or straight O (Task 9).
     * checkRight() - checks the right diagonal for a straight X or straight O (Task 10).
     */
    public static int checkWinner(char[][] board) {
        
        // Check the rows for win
        int rows = checkRows(board);
        if (Math.abs(rows) == 3) return rows;

        // Check the columns for win
        int columns = checkColumns(board);
        if (Math.abs(columns) == 3) return columns;

        // Check the left diagonal for win
        int left = checkLeft(board);
        if (Math.abs(left) == 3) return left;

        // Check the right diagonal for win
        int right = checkRight(board);
        if (Math.abs(right) == 3) return right;

        return -1;
    }

    /**
     * checkRows() - checks every row for a straight X or straight O
     * @param board (char[][])
     * @return int
     */
    public static int checkRows(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 'X') {
                    count++;
                } else if (board[i][j] == 'O') {
                    count--;
                }
            }
            if (Math.abs(count) == 3) {
                return count;
            } else {
              count = 0;
            }
        }
        return count;
    }
  
    /**
     * checkColumns() - checks every column for a straight X or straight O
     * @param board (char[][])
     * @return int
     */
    public static int checkColumns(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[j][i] == 'X') {
                    count++;
                } else if (board[j][i] == 'O') {
                    count--;
                }
            }
            if (Math.abs(count) == 3) {
                return count;
            } else {
              count = 0;
            }
        }
        return count;
    }
  
    /**
     * checkLeft() - checks the left diagonal for a straight X or a straight O
     * @param board (char[][])
     * @return int
     */
    public static int checkLeft(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X') {
                count++;
            } else if (board[i][i] == 'O') {
                count--;
            }
        }
        return count;
    }
  
    /**
     * checkRight() - checks the right diagonal for a straight X or straight O
     * @param board (char[][])
     * @return int
     */
    public static int checkRight(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            if (board[2-i][i] == 'X') {
                count++;
            } else if (board[2-i][i] == 'O') {
                count--;
            }
        }
        return count;
    }
  
}
