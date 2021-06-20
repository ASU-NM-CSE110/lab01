/* CSE 110 : 40448 / M-Th 6:00 - 7:15 
 * Assignment : Assignment 2
 * Author : Noah Mitrevski
 * Description : This program takes a set number of data and will calculate what will be needed and how much money the build will cost
 */

import java.util.Scanner;
public class Assignment02 {
	public static void main(String[] args) {
		
		//declaring variables
		Scanner scan = new Scanner(System.in);
			double roadLength, fullRoadLength, cAsphalt, cStop, cCond, cLabor, cTotal; 
			int laneNum, asphaltD, truckAsphalt, projectComplete, numInter, numStop, condPipe, crewMember; 
		 
		// getting the input variables from the user 
		System.out.print("Length of road project (miles) : ");
			roadLength = scan.nextDouble();
		
		System.out.print("Number of lanes                : ");
			laneNum = scan.nextInt();
		
		System.out.print("Depth of asphalt (inches)      : ");
			asphaltD = scan.nextInt();
		
		System.out.print("Days to complete project       : ");
			projectComplete = scan.nextInt();
		
		System.out.println("=== Amount of materials needed ===");
		 
			// all the calculations that were to be done 
			fullRoadLength = (roadLength * 5280) * ((double)asphaltD/12) * (12 * laneNum); // roadLength * 5280 is a conversion to feet as well as asphaltD/12
			truckAsphalt = (int)Math.ceil((fullRoadLength*150)/10000); // used (int) to convert into an integer and math.ceil to round up
			numInter = (int)roadLength * 1;
			numStop = (laneNum + 2) * numInter;
			condPipe = (int)Math.ceil((roadLength * 5280)/24); 
			crewMember =(int)Math.ceil((50 * roadLength * laneNum)/ projectComplete);
			cAsphalt = ((double)truckAsphalt * 5) * 200; // had to convert to a double to overcome some complications with it being an int
			cStop = 25000 * numStop;
			cCond = 500 * condPipe; 
			cLabor = projectComplete * (8 * 25) * crewMember;
			cTotal = cAsphalt + cStop + cCond + cLabor; 
		
		//laying out the script and inputing all of the variables
		System.out.println("Truckloads of Asphalt : " + truckAsphalt);
		System.out.println("Stoplights            : " + numStop);
		System.out.println("Conduit pipes         : " + condPipe);
		System.out.println("Crew members needed   : " + crewMember);
		System.out.println("=== Cost of Materials ============");
		System.out.println("Cost of Asphalt       : $" + cAsphalt);
		System.out.println("Cost of Stoplights    : $" + cStop);
		System.out.println("Cost of Conduit pipes : $" + cCond);
		System.out.println("Cost of Labor         : $" + cLabor);
		System.out.println("=== Total Cost of Project =======");
		System.out.println("Total cost of project : $" + cTotal);
		
		scan.close();
	}
}
/* Output: Truckloads of Asphalt : 8554
	Stoplights            : 12
	Conduit pipes         : 660
	Crew members needed   : 6
	=== Cost of Materials ============
	Cost of Asphalt       : $8554000.0
	Cost of Stoplights    : $300000.0
	Cost of Conduit pipes : $330000.0
	Cost of Labor         : $60000.0
	=== Total Cost of Project =======
	Total cost of project : $9244000.0
 * 
 */


