 /*<Bradley Allen>

 *Description:
 * 	This program prompts the user to enter 10 integers.
 * 	The program then uses a Generic method to sort the list of integers.
 * 
 * This program solves the problem of needing a Generic sort to sort items.
 */

//imports
import java.util.ArrayList;
import java.util.Scanner;


//Main class
public class GenericSort{
		
	//sorting  the array of comparable objects in the list.
		public static <E extends Comparable <E>> void sort(ArrayList<E> list) {
			//declare variables.
			E currentMin;
			int currentMinIndex;
			
			//have a pointer to check each index.
			for(int i = 0; i< list.size() - 1; i++) {
				//get the min
				currentMin = list.get(i);
				currentMinIndex = i;
				
				for(int j = i+1; j<list.size(); j++) {
					//compare the min to the j
					if(currentMin.compareTo(list.get(j)) >0) {
						//update the new mininum and move pointer
						currentMin = list.get(j);
						currentMinIndex = j;
						
					}
				}
				//if min is not equal to the pointer
				if(currentMinIndex != i) {
					//swap
					list.set(currentMinIndex, list.get(i));
					list.set(i, currentMin);
				}
			}
		}
	
		//main method
	  public static void main(String[] args) {
		 //create a scanner to get user input
		 Scanner input = new Scanner(System.in);
		 
		 //create two array lists one for Strings and one for Integers
		 ArrayList<String> arraystring = new ArrayList<String>();
		 ArrayList<Integer> arrayint = new ArrayList<Integer>();
		 
		 
		 //prompt the user to enter a string
		 System.out.print("Enter 10 integers: ");
		 
		 //Get the 10 Integers and add them to the list.
		 for(int i = 0; i<10; i++) {
		 int value = input.nextInt();
		 arrayint.add(value);
		 }
		 
		 // use the Generic sort and display the list.
		 sort(arrayint);
		 System.out.println(arrayint);
		 
		 //prompt the user to enter 5 strings.
		 System.out.print("Enter 5 strings: ");
		 
		 //Get the 5 strings and add them to the list.
		 for(int i = 0; i<5; i++) {
			 String val = input.next();
			 arraystring.add(val);
			 }
		 
		 // use the Generic sort and display the list
		 sort(arraystring);
		 System.out.println(arraystring);
	  }
}
