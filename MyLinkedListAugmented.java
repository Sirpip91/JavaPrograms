/*<Bradley Allen>
 *COSC 2336-01
 *Instructor: Jiangjiang Liu
 *Programming Assignment 7
 *Due: 3/28/22
 *Submitted: 3/25/22
 *
 *Description:
 * 		This class 'MylinkedListAugmented' is the test class.
 * That contains the main method and runs all of the test from the assignment.
 * 
 * This program is meant to show the methods of linked list and implement them.
 * From Listing 24.5 The program is finished and implemented with tests.
 * 
 * There are 4 classes to this program.
 * -MyList,  -MyLinkedList, -MyLinkedListAugmented, -MyLinkedListExtra
 * All of them work together since the listing was from the textbook
 */

//imports
import java.util.Scanner;

//class
public class MyLinkedListAugmented {
	  /** Main method */
	  public static void main(String[] args) {
	    // Create a list for strings
	    MyLinkedList<String> list = new MyLinkedList<String>();
	    
	    //scanner for input
	    Scanner input = new Scanner(System.in);

	    // Add elements to the list
	    list.add("Mike");
	    list.add("Jim");
	    list.add("Alice");
	    list.add("George");
	    list.add("Stevie");
	    list.add("Cheryl");
	    list.add("George");
	    list.add("Jane");
	    list.add("Ella");
	    list.add("Jenny");
	    list.add("Kathy");
	    list.add("Jane");
	    
	    //show original list
	    System.out.println("Original List:");
	    System.out.println(list);
	    //ask for name input and store in name variable
	    System.out.print("Enter a name: ");
	    String name = input.next();
	    //Ask for index to store and store in index variable
	    System.out.print("Enter an index at which to store this name: ");
	    int index = input.nextInt();
	    //add the name and index to the linkedlist
	    list.add(index, name);
	    //output new list
	    System.out.println("Revised list: ");
	    System.out.println(list);
	    //show that list.contains method works
	    System.out.println("List contains " + name +": " + list.contains(name));
	    System.out.println("Item at Index 3: " + list.get(3));
	    //show list.indexOf works
	    System.out.println("Index of George: " + list.indexOf("George"));
	    //show that lastIndexOf works
	    System.out.println("Last index of George: " + list.lastIndexOf("George"));
	  }
	}