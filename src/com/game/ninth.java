package com.game;

public class ninth {

	public static void main(String[] args) {
		int health = 100;
		printHealth(health);
		health = takeDamage(health,30);
		printHealth(health);
		health = takeDamage(health,20);
		printHealth(health);

	}
	public static void printHealth(int hp) {
		 System.out.println("Current Hp" + hp);
	}
	public static int takeDamage(int hp,int dmg) {
		System.out.println("Took" + dmg + "damage!");
		hp-=dmg;
		return Math.max(hp,0);
	}
   public static int critDamage(int hp,int dmg) {
   }
	   public static int heal(int hp,int amount) {
		   System.out.println("Healed" + amount + "HP!");
		   hp+= amount;
		   return Math.min(hp,100);
	   }
   }
