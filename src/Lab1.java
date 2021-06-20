/* Author : Noah Mitrevski
*  File Name : Lab1.java
*  Specifications : This program is going to take three tests scors and average them
*  For : CSE110 lab #1
*  Time Spent : 40 minutes 
*/
import java.util.Scanner;

public class Lab1 
{
	public static void main(String[] args) 
	{
		// declare the variables
		double test1 = 0; // declare the variable with an initial value
		double test2; // just declare the variable i.e. some random number might be in
		double test3;
		
		final double NUM_TESTS = 3; // we can use int as well
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please input your test 1 score: ");
		test1 = keyboard.nextDouble(); // If the input is an integer, you need to use
		// keyboard.nextInt()
		System.out.println("Your test 1 is: " + test1);
		
		System.out.print("Please input test 2 score:");
		test2 = keyboard.nextDouble();
		System.out.println("Your test 2 is: " + test2);
		
		System.out.print("Please input test 3 score:");
		test3 = keyboard.nextDouble();
		System.out.println("Your test 3 is: " + test3);
		
		double avg; // Creating a new variable of average
		avg = (test1 + test2 + test3) / NUM_TESTS; // The math to calculate the average
		System.out.println("Your average is: " + avg);
		
		keyboard.close();// closes the object
	}
}
/*  Please input your test 1 score: 91
	Your test 1 is: 91.0
	Please input test 2 score:93
	Your test 2 is: 93.0
	Please input test 3 score:94
	Your test 3 is: 94.0
	Your average is: 92.66666666666667
 */
