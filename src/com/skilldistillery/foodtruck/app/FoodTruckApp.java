package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;
import com.skilldistillery.foodtruck.entities.FoodTruckList;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FoodTruckList FTL = new FoodTruckList();

		System.out.println("Welcome to the food truck comparision app please enter up to 5 trucks.");
		System.out.println(
				"If you have less than 5 trucks, enter \"quit\" for the trucks name to move to the comparison.");

		for (int i = 0; i < 5; i++) {
			String name = "";
			String food = "";
			double rating = 0.0;

			while (name.isEmpty()) {

				System.out.println("Please enter the name of the food truck: ");
				name = sc.nextLine();
			}
			if (name.equalsIgnoreCase("quit")) {
				break;
			}
			while (food.isEmpty()) {
				System.out.println("Please enter the type of food this truck serves: ");
				food = sc.nextLine();
			}

			while (rating <= 0.0) {
				System.out.println("What is this trucks rating: ");
				rating = sc.nextDouble();
				sc.nextLine();
			}
			FoodTruck thisFoodTruck = new FoodTruck();
			thisFoodTruck.setName(name);
			thisFoodTruck.setFoodType(food);
			thisFoodTruck.setRating(rating);
			thisFoodTruck.getNextTruckId();
			FTL.addTruck(thisFoodTruck, i);
			name = "quit";
		}//for (int i = 0; i < 5; i++)

		boolean keepGoing = true;
		int userChoice = 0;
		while (keepGoing) {
			FTL.menu();
			userChoice = sc.nextInt();
			switch (userChoice) {
			case 1:
				System.out.println();
				FTL.lisofExistingTrucks();
				System.out.println();
				break;
			case 2:
				System.out.println();
				System.out.println(FTL.getTrucksAverageRating());
				System.out.println();
				break;
			case 3:
				System.out.println();
				System.out.println(FTL.getTrucksHighestRating());
				System.out.println();
				break;
			case 4:
				System.out.println();
				System.out.println("Goodbye");
				keepGoing = false;
				sc.close();
				break;
			default:
				break;
			}

		}
	}
}
