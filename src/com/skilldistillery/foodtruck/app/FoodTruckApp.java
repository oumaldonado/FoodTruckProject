package com.skilldistillery.foodtruck.app;

import com.skilldistillery.foodtruck.entities.FoodTruck;
import java.util.Scanner;

public class FoodTruckApp {
	private FoodTruck[] fleet = new FoodTruck[5];
	private Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		fta.run();

	}

	public void run() {
		userInput();
		menu2();

		kb.close();
		
	}

	public void userInput() {
		for (int i = 0; i < fleet.length; i++) {
			System.out.print("Enter the name of the food truck" + (i + 1) + " : ");
			String truckName = kb.nextLine();

			if (truckName.equals("quit")) { 
				System.out.println("  ");
				System.out.println("Have a good day.");
				System.out.println("  ");
				break;
			}
			System.out.print("What type of food did you eat? :  ");
			String foodType = kb.nextLine();
			System.out.print("Rate your overall experience from 1 - 5:  ");
			int rating = kb.nextInt();
			FoodTruck newTruck = new FoodTruck(truckName, foodType, rating);
			kb.nextLine();

			fleet[i] = newTruck;

		}

	}

	public void menu2() {
		boolean status = true;
		while (status) {
			System.out.println("choose from the following ");
			System.out.println("1) List all Food Trucks  ");
			System.out.println("2) Average rating of trucks ");
			System.out.println("3) Highest rated trucks ");
			System.out.println("4) Quit");
			int userChoice = kb.nextInt();
			kb.nextLine();
			switch (userChoice) {
			case 1:
				for (FoodTruck foodTruck : fleet) {
					if (foodTruck != null) {
						System.out.println(foodTruck);

					}

				}
				break;

			case 2:
				double ave = 0;
				int counter = 0;

				for (FoodTruck foodTruck : fleet) {
					if (foodTruck != null) {
						ave += foodTruck.getRating();
						counter++;

					}

				}
				ave = ave / counter;
				System.out.println(ave);

			case 3:
				FoodTruck bestRated = null;
				double currentHigh = 0.0;
				for (FoodTruck foodTruck : fleet) {
					if (foodTruck != null) {
						if (foodTruck.getRating() > currentHigh) {
							currentHigh = foodTruck.getRating();
							bestRated = foodTruck;

						}

					}

				}
				System.out.println(bestRated);
				break;
			case 4:
				System.out.println("Enjoy your day");
				status = false;
				break;

			default:
				System.out.println("Invaid selection");
				break;

			}
		}
	}
}
