import java.util.Scanner;

/*
 * Bradley Allen
 * COSC 1174
 * October 8 2021
 * Homework 5 Fibonacci Sums
 * This program will promt the user for a integer,Then recursively compute the fibonacci number.
 * and the sum of all the fibonacci numbers up to and including that one.
 * Also it will ouput both in the console.
 */

public class Fibonacci {
	public static void main(String[] args) {
		//Declaring scanner input
		Scanner input = new Scanner(System.in);
		
		//prompting user to enter a integer
		System.out.println("Hello, Please enter a integer: ");
		
		//declaring fibonum  = to the number the user enters.
		int fibonum = input.nextInt();
		//declaring variabls	index = fibonum to keep track of index and fibonum
		int index = fibonum;
		//declaring the sum variables to add all fibonacci numbers.
		int sum = 0;
		//While loops that starts at fibonacci number and goes until index  = 0
		while(index !=0) {
			//Gets the fibonacci number and outputs it along with keep track of the index
			System.out.println("The fibonacci number at index: " + index + " is : "+ fibomethod(index));
			//Makes the sum;    sum += fibonacci number 
			sum += fibomethod(index);
			//subtracts the fibonum index and goes until it hits 0
			index--;
		}
		//Print the Sum of the fibonacci numbers.
		System.out.println("The sum of all fibonacci numbers are : " + sum);
	
		
	}//end of main
	
	//Recurssion method that will return the fibonacci number
	public static int fibomethod(int num) {
		//if the input is less then or equal to one just return the original
		if(num<=1)
			return num;
		//else return the fibonacci method with number -1 + fibonacci method with number-2
		return fibomethod(num-1) + fibomethod(num-2);
	}
	
}//end of fibonacci class
