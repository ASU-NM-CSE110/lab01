/*CSE 110 : 40448 / M-Th 6:00 - 7:15 
 * Assignment : Assignment 7
 * Author : Noah Mitrevski 1219008323
 * Description : This program is a class that creates the weapons the monsters will use
 */
public class Weapon {
	private String name = "Pointy Stick";//this initializes the String
	private int maxDamage = 1;//initializes int
	
	
	//making the constructor
	public Weapon(String wName, int wMaxDamage) {
		this.name = wName;
		this.maxDamage = wMaxDamage;
	}
	
	//adding the getters and setters
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	
	public int getMaxDamage() {
		return this.maxDamage;
	}
	public void setMaxDamage(int maxDamage) {
		this.maxDamage = maxDamage;
	}
}

