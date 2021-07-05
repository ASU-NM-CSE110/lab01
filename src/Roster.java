/*CSE 110 : 40448 / M-Th 6:00 - 7:15 
 * Assignment : Assignment 8
 * Author : Noah Mitrevski
 * Description : This program contains methods that help the main class
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Roster {
	
	//Declaring variables
	private String fileName;
	private ArrayList players2 = new ArrayList(); // creates an array list 
	private ArrayList<Player> players =  new ArrayList<Player>();	//creates an array list with the <Player> object
	public int num_roster1 = 15, num_roster2 = 4;
	Scanner scan = new Scanner(System.in);
	
	
	public Roster(String filename)throws FileNotFoundException, IOException { // Excenptions being theown so the file readers can work
		BufferedReader reader = new BufferedReader(new FileReader("Roster1.dat")); //reading the first roster
		BufferedReader reader1 = new BufferedReader(new FileReader("Roster2.dat"));//reading the second roster
		if(filename.equals("Roster1.dat")) {
			for(int i = 0; i < num_roster1; i++) {//for loop to scan through everything
				String line = reader.readLine();//reading the next line 
				if(line != null) {
					players2.add(line); //adding the line to the array list 
					String placeHolder = players2.get(i).toString();//making a placeholder variable for the line of code and converting it to a String
					//everything below is for seperating each line and turning it into objects;
					String[] newPlayers = placeHolder.split(" "); 
					String combine = newPlayers[0] + " " +  newPlayers[1];
					String att = newPlayers[2].toString();
					Double attStat = Double.parseDouble(att);
					String block = newPlayers[3].toString();
					Double blockStat = Double.parseDouble(block);
					String name = combine; 
					Double attackStat = attStat;
					Double blockerStat = blockStat;
					players.add(new Player(name, attackStat, blockerStat));
					
				}
			}
			
			System.out.println("Loaded Roster 1");
			
		}else if(filename.equals("Roster2.dat")) { // the same thing but for the next file
			for(int i = 0; i < num_roster2; i++) {
				String line = reader1.readLine();
				if(line != null) {
					players2.add(line);
					String placeHolder = players2.get(i).toString();
					String[] newPlayers = placeHolder.split(" "); 
					String combine = newPlayers[0] + " " + newPlayers[1];
					String att = newPlayers[2].toString();
					Double attStat = Double.parseDouble(att);
					String block = newPlayers[3].toString();
					Double blockStat = Double.parseDouble(block);
					String name = combine; 
					Double attackStat = attStat;
					Double blockerStat = blockStat;
					players.add(new Player(name, attackStat, blockerStat));
				}
			}
			System.out.println("Loaded Roster 2");
		}else {
			System.out.println("No file of that name");
		}
	
	}
	
	public Roster()throws FileNotFoundException, IOException { //This is the default constructor that is just making the players array
		BufferedReader reader = new BufferedReader(new FileReader("Roster1.dat"));
		BufferedReader reader1 = new BufferedReader(new FileReader("Roster2.dat"));
		if(reader.equals("Roster1.dat")) {
			for(int i = 0; i < num_roster1; i++) {
				String line = reader.readLine();
				if(line != null) {
					players2.add(line);
				}
			}
			System.out.println("Loaded Roster 1");
		}else if(reader1.equals("Roster2.dat")) {
			for(int i = 0; i < num_roster2; i++) {
				String line = reader1.readLine();
				if(line != null) {
					players2.add(line);
				}
			}
			System.out.println("Loaded Roster 2");
		}else {
			System.out.println("No file of that name");
		}
	}
	public void addPlayer(String name, Double attackStat, Double blockStat) {//the add player method
		players.add(new Player(name, attackStat, blockStat));
	}
	public int countPlayers() {// the count players method 
		int playerSize = players.size();
		return playerSize;
	}
	public Player getPlayerByName(String player) {
		Player Name = new Player("null", 0.0, 0.0);//initializing a player
		for(int i = 0; i < players.size(); i++) { // scanning through the whole array to find what they are looking for
			if(players.get(i).getName().equals(player)) {
				Name = players.get(i);
			}
		}
		return Name; //returning the player found
	}
	//for loop that splits all the lines .split() and have it read every line
	public void printTopAttackers() {
		//declaring and initializing variables
		double topAttackerStat = 0.0;
		double secondTopAttackerStat = 0.0;
		Player topAttacker = new Player("null", 0.0, 0.0);
		Player secondTopAttacker = new Player("null", 0.0, 0.0);
		for(int i = 0; i < players.size(); i++) {
			double attStat = players.get(i).getAttackStat(); // getting only their attack stat
			if(attStat > topAttackerStat) { // making the conditions
				topAttackerStat = attStat;
				topAttacker = players.get(i);
			}
			
		}
		for(int i = 0; i < players.size(); i++) {
			double attStat = players.get(i).getAttackStat();
			if(attStat < topAttackerStat && attStat > secondTopAttackerStat) {//making the conditions
				secondTopAttackerStat = attStat;
				secondTopAttacker = players.get(i);
			}
		}
		//printing out both players with their info
		topAttacker.printPlayerInfo();
		secondTopAttacker.printPlayerInfo();
	}
	public void printTopBlockers() {//same thing as the attackers but with the block stat instead 
		//declaring and initializing variables 
		double topBlockerStat = 0.0;
		double secondTopBlockerStat = 0.0;
		Player topBlocker = new Player("null", 0.0, 0.0);
		Player secondTopBlocker = new Player("null", 0.0, 0.0);
		for(int i = 0; i < players.size(); i++) {
			double blockStat = players.get(i).getBlockStat();
			if(blockStat > topBlockerStat) {
				topBlockerStat = blockStat;
				topBlocker = players.get(i);
				
			}
			
		}for(int i = 0; i < players.size(); i++) {
			double blockStat = players.get(i).getBlockStat();
			if(blockStat < topBlockerStat && blockStat > secondTopBlockerStat) {
				secondTopBlockerStat = blockStat;
				secondTopBlocker = players.get(i);
				
			}
			
		}
		//prinint the players that have the highest stats
		topBlocker.printPlayerInfo(); 
		secondTopBlocker.printPlayerInfo();
	}
	public void printAllPlayers() { // this will just print all players by going through a for loop
		for(int i = 0; i < players.size(); i++) {
			((Player)players.get(i)).printPlayerInfo();
		}
	}
}
