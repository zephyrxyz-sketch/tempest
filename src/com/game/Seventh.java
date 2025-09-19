package com.game;
import java.util.Scanner;
import java.util.ArrayList;

public class Seventh {
	public static void main(String[] args) {
		Scanner sc = new scanner(System.in);
		
		Inventory.add("Sword");
		Inventory.add("potion");
		Inventory.add("sheild");
		
		boolean running =true;
		
		while(running) {
			System.out.println("\n-- Adventure   Menu --");
			System.out.println("1:Explore");
			System.out.println("2:Rest");
			System.out.println("3:Quit");
			System.out.println("choose your action");
			
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Enter items to add:");
				String newItem = sc.newItem();
				inventory.add(newItem);
                System.out.println(newItem + "added");
				break;
			case 2:
				System.out.println("Enterv item to remove:");
				string removeItem = sc.nextLine();
				if (inventory.remove(removeItem)) {
					System.out.println(removeItem + "removed");
				}
				else {
				System.out.println("Item not found..");
			}
			break;
		


	
