package com.skilldistillery.foodtruck.entities;


public class FoodTruckList {
	private FoodTruck[] Trucks;


	private int numTrucks = 0;
	private static int TotalTrucks = 6;

	public FoodTruckList() {
		Trucks = new FoodTruck[TotalTrucks];
	}
	public FoodTruck[] getTrucks() {
		return Trucks;
	}

	public void setTrucks(FoodTruck[] trucks) {
		Trucks = trucks;
	}
	

	public void addTruck(FoodTruck c, int i) {
		Trucks[i] = c;
		numTrucks++;
	}
	public FoodTruck getTruckByI( int i) {
		return Trucks[i];
	}
	public void lisofExistingTrucks() {
		
		System.out.println("The trucks on file are: ");
		for (int i = 0; i < numTrucks; i++) {
			FoodTruck AFT = (FoodTruck) Trucks[i];
			System.out.println(AFT);
			
		}
	}
	
	
	public String getTrucksAverageRating() {

		double totalRating = 0.0;
		for (int i = 0; i < numTrucks; i++) {
			FoodTruck AFT = (FoodTruck) Trucks[i];
		
//			System.out.println(AFT.getRating());
			totalRating = totalRating + AFT.getRating();
			
		}
		return "The Average rating of the trucks is: " + totalRating/numTrucks;
		
	}
	public String getTrucksHighestRating() {
		
		double highestRating = 0.0;
		int truckNumber = -1;
		for (int i = 0; i < numTrucks; i++) {
			FoodTruck AFT = (FoodTruck) Trucks[i];
			
//			System.out.println(AFT.getRating());
			if(AFT.getRating() > highestRating) {
				highestRating = AFT.getRating();
				truckNumber = i;
			}
			
		}
		return "The highest rated truck is: " + Trucks[truckNumber];
		
	}
	
	

	public void menu() {
	System.out.println("What would you like to do with these trucks?");
	System.out.println("1. List all existing trucks");
	System.out.println("2. See the average rating of food trucks");
	System.out.println("3. Display the highest-rated food truck.");
	System.out.println("4. Quit");
	}



	public int length() {
		
		return numTrucks;
	}
}