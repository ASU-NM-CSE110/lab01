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
	
	private String fileName;
	private ArrayList players2 = new ArrayList();
	private ArrayList<Player> players =  new ArrayList<Player>();	
	public int num_roster1 = 15, num_roster2 = 4;
	Scanner scan = new Scanner(System.in);
	
	
	public Roster(String filename)throws FileNotFoundException, IOException {
		BufferedReader reader = new BufferedReader(new FileReader("Roster1.dat"));
		BufferedReader reader1 = new BufferedReader(new FileReader("Roster2.dat"));
		if(filename.equals("Roster1.dat")) {
			for(int i = 0; i < num_roster1; i++) {
				String line = reader.readLine();
				if(line != null) {
					players2.add(line);
					String placeHolder = players2.get(i).toString();
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
			
		}else if(filename.equals("Roster2.dat")) {
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
	
	public Roster()throws FileNotFoundException, IOException {
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
	public void addPlayer(String name, Double attackStat, Double blockStat) {
		players.add(new Player(name, attackStat, blockStat));
	}
	public int countPlayers() {
		int playerSize = players.size();
		return playerSize;
	}
	public Player getPlayerByName(String player) {
		Player Name = new Player("null", 0.0, 0.0);
		for(int i = 0; i < players.size(); i++) {
			if(players.get(i).getName().equals(player)) {
				Name = players.get(i);
			}
		}
		return Name; 
	}
	//for loop that splits all the lines .split() and have it read every line
	public void printTopAttackers() {
		double topAttackerStat = 0.0;
		double secondTopAttackerStat = 0.0;
		Player topAttacker = new Player("null", 0.0, 0.0);
		Player secondTopAttacker = new Player("null", 0.0, 0.0);
		for(int i = 0; i < players.size(); i++) {
			double attStat = players.get(i).getAttackStat();
			if(attStat > topAttackerStat) {
				topAttackerStat = attStat;
				topAttacker = players.get(i);
			}
			
		}
		for(int i = 0; i < players.size(); i++) {
			double attStat = players.get(i).getAttackStat();
			if(attStat < topAttackerStat && attStat > secondTopAttackerStat) {
				secondTopAttackerStat = attStat;
				secondTopAttacker = players.get(i);
			}
		}
		topAttacker.printPlayerInfo();
		secondTopAttacker.printPlayerInfo();
	}
	public void printTopBlockers() {
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
		topBlocker.printPlayerInfo();
		secondTopBlocker.printPlayerInfo();
	}
	public void printAllPlayers() {
		for(int i = 0; i < players.size(); i++) {
			((Player)players.get(i)).printPlayerInfo();
		}
	}
}
