/*
 * Bradley Allen
 * COSC 1174
 * October 15 2021
 * Homework 6 Shuffling and Sorting    Generics
 * This program will have two method shuffling and sorting and each are generic.
 * The the original array, sorted list, and shuffled list will all be outputed to the console.
 * 
 */

//imports
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//class shufflesort contains main
public class ShuffleSort{
	public static void main(String[] args) {
	
	//creating a object array  and filling it with objects
	ArrayList<Rectangle> rectArray = new ArrayList<Rectangle>(); 
	rectArray.add(new Rectangle(100,"Large Rectangle"));
	rectArray.add(new Rectangle(25,"Small Rectangle"));
	rectArray.add(new Rectangle(55,"Medium Rectangle"));
	
	//creating a String Array	and filling it with strings
	ArrayList<String> stringArray = new ArrayList<>();
	stringArray.add("dog");
	stringArray.add("apple");
	stringArray.add("fight");
	stringArray.add("elephant");
	stringArray.add("cat");
	
	//creating a integer array	and filling it with integers
	ArrayList<Integer> intArray = new ArrayList<>();
	intArray.add(4);
	intArray.add(2);
	intArray.add(5);
	intArray.add(3);
	intArray.add(1);
	
	
	
	
	/*			This is Sorting & Shuffling Object Array					*/
	System.out.println("\t\t\t\t\t\t OBJECT ARRAY");
	System.out.println("Original:");
	//prints object
	for(Rectangle rect: rectArray)
	{
		System.out.println(rect.name + "   " + rect.area );
	}
	//sorts object
	Collections.sort(rectArray,new rectangleComparator());
	System.out.println();
	//ouputs sorted objects
	System.out.println("After Sorting:");
	for(Rectangle rect: rectArray)
	{
		System.out.println(rect.name + "   " + rect.area );
	}
	
	System.out.println();
	System.out.println("After Shuffling:");
	//shuffles object
	shuffle(rectArray);
	//outputs shuffled object
	for(Rectangle rect: rectArray)
	{
		System.out.println(rect.name + "   " + rect.area );
	}
	System.out.println();
	
	
	/*			This is Sorting & Shuffling String Array					*/
	//original stirng array
	System.out.println("\t\t\t\t\t\t STRING ARRAY");
	System.out.println("Original:");
	System.out.println(stringArray);
	System.out.println();
	//sorts String Array
	System.out.println("After Sorting:");
	sort(stringArray);
	System.out.println(stringArray);
	System.out.println();
	System.out.println("After Shuffling:");
	//shuffles string array and outputs to console
	shuffle(stringArray);
	System.out.println(stringArray);
	System.out.println();
	
	/*			This is Sorting & Shuffling Integer Array					*/
	//original integer array
	System.out.println("\t\t\t\t\t\t INTEGER ARRAY");
	System.out.println("Original:");
	System.out.println(intArray);
	System.out.println();
	//Sorts int Array
	System.out.println("After Sorting:");
	sort(intArray);
	System.out.println(intArray);
	System.out.println();
	//Shuffles int Array
	System.out.println("After Shuffling:");
	shuffle(intArray);
	System.out.println(intArray);
	System.out.println();
	
}//end of main

	// The sort method or algorthim from the book example problem	USES GENERICS
    public static <E extends Comparable<E>> void sort(ArrayList<E> list) {
    	//goes through the entire list
        for (int i = 0; i < list.size() - 1; i++) {
            E currentMin = list.get(i);
            int min = i;
            for (int j = i + 1; j < list.size(); j++) {
            	//compares current to the min
                if (list.get(j).compareTo(currentMin) < 0) {
                    currentMin = list.get(j);
                    min = j;
                }
            }
            //move up
            if (min != i) {
                list.set(min, list.get(i));
                list.set(i, currentMin);
            }
        }
    }//end of sort method
	
    //Shuffle method from the book example problem			USES GENERICS
	 public static <E> void shuffle(ArrayList<E> list) {
		 	//has a random number and makes that index random  which shuffles them
	        for (int i = 0; i < list.size(); i++) {
	        	//random num times the list size
	            int random = (int) (Math.random() * list.size());
	            E tmp = list.get(random);
	            //sets the shuffled
	            list.set(random, list.get(i));
	            list.set(i, tmp);
	        }
	    }//end of Shuffle Method
	 
}//end of ShuffleSort Class

//rectangle object class
class Rectangle{
	//area variable
int area;
// name variable
String name;
//constructor
Rectangle( int area, String name){
	this.area = area;
	this.name = name;
}
}//end of rectangle class

//THis is what compares the objects 
class rectangleComparator implements Comparator<Rectangle>{
	
	//compares two objects and sorts them
	public int compare(Rectangle r1, Rectangle r2) {
		if(r1.area == r2.area) 
				return 0;
			else if (r1.area>r2.area) 
				return 1;
			else 
				return -1;
	}
}



