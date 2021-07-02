/*CSE 110 : 40448 / M-Th 6:00 - 7:15 
 * Assignment : Assignment 8
 * Author : Noah Mitrevski
 * Description : This program will tell whether or not you should buy, sell, or hold the shares you currently have
 */
public class Player {
	private String name;
	private double attackStat, blockStat;
		
	
	public Player(String Name, Double AttackStat, Double BlockStat) {
		this.name = Name;
		this.attackStat = AttackStat; 
		this.blockStat = BlockStat;
		
	}
	public String getName() {
		return name;
	}
	public Double getAttackStat(){
		return attackStat;
	}
	public Double getBlockStat() {
		return blockStat;
	}
	public void setAttackStat(Double AttackStat) {
		this.attackStat = AttackStat;
	}
	public void setBlockStat(Double BlockStat) {
		this.blockStat = BlockStat;
	}
	public void printPlayerInfo() {
		System.out.printf("%s (attack = %,.2f block = %,.2f) \n", name, attackStat, blockStat );
	}
}
