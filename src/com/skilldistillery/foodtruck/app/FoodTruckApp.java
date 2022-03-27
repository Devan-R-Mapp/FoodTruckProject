package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;
import com.skilldistillery.foodtruck.entities.FoodTruckList;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		FoodTruck FoodTruck1 = new FoodTruck();
		FoodTruck FoodTruck2 = new FoodTruck();
		FoodTruck FoodTruck3 = new FoodTruck();
		FoodTruck FoodTruck4 = new FoodTruck();
		FoodTruck FoodTruck5 = new FoodTruck();
		FoodTruckList FTL = new FoodTruckList();
		String name = "";


		System.out.println("Welcome to the food truck comparision app please enter up to 5 trucks.");
		System.out.println(
				"If you have less than 5 trucks, enter \"quit\" for the trucks name to move to the comparison.");

		System.out.println("Please enter the name of the food truck: ");
		name = sc.nextLine();

		for (int i = 0; i < 5; i++) {

			String food = "";
			double rating = 0.0;

			System.out.println("Please enter the type of food this truck serves: ");
			food = sc.nextLine();
			System.out.println("What is this trucks rating: ");
			rating = sc.nextDouble();

			switch (i + 1) {
			case 1:
				FoodTruck1.setName(name);
				FoodTruck1.setFoodType(food);
				FoodTruck1.setRating(rating);
				FoodTruck1.setNextTruckId(i);
				FTL.addTruck(FoodTruck1);
				break;
			case 2:
				FoodTruck2.setName(name);
				FoodTruck2.setFoodType(food);
				FoodTruck2.setRating(rating);
				FoodTruck2.setNextTruckId(i);
				FTL.addTruck(FoodTruck2);
				break;
			case 3:
				FoodTruck3.setName(name);
				FoodTruck3.setFoodType(food);
				FoodTruck3.setRating(rating);
				FoodTruck3.setNextTruckId(i);
				FTL.addTruck(FoodTruck3);
				break;
			case 4:
				FoodTruck4.setName(name);
				FoodTruck4.setFoodType(food);
				FoodTruck4.setRating(rating);
				FoodTruck4.setNextTruckId(i);
				FTL.addTruck(FoodTruck4);
				break;
			case 5:
				FoodTruck5.setName(name);
				FoodTruck5.setFoodType(food);
				FoodTruck5.setRating(rating);
				FoodTruck5.setNextTruckId(i);
				FTL.addTruck(FoodTruck5);
				break;

			default:
				break;

			}
			if (i < 4) {
				name = "";
				System.out.println("Please enter the name of the food truck: ");
				sc.nextLine();
				name = sc.nextLine();
				if (name.equalsIgnoreCase("quit")) {
					i = 5;
					break;
				}
			}
		}
		

		boolean keepGoing = true;
		int userChoice = 0;
		while(keepGoing) {
			FTL.menu();
			userChoice = sc.nextInt();
			switch(userChoice) {
			case 1:
				FoodTruck2.toString();
				System.out.println(FTL.toString());
				break;
			case 4:
				keepGoing = false;
				sc.close();
				break;
			default:
				break;
			}
			
		}

	}





}