/*CSE 110 : 40448 / M-Th 6:00 - 7:15 
 * Assignment : Assignment 7
 * Author : Noah Mitrevski 1219008323
 * Description : This program is a class that is used to create monsters that fight
 */
import java.util.Random;//importing random

public class Monster {
	
	//declaring variables
	private String name;
	private int healthScore;
	private Weapon weapon; 
	private Random rand = new Random();
	
	//creating the constructor
	public Monster(String mName, int mHealthScore, Weapon mWeapon) {
		this.name = mName;
		this.healthScore = mHealthScore;
		this.weapon = mWeapon;
	}
		//Writing the getters and setters
		public String getName(){
			return this.name;
		}
		public int getHealthScore() {
			return this.healthScore;
		}
		public String getWeaponName() {
			return this.weapon.getName(); 
		}
		//Writing the attack function
		public int attack(Monster monster) {
			 int damage = rand.nextInt(weapon.getMaxDamage()); // store it as damage
			 monster.healthScore -= damage; // minus' damage from the monsters health
			 return damage; //returns the damage
		}
	}

