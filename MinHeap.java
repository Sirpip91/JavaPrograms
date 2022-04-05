/*<Bradley Allen>
 *
 *Description:
 * 		This is a Java program that will implement the min-heap
 * data structure. A min-Heap is a heap in which each node is <= to any of its children.
 * This program will take in a unsorted generic data type and  output the sorted data type.
 * The program is tested with STRINGS and INTEGERS.
 * 
 * 
 */

//imports

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


//Main class
public class HeapAssignment{
	
	
	
	
	// Main method.
	  public static void main(String[] args) {
		
		  
		  /** test with Integers */
			Integer[]myIntegers={8, 9, 2, 3, 4, 1, 5, 6, 7};
			System.out.println("Unsorted Integers in the array: ");
			for (int i = 0; i <myIntegers.length; i++)					
				System.out.print(myIntegers[i] + " ");						//GENERIC data type
			 System.out.println();			
			 MinHeap<Integer> heap = new MinHeap<Integer>(myIntegers);
		 System.out.println("Sorted Integers: ");
			while (heap.getSize() > 0)
				 System.out.print(heap.remove() + " ");
			System.out.println();
				    
			/** test with Strings */
			String[]myStrings = {"Computer " , "Science ", "Rocks "};
			System.out.println("Unsorted Strings in the array: ");
		 for (int i = 0; i <myStrings.length; i++)	
				System.out.print(myStrings[i]);
			System.out.println();
			System.out.println("Sorted Strings: ");                      //GENERIC data type
			MinHeap<String> stringHeap = new MinHeap<String>(myStrings);
			while (stringHeap.getSize() > 0)
				 System.out.print(stringHeap.remove());


			
}//end of main
	  
}//end of main class

//Min heap class
class MinHeap<E extends Comparable<E>> { //GENERIC data type
	  private java.util.ArrayList<E> list = new java.util.ArrayList<E>();

	  /** Create a default heap */
	  public MinHeap() {
	  }

	  /** Create a heap from an array of objects */
	  public MinHeap(E[] objects) {
	   for (int i = 0; i < objects.length; i++)
	    add(objects[i]);
	  }

	  /** Add a new object into the heap */
	  public void add(E newObject) {
	   list.add(newObject); 
	   int currentIndex = list.size() - 1; 

	   while (currentIndex > 0) {
	    int parentIndex = (currentIndex - 1) / 2;
	    // Swap if the current object is greater than its parent
	    if (list.get(currentIndex).compareTo(list.get(parentIndex)) < 0) {
	     E temp = list.get(currentIndex);
	     list.set(currentIndex, list.get(parentIndex));
	     list.set(parentIndex, temp);
	    } else
	     break; 

	    currentIndex = parentIndex;
	   }
	  }

	  /** Remove the root from the heap */
	  public E remove() {
	   if (list.size() == 0)
	    return null;

	   E removedObject = list.get(0);
	   list.set(0, list.get(list.size() - 1));
	   list.remove(list.size() - 1);

	   int currentIndex = 0;
	   while (currentIndex < list.size()) {
	    int leftChildIndex = 2 * currentIndex + 1;
	    int rightChildIndex = 2 * currentIndex + 2;

	    // Find the maximum between two children
	    if (leftChildIndex >= list.size())
	     break; // The tree is a heap
	    int maxIndex = leftChildIndex;
	    if (rightChildIndex < list.size()) {
	     if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) > 0) {
	      maxIndex = rightChildIndex;
	     }
	    }

	    // Swap if the current node is less than the maximum
	    if (list.get(currentIndex).compareTo(list.get(maxIndex)) > 0) {
	     E temp = list.get(maxIndex);
	     list.set(maxIndex, list.get(currentIndex));
	     list.set(currentIndex, temp);
	     currentIndex = maxIndex;
	    } else
	     break; 
	   }

	   return removedObject;
	  }

	  /** Get the number of nodes in the tree */
	  public int getSize() {
	   return list.size();
	  }
	
	  
	 }
//end of min heap class

	


