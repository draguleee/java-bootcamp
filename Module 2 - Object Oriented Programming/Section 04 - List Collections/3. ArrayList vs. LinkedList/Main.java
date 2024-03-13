import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
	
	public static void main(String[] args) {

        // Create a LinkedList and an ArrayList
		List<Integer> linkedList = new LinkedList<>();
		List<Integer> arrayList = new ArrayList<>();

        // Populate both lits with 11.000.000 entries
        for(int i = 0; i < 11_000_000; i++) {
			linkedList.add(i);
            arrayList.add(i);
        }


        /******************FETCHING DATA******************/
        /** This test will check which type of list grabs the 4.500.000th element faster. */

        System.out.println("\nFETCHING DATA: ");

        // LinkedList
        long start = System.currentTimeMillis();
		linkedList.get(4_500_000);
        System.out.println("\tLinkedList: " + (System.currentTimeMillis() - start) + "ms");

        // ArrayList
        start = System.currentTimeMillis();
		arrayList.get(4_500_000);
        System.out.println("\tArrayList: " + (System.currentTimeMillis() - start) + "ms");
        

        /******************FIRST / LAST INDEX******************/
        /** This test will check how long it takes to grab the first and last element for both types of list */

        System.out.println("\nFIRST / LAST INDEX");

        // LinkedList
        start = System.currentTimeMillis();
		linkedList.get(0);
        linkedList.get(linkedList.size() - 1);
        System.out.println("\tLinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
		arrayList.get(0);
        arrayList.get(arrayList.size() - 1);
        System.out.println("\tArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************INSERTION FROM MIDDLE******************/
        /**This test will check how long will it take to add an elemen in the middle for both types of list */

        System.out.println("\nINSERTION FROM MIDDLE");

        // LinkedList
        start = System.currentTimeMillis();
        linkedList.add(5, 121); // insert 121 at index 5
        System.out.println("\tLinkedList: " + (System.currentTimeMillis() - start) + "ms");

        // ArrayList
        start = System.currentTimeMillis();
        arrayList.add(5, 121);  // insert 121 at index 5
        System.out.println("\tArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************INSERTION******************/
        /** This test checks how long it takes to insert an element at the end for both types of list*/

        System.out.println("\nINSERTION");

        // LinkedList
        start = System.currentTimeMillis();		
        linkedList.add(5);
        System.out.println("\tLinkedList: " + (System.currentTimeMillis() - start) + "ms");

        // ArrayList
        start = System.currentTimeMillis();
        arrayList.add(5);
        System.out.println("\tArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************REMOVAL******************/
        /** This test checks how long it takes to remove an element from the middle for both types of list */
        
        System.out.println("\nREMOVAL");

        // LinkedList
        start = System.currentTimeMillis();			
        linkedList.remove(400);
        System.out.println("\tLinkedList: " + (System.currentTimeMillis() - start) + "ms");

        // ArrayList
        start = System.currentTimeMillis();			
        arrayList.remove(400);
        System.out.println("\tArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************UPDATES******************/
        /** This test checks how long it takes to update an element for both types of list */

        System.out.println("\nUPDATES");

        // LinkedList
        start = System.currentTimeMillis();					
		linkedList.set(4_500_000, 5);
        System.out.println("\tLinkedList: " + (System.currentTimeMillis() - start) + "ms");

        // ArrayList
        start = System.currentTimeMillis();			
		arrayList.set(4_500_000, 5);
        System.out.println("\tArrayList: " + (System.currentTimeMillis() - start) + "ms");

	}

}
