package com.skilldistillery.foodtruck.entities;


public class FoodTruck {
	private String name;
	private String foodType;
	private double rating; 
	private static int nextTruckId;
	public String getName() {
		return name;
	}
	public FoodTruck(String name, String foodType, double rating) {
		
		
	}
	public FoodTruck() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public static int getNextTruckId() {
		return nextTruckId;
	}
	public static void setNextTruckId(int nextTruckId) {
		FoodTruck.nextTruckId = nextTruckId;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodTruck: ");
		builder.append(name);
		builder.append(", foodType: ");
		builder.append(foodType);
		builder.append(", rating: ");
		builder.append(rating);
		return builder.toString();
	}
	
}
