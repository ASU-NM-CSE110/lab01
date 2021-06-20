// CSE 110     : <Class #> / <meeting days and times>
// Assignment  : <assignment #>
// Author      : <name> & <studentID>
// Description : <of the file contents>
import java.util.Scanner;
public class Assignment05 {

	
    public static void main(String[] args) {
        // Write any code here that you may wish to test your methods defined below.
    	Scanner scan = new Scanner(System.in);// the scanner is in the main class so that it does not need to be called every method
    	displayGreeting();
    	String bla = scan.nextLine();
    	displayText(bla);
    	displayText("Hello");
    	String sum, sUm, suM;
    	sum = scan.nextLine();
    	sUm = scan.nextLine();
    	suM = scan.nextLine();
    	System.out.println(midStringOfStars(sum, sUm, suM));
    	
    	
    	
    }
    
    // 1) Write (define) a static method named displayGreeting, 
    //  that takes no arguments and returns no value. 
    //  When this function is called, it should print the text "Hello, and welcome!".
    private static void displayGreeting() { //diplsayGreeting method
    	System.out.println("Hello, and welcome!");
    	return; 
    }
    
    
    //2) Write (define) a static method named displayText, 
    //  that takes a single String argument and returns no value. 
    //  When this function is called, it should print the value of the argument that was passed to it.
    private static void displayText(String input) {//added a string to it so people can pass inputs through it
    	System.out.println(input);
    }
    
    //3) Write (define) a static method named printTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should print the sum of the three arguments passed to it. 
    //  This function should return no value.
    private static void printTotal(int num1, int num2, int num3) { // added three integers to just sum
    	System.out.println(num1 + num2 + num3);
    }
    
    
    //4) Write (define) a static method named getTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the sum 
    //  of the three arguments passed to it as an int.
    private static int getTotal(int num1, int num2, int num3) { 
    	return num1 + num2 + num3; //since it is not actually printing anything it is just set to return.
    }
    
    //5) Write (define) a static method named getAverage, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the average 
    //  of the three arguments passed to it as a double.
    private static double getAverage(double num1, double num2, double num3) {
    	return (num1 + num2 + num3) / 3;// also just made to return and store a the output
    }
    //6) Write (define) a static method named averageLength, 
    //  that takes three String arguments. 
    //  When this function is called, it should return the average length (number of characters) 
    //  of the String arguments passed to it as a double.
    private static double averageLength(String write1, String write2, String write3) {
    	return (write1.length() + write2.length() + write3.length()) / 3.0; // using .length() to find the lengths of the strings
    }
    
    
    //7) Write (define) a static method named lengthOfShortest, 
    //  that takes two String arguments. When this function is called, 
    //  it should return the length (number of characters) 
    //  of the shortest String argument passed to it as an int.
    private static int lengthOfShortest(String write1, String write2){
    	if(write1.length() >= write2.length()) { //if statement that finds the shorter string
    		return write2.length();
    	}else{
    		return write1.length();
    	}
    }
    
    
    //8) Write (define) a static method named stringOfStars, 
    //  that takes one String argument.
    //  When this function is called, it should return a String of asterisks (*) 
    //  that is the same length as the string argument passed to it.
    private static String stringOfStars(String stars) {
    	String stringOfStars = "";
    	
    	for(int asterisks = 0; asterisks < stars.length(); asterisks++) {// this for loop prints stars instead of the length
    		stringOfStars += "*";
    		
    	}
    	return stringOfStars;
    }
    
    
    //9) Write (define) a static method named maxStringOfStars, 
    //  that takes two String arguments. 
    //  When this function is called, it should return a String of asterisks (*) 
    //  that is the same length as the longest string argument passed to it.
    private static String maxStringOfStars(String write1, String write2) {
    	String stringOfStars = "";
    	
    	if(write1.length() <= write2.length()) {        	// this if statement finds the longest string and replaces it with stars
        	for(int asterisks = 0; asterisks < write1.length(); asterisks++) {
        		stringOfStars += "*";
        	}
        	return stringOfStars;
    	}
    	else {
    		for(int asterisks = 0; asterisks < write2.length(); asterisks++) {
        		stringOfStars += "*";
        	}
    		return stringOfStars;
    	}
    }
    
    //10) Write (define) a static method named midStringOfStars, 
    //   that takes three String arguments. 
    //   When this function is called, it should return a String of asterisks (*) 
    //   that is the same length as the string argument with the length 
    //   that would be in the middle if the lengths of the arguments were arranged in ascending order.
    private static String midStringOfStars(String write1, String write2, String write3) {
    	String stringOfStars = "";
    	
    	// this if statement uses && and || so that all conditions could be met	
    	if(write1.length() <= write2.length() && write1.length() >= write3.length() || write1.length() >= write2.length() && write1.length() <= write3.length()) {        	
        	for(int asterisks = 0; asterisks < write1.length(); asterisks++) {
        		stringOfStars += "*";
        	}
        	return stringOfStars;
    	}
    	else if(write2.length() <= write1.length() && write2.length() >= write3.length() || write2.length() >= write1.length() && write2.length() <= write3.length()){
    		for(int asterisks = 0; asterisks < write2.length(); asterisks++) {
        		stringOfStars += "*";
        	}
    		return stringOfStars;
    	}else {
    		for(int asterisks = 0; asterisks < write3.length(); asterisks++) {
        		stringOfStars += "*";
        	}
    		return stringOfStars;
    	}
    }
}
