package com.game;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		Scanner uinput= new Scanner(System.in);
		boolean running = true;
		
		while (running) {
			System.out.println("\n-- Adventure   Menu --");
			System.out.println("1:Explore");
			System.out.println("2:Rest");
			System.out.println("3:Quit");
			System.out.println("choose your action");
			
			int choice = uinput.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("you venture into the unkown..");
				break;
			case 2:
				System.out.println("rest and regain your powers");
			    break;
			case 3:
				System.out.println("Exxiting the adventure.Till next time wanderer!..");
				break;
			default:
				System.out.println("invalid option stupid");
			}
		}
		uinput.close();
	}
				
}
