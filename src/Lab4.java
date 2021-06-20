/* Author : Noah Mitrevski
 * File Name : Lab3.java
 * Specification: This program will ask for options 1 - 4 and then a number to then later do some calculations
 * For : CSE110 Lab #3 
 * Time spent : 1 hour 
 */


import java.util.Scanner;
public class Lab4 {
	public static void main(String[] args) {
		
		//declaring variables
		int option, num1 = 0, i, num2 = 1; 
		boolean answer = false; 
		Scanner Scan = new Scanner(System.in);
		
			//having the do loop
			do {
			displayMenu();
			option = Scan.nextInt();
				switch(option) {
					case(1):
						System.out.print("Enter a number: ");
						num1 = Scan.nextInt();
						num2 = 0; 
				 	for(i = num1; i >= 0; i--) {//using a for loop to make everything cleaner 
				 		num2 = num2 + i; //method of finding the sumation using a loop 
				 	}
				 		System.out.println(num2);
				 	break;
				case(2):
						System.out.print("Enter a number: ");
						num1 = Scan.nextInt();
						num2 = 1; 
					for(i = 1; i <=  num1; i++) {
						num2 = num2*i; //method of find the factorial using a loop
					}
						System.out.println(num2);
					break;
				case(3):
						System.out.print("Enter a number: ");
						num1 = Scan.nextInt();
						for(i = 10; i < num1; i *= 10 ) {
							num2 = num1/i; //The method of fun the left most number by dividing the entire thing by 10's, 100's... 
						}
						System.out.println(num2);
					break;
				case(4):
						System.out.println("Bye"); //prompt for them leaving the program
						answer = true; 
					break;
				default:
						System.out.println("Wrong Choice!");
					break;
				}
		}while(answer != true);//finishing the do loop 
	Scan.close(); //closing the scanner
}
	
	
	private static void displayMenu(){ //creating the method so that it is easier to add it to main code
		System.out.println("Please choose one option from the following menu: ");
		System.out.println("1) Calculate the sum of integers from 1 to m");
		System.out.println("2) Calculate the factorial of a given number");
		System.out.println("3) Display the leftmost digit of a given number");
		System.out.println("4) quit");
	}
}

/*Output :Please choose one option from the following menu: 
		1) Calculate the sum of integers from 1 to m
		2) Calculate the factorial of a given number
		3) Display the leftmost digit of a given number
		4) quit
		3
		Enter a number: 443
		4
		Please choose one option from the following menu: 
		1) Calculate the sum of integers from 1 to m
		2) Calculate the factorial of a given number
		3) Display the leftmost digit of a given number
		4) quit
		4
		Bye
 * 
 */
