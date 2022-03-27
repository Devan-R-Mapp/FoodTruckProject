package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FoodTruck FTON = new FoodTruck();
		FoodTruck FTTW = new FoodTruck();
		FoodTruck FTTH = new FoodTruck();
		FoodTruck FTFO = new FoodTruck();
		FoodTruck FTFI = new FoodTruck();
		
		
		
		System.out.println("Welcome to the food truck comparision app please enter up to 5 trucks.");
		System.out.println("If you have less than 5 trucks, enter \"quit\" for the trucks name to move to the comparison.");
		
		for(int i = 0; i < 5; i++) {
			String name = "";
			String food = "";
			double rating = 0.0;
			
			System.out.println("Please enter the name of the food truck: ");
			name = sc.nextLine();
			System.out.println("Please enter the type of food this truck serves: ");
			food = sc.nextLine();
			System.out.println("What is this trucks rating: ");
			rating = sc.nextDouble();
		}
		

	}

}
