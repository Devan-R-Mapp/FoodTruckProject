package com.skilldistillery.foodtruck.entities;


public class FoodTruck {
	private String name;
	private String foodType;
	private double rating; 
	private static int nextTruckId = 0;
	private int id = 100;
	
	
	public String getName() {
		return name;
	}
	public FoodTruck(String name, String foodType, double rating) {
		
		
	}
	public FoodTruck(String name, String foodType, double rating,int nextTruckId) {
		
		
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
	
	  public int getNextTruckId() {
		  id += nextTruckId++;
		return id;
	}
	public void setNextTruckId(int nextTruckId) {
		FoodTruck.nextTruckId = nextTruckId;
	}
	
	public void displayThisTruck() {
		    String truckData = this.toString();
		    System.out.println(truckData);
		  }
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Food Truck: ");
		builder.append(name);
		builder.append(" --- Food Type: ");
		builder.append(foodType);
		builder.append(" --- Rating: ");
		builder.append(rating);
		builder.append(" --- TruckID ");
		builder.append(id);
		return builder.toString();
	}
	
}
