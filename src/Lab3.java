/* Author : Noah Mitrevski
 * File Name : Lab3.java
 * Specification : This program calculates the students final grade of the class, and is able to detect whether the input is valid or not
 * For : CSE110 Lab #3
 * Time Spent : 1 hour 20 minutes
 */
import java.util.Scanner; // Allows for user input

public class Lab3 {
	public static void main(String[] args) {
		// Defining variables 
		Scanner Scan = new Scanner(System.in);
		double HomeWork = 0;
		double midTerm = 0;
		double finalExam = 0;
		int i = 0; 
		int tries = 3;
	
		
		while(i != 3) { // A while loop so that it keeps repeating if the desired outputs are not met
			
			switch(i) { // switch statement to make it a little bit more cleaner and efficient than an if statement
			
				case(0): 
						System.out.print("Please input your homework grade: ");
						HomeWork = Scan.nextDouble();
			
					if(HomeWork >= 0 && HomeWork <= 100) {
						i = 1;
					}else{
						tries = tries - 1; 
						System.out.println("Invalid response, test scores should be between [0,100]");
						System.out.println("(" + tries + " chances left)");
					}
						if(tries == 0) {
							i = 4; 
					}
				break;
				case(1): 
						System.out.print("Please input your midterm grade: ");
						midTerm  = Scan.nextDouble();
			
					if(midTerm >= 0 && midTerm <= 100) {
						i = 2;
					}else{
						tries = tries - 1; // "tries" gets changed every time 
						System.out.println("Invalid response, test scores should be between [0,100]");
						System.out.println("(" + tries + " chances left)");
					}
					if(tries == 0) {
						i = 4; 
					}
				break;
				case(2):
						System.out.print("Please input your final exam grade: ");
						finalExam = Scan.nextDouble();
			
					if(finalExam >= 0 && finalExam <= 200) {
						i = 3;
					}else{
						tries = tries - 1; 
						System.out.println("Invalid response, test scores should be between [0,200]");
						System.out.println("(" + tries + " chances left)");
					}
					if(tries == 0) {
						i = 4; 
					}
				break; 
				case(4):
						System.out.println("Too many tries please try again!");
						i = 0; // resets the program
						tries = 3; // resets the tries so it does not go into negatives
				}
				
					if(i == 3) { // The final grade calculator
						double finalScore = (finalExam /200 * 50) + (midTerm * 0.25) + (HomeWork * 0.25); // equation for the grade
						System.out.println("[INFO] Students Weighted Total is: " + finalScore);
				
					if(finalScore > 60) {
						System.out.println("[INFO] Student has passed the class");
					}
					else {
						System.out.println("[INFO] Student Failed the class");
				}	
			}	
		}
		Scan.close();
	}
}

/*Output 1: Please input your homework grade: 90
	Please input your midterm grade: 45
	Please input your final exam grade: 120
	[INFO] Students Weighted Total is: 63.75
	[INFO] Student has passed the class

*Output 2: Please input your homework grade: 100
	Please input your midterm grade: 30012
	Invalid response, test scores should be between [0,100]
	(2 chances left)
	Please input your midterm grade: 10023
	Invalid response, test scores should be between [0,100]
	(1 chances left)
	Please input your midterm grade: -1
	Invalid response, test scores should be between [0,100]
	(0 chances left)
	Too many tries please try again!
	Please input your homework grade:  
*/