/* Author : Noah Mitrevski
 * File Name : Lab02.java
 * Specification : This program is going to get the first name and last name from user input and conjoin them, as well as count the number of characters 
 * For : CSE110 Lab #2
 * Time Spent : 40 minutes
 */
import java.util.Scanner; //The import for user input
public class Lab2 {
	public static void main(String[]args) {
		// Declaring variables
		String firstName = ""; 
		String lastName = "";
		String fullName = ""; 
		int nameLength; 
		
		Scanner scan = new Scanner(System.in); // creating a scanner object
		
		System.out.print("Please insert your first name: "); // Creating the scene with user input
		firstName = scan.nextLine();
		
		System.out.print("Please insert your last name: ");
		lastName = scan.nextLine(); // more user input
		
		fullName = firstName + " " + lastName; // Combining the first name and the last name
		
		System.out.println("Your full name in capitals is: " + fullName.toUpperCase()); // converts name to capitols
		
		nameLength = fullName.length() - 1; //finding the length of the name and subtracting one to account for the "space"
		System.out.println("Number of characters: " + nameLength);
	
		// declaring more variables
		String title1 = new String("cse110");
		String title2 = "cse110";
		
		scan.close(); // this closes the scanner, any scanner after this would not work unless a new object is created
		
		// if statement to say whether one works and the other does not
		if (title1 == title2) {
			System.out.println("String comparison using \"==\" sign work");
		}else {
			System.out.println("String comparison using \"==\" sign does NOT work");
		}
		// Another if statement to say that one works and the other does not
		if(title1.equals(title2)) {
			System.out.println("String comparison using \"equals\" method works");
		}
		else {
			System.out.println("String comparison using \"equals\" method does NOT work");
		}
		
	}	
}
/*
  	Please insert your first name: Noah
	Please insert your last name: Mitrevski
	Your full name in capitals is: NOAH MITREVSKI
	Number of characters: 13
	String comparison using "==" sign does NOT work
	String comparison using "equals" method works
 */
