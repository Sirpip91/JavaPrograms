/*
 * Bradley Allen
 * Homework 2
 * 06/15/2021
 * COSC 1173
 * This is a program that will calculate what happens to a spaceship in flight from earth.
 * The program will calculate the damage done to the ship from aliens 3 times.
 * Each attack will randomly have between 1% and %35 damage.
 * The information of each attack and the status of the ship will be printed out using println.
 */


//Importing Math.random() to generate the random attack numbers.
import java.util.Random;

//Declaring the class
public class AlienAttack {
	
	//Method to determine ship Text Description and print the total damage. where a is total damage
	static void shipStatus(int a) {
		
		//the output if total damage is 0-10%
		if(a >= 0 && a <= 10) {
			System.out.println("Total damage taken: " + a + "% "  + "The ship is lightly damaged\n");
		}
		//the output if total damage is 11-25%
		else if(a >= 11 && a <= 25) {
			System.out.println("Total damage taken: " + a + "% "  + "The ship is leaking air\n");
		}
		//the output if total damage is 26-50%
		else if(a >= 26 && a <= 50) {
			System.out.println("Total damage taken: " + a + "% "  + "The ship is in trouble\n");
		}
		//the output if total damage is 51-75%
		else if(a >= 51 && a <= 75) {
			System.out.println("Total damage taken: " + a + "% "  + "The ship is badly damaged\n");
		}
		//the output if total damage is 76-99%
		else if(a >= 76 && a <= 99) {
			System.out.println("Total damage taken: " + a + "% "  + "The ship is critical\n");
		}
		//the output if total damage is 100% or more
		else if(a >= 100) {
			System.out.println("Total damage taken: " + a + "% "  + "The ship has been destroyed\n");
		}
		
	}

	
	
	//The main method 
	public static void main(String args[]) {


		// Creating three alienattack variables and making them hold random numbers(the attack damage)
		int alienattack1 = (int)(Math.random() * 35) + 1;
		int alienattack2 = (int)(Math.random() * 35) + 1;
		int alienattack3 = (int)(Math.random() * 35) + 1;
		
		// this will store the total damage throughout the program.
		int totaldamage;
		
		
		//printing the starting ship health
		System.out.println("Your ship is at 100% strenght!\n");
		
		//printing the first attack and the damage taken
		System.out.println("Incoming alien attack: " + alienattack1 + "% damage taken");
		//making the total damage = to the first attack
		totaldamage = alienattack1;
		//Printing out ship textdescription and total damage using shipStatus method
		shipStatus(totaldamage);
		
		//printing the second attack and the damage taken
		System.out.println("Incoming alien attack: " + alienattack2 + "% damage taken");
		//adding the first and second attack and storing it in the totaldamage variable
		totaldamage = alienattack1 + alienattack2;
		//Printing out ship textdescription and total damage using shipStatus method
		shipStatus(totaldamage);
		
		//printing the third attack and the damage taken
		System.out.println("Incoming alien attack: " + alienattack3 + "% damage taken");
		//adding the first second and third attack and storing it in the totaldamage variable
		totaldamage = alienattack1 + alienattack2 + alienattack3;
		//Printing out ship textdescription and total damage using shipStatus method
		shipStatus(totaldamage);
		
	}
	
	
	
}
