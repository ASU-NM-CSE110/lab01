/*-------------------------------------------------------------
// AUTHOR: Noah Mitrevski
// FILENAME: Lab6.java
// SPECIFICATION: This program will have the user input grades and group numbers for the amount of students there are
// FOR: CSE 110- Lab #6
// TIME SPENT: 30 minutes
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int numStudents = -1;
       int[] studentGroups = null;//arrays are objects
       double[] studentGrades = null;
       int numGroups = -1;  // Part 2
       
       //ask for number of students
       System.out.println("How many students do you have?");
       numStudents = scan.nextInt();
       
       //setting the lengths of the arrays
       studentGroups = new int[numStudents];
       studentGrades = new double[numStudents];
      
       
       //initalize the array based on user input
       
       for(int i = 0; i < numStudents; i++) {
    	   System.out.println("[Group #] and [Grade] for Entry " + (i + 1));// for loop to get the user input of grades and groups
    	   studentGroups[i] = scan.nextInt(); 
    	   studentGrades[i] = scan.nextDouble();
       }
       
       
       System.out.println("==== List of Student Records ==== ");
       for(int j = 0; j < numStudents; j++) {// this for loop makes the list of student records
    	   System.out.println("Group " + studentGroups[j] + " - " + studentGrades[j] + " Points");
       }
       
       scan.close();
    }
}
/*Output: How many students do you have?
			3
			[Group #] and [Grade] for Entry 1
			1
			10
			[Group #] and [Grade] for Entry 2
			2
			5
			[Group #] and [Grade] for Entry 3
			3
			10
			==== List of Student Records ==== 
			Group 1 - 10.0 Points
			Group 2 - 5.0 Points
			Group 3 - 10.0 Points
 */
