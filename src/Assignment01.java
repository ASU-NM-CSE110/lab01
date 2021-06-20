/* CSE 110 : 40448 / M-Th 6:00 - 7:15 
 * Assignment : Assignment 1
 * Author : Noah Mitrevski
 * Description : This program is able to take 4 inputs and figure out how many pieces that everyone is going to get
 */
import java.util.Scanner; // importing user input 
public class Assignment01 {
	public static void main(String[] args) {
		
		//declaring variables
		Scanner Scan = new Scanner(System.in);
		 int pPurchased, pSlices, adults, children, pChildren, leftOver, pTotal, sAdults, sChildren;
		
		 // these next lines are for getting user input 
		System.out.print("Insert the amount of pizzas that are being purchased: ");
		pPurchased = Scan.nextInt();
		
		System.out.print("Insert the amount of slices per pizza               : ");
		pSlices = Scan.nextInt();
		
		System.out.print("Insert the amount of adults that are in your party  : ");
		adults = Scan.nextInt();
		
		System.out.print("Insert the amount of children that are in your party: ");
		children = Scan.nextInt();
		
		// taking user input and using math to figure out the outputs
		pChildren = pPurchased*pSlices - 2*adults;
		leftOver = pChildren%children; // using modulus
		pTotal = pPurchased*pSlices;
		sAdults = 2*adults;
		sChildren = pChildren/children; 
		
		// taking the new variables and putting them in strings or line of text
		System.out.println("Total number of slices of pizza              : " + pTotal);
		System.out.println("Total number of slices given to adults       : " + sAdults);
		System.out.println("Total number of slices available to children : " + pChildren);
		System.out.println("Number of slices each child will get         : " + sChildren);
		System.out.println("Number of slices left over                   : " + leftOver);
		
		Scan.close(); //stopping the scanner
	}
}
/* Output: Insert the amount of pizzas that are being purchased: 2
	Insert the amount of slices per pizza               : 8
	Insert the amount of adults that are in your party  : 2
	Insert the amount of children that are in your party: 3
	Total number of slices of pizza              : 16
	Total number of slices given to adults       : 4
	Total number of slices available to children : 12
	Number of slices each child will get         : 4
	Number of slices left over                   : 0 
 */
