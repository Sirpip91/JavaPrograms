/* Bradley Allen
 * COSC-1173
 * 07/20/2021
 * HW 6
 * Chapter 8 Multidimensional Arrays
 * This is a program that will store students last name, first name, ID , and major into a 2d mulitdimensional array
 * and allow the user to use different methods such as
 * add student, remove student, sort student by last name, print class roll
 * 
 */

//This is the package allen
package allen;
//Imports

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


//This is the class that will contain all of the program
public class RollCalls {
	
	static //Initializing variables that will store information
	Scanner input = new Scanner(System.in);
	static int columncounter = 0;
	static int rowcounter = 0;
	static String Lastname, Firstname, ID, Major;
	static String[][] Students = new String[4][20];

	//add student to class method
	public static void AddStudent() {
		
		//check if full
		if(Students[rowcounter][columncounter] != null) {
			System.out.println("This DATA is FULL");
		}else {
			
		//Ask User for Last Name
		System.out.println("Enter Lastname: ");
		//Scan Last Name
		Lastname = input.next();
		//Insert data into 2d array
		Students[rowcounter][columncounter] = Lastname;
		//itterat
		rowcounter++;
		//First name
		System.out.println("Enter Firstname: ");
		Firstname = input.next();
		Students[rowcounter][columncounter] = Firstname;
		rowcounter++;
		//ID
		System.out.println("Enter ID: ");
		ID = input.next();
		Students[rowcounter][columncounter] = ID;
		rowcounter++;
		//Major
		System.out.println("Enter Major: ");
		Major = input.next();
		Students[rowcounter][columncounter] = Major;
		rowcounter++;
		//Reset row counter and go to next column
		rowcounter=0;
		columncounter ++;
		}
	}
	
	//Remove a student
	public static void RemoveStudent() {
		//check if there are items
		if(Students[rowcounter][columncounter] == null) {
		//Go to previous column
		columncounter--;
		//Say what was removed
		System.out.println("Student with the Last name: " + Students[0][columncounter] + " Was removed.");
		//loop that makes all rows in the column null(deleting)
		for(int i = 0; i<4; i++)
		Students[i][columncounter] = null;
		}
		else
			System.out.println("NO ITEMS in ARRAY");
	}
	
	//Search for a certain Catagory
	public static void SearchStudent() {
		//get the search input
		System.out.println("Enter What you want to search for: ");
				String search = input.next();
		//go through each  index
	        for(int row = 0; row<Students.length; row++) {
	        			for(int col = 0; col<Students.length; col ++) {
	        	//if the index == search than show the match row and column
	        			if(Students[row][col].equals(search)) {
	        				for(int i = 0; i<4; i++)
	        					System.out.println("Match Found " + Students[i][col]);
	        			}
	        			else
	        				// else output no matches
	        				System.out.println("No matches");	
	        		}
	        	}
		  }
	//Sort Students by Last name
	public static void SortStudent() {
		//sort the array by row 
		Arrays.sort(Students, (o1, o2) -> {
		    String firstO1Element = o1[0];
		    String firstO2Element = o2[0];
		    return firstO1Element.compareTo(firstO2Element);
		});
	}
	//print
	public static void PrintStudent() {
		//2 for loops to go through each row and column and output the data
		for(int row =0; row<Students.length;row++) {
			for(int col = 0; col < Students.length; col++) {
				System.out.println(Students[col][row]);
			}
		}
	}

	
	//Main
	public static void main(String args[]) {
		//option fo the case
		int option;
		
		// Loop for the menu
		do {
			
		System.out.println("Select option you would like to perform. Enter 0 to Exit.");
		System.out.println("1. Add Student");
		System.out.println("2. Remove Student");
		System.out.println("3. Search for a Student");
		System.out.println("4. Sort all Students");
		System.out.println("5. Print all Students");
	
		option = input.nextInt();
		// this is the switch for the menu and will loop until 0 is entered
		switch(option) {
		case 1: 
			System.out.println("Add Student Operation called: ");
			AddStudent();
			break;
		case 2:
			System.out.println("Remove Student Operation called: ");
			RemoveStudent();
			break;
		case 3:
			System.out.println("Search Student Operation called: ");
			SearchStudent();
			break;
		case 4:
			System.out.println("Sort Student Operation called: ");
			SortStudent();
			break;
		case 5:
			System.out.println("Print Student Operation called: ");
			PrintStudent();
			break;
		
			default: System.out.println("Enter a valid operation");
		}

	
		} while(option != 0);
	};//end of main
}//end of class

