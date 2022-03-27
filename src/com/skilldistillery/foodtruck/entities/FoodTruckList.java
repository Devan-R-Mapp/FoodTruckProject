package com.skilldistillery.foodtruck.entities;

import java.util.Arrays;

public class FoodTruckList {
	private FoodTruck[] Trucks;
	private int numTrucks = 0;

	private static int TotalTrucks = 6;

	public FoodTruckList() {
		Trucks = new FoodTruck[TotalTrucks];
	}

	public void addTruck(FoodTruck c) {
		Trucks[numTrucks] = c;
		numTrucks++;
	}

	public FoodTruck[] getTrucks() {
		FoodTruck[] FoodTruckCopy;
		FoodTruckCopy = new FoodTruck[numTrucks];
		for (int i = 0; i < numTrucks; i++) {
			FoodTruckCopy[i] = Trucks[i];
		}

		return FoodTruckCopy;
	}

	public void menu() {
	System.out.println("What would you like to do with these trucks?");
	System.out.println("1. List all existing trucks");
	System.out.println("2. See the average rating of food trucks");
	System.out.println("3. Display the highest-rated food truck.");
	System.out.println("4. Quit");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodTruckList [Trucks=");
		builder.append(Arrays.toString(Trucks) + "\n");
		builder.append(", numTrucks=");
		builder.append(numTrucks);
		builder.append("]");
		return builder.toString();
	}
}