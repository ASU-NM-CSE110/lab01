/*CSE 110 : 40448 / M-Th 6:00 - 7:15 
 * Assignment : Assignment 3
 * Author : Noah Mitrevski 1219008323
 * Description : This program will play a small game called mastermind and ask to play the game again once you are finished
 */
//importing the tools I will be using
import java.util.Random;
import java.util.Scanner;
public class Assignment04 {
	 public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);//creating the scanner
		 boolean finished = false;//declaring intial variable
		
		
		 while(finished != true) {
			 
			 //declaring the rest of the variables
			 Random rand = new Random();
			 int randNum = rand.nextInt(9000)+1000; 
			 int guess = 1;
			 int num; 
			 int nextNumber = 10;
			 String yN ="";
			 
			 //setting initial script
			 System.out.println("---- MASTERMIND ----");
			 System.out.println("Guess the 4 digit number!");
			 
			  
			
			 for(int matched = 0; matched != 4; guess++) {//for loop to make things cleaner
				 
				 System.out.print("Guess " + guess +":");
				 num = scan.nextInt();
				 matched = 0;
				 nextNumber = 10;
				 for(int i = 0; i < 4; i++){// another for loop but to find the digits individually
			
					 int num1 = (num%nextNumber)/(nextNumber/10);// find the modulus of the number and then divide it by nextNumber(10) divided by 10
					 int randNum1 = (randNum%nextNumber)/(nextNumber/10);// the same thing but with the random number
					 	
					 nextNumber = nextNumber * 10; //multiply by 10 so it increases with the numbers
					 
					 if(num1 == randNum1) {
						  matched++; // adds to matched 
						  
					 	} 	
				 }
				 System.out.println("You matched: "+ matched);
		 }
			 //setting up the script 
			System.out.println("Congratulations you guessed the number in " + (guess-1) + " guesses");
			System.out.print("Would you like to play again? yes/no: ");
				yN = scan.next();
				if(yN.equals("no")) {
				finished = true;
				System.out.println("Thank you for playing");
			}
}
}
}
/*Output: 
 
	---- MASTERMIND ----
	Guess the 4 digit number!
	Guess 1:0000
	You matched: 0
	Guess 2:1111
	You matched: 0
	Guess 3:2222
	You matched: 1
	Guess 4:2333
	You matched: 1
	Guess 5:3233
	You matched: 3
	Guess 6:3243
	You matched: 2
	Guess 7:3234
	You matched: 4
	Congratulations you guessed the number in 7 guesses
	Would you like to play again? yes/no: no
	Thank you for playing

*/