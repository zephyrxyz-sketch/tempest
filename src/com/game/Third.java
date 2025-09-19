package com.game;

import java.util.Scanner;

public class Third {
	public static void main(String[] args ) {
		java.util.Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("Choose your class 1)Adventurer 2)Mage 3)psyker 4)Battle mage");
			while (!sc.hasNextInt()) {
				System.out.println("pick your choice 1-3");
				sc.next();
			}
			choice=sc.nextInt();
		}
		while(choice<1 || choice > 3);
		System.out.println("You picked class number :" + choice);
		sc.close();
		
			}
		}

