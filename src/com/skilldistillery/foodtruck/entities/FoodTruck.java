package com.skilldistillery.foodtruck.entities;

import java.util.Objects;

public class FoodTruck {

	private static int truckId = 1;
	private int id;
	private String foodTruckName;
	private String foodType;
	private int rating;
	
	public FoodTruck() {
		
	}
	

	public FoodTruck(String foodTruckName, String foodType, int rating) {
		this.id = truckId++;
		this.foodTruckName = foodTruckName;
		this.foodType = foodType;
		this.rating = rating;
		

	}


	public static int getTruckId() {
		return truckId;
	}


	public static void setTruckId(int truckId) {
		FoodTruck.truckId = truckId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFoodTruckName() {
		return foodTruckName;
	}


	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}


	public String getFoodType() {
		return foodType;
	}


	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	@Override
	public int hashCode() {
		return Objects.hash(foodTruckName, foodType, id, rating);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodTruck other = (FoodTruck) obj;
		return Objects.equals(foodTruckName, other.foodTruckName) && Objects.equals(foodType, other.foodType)
				&& id == other.id && rating == other.rating;
	}


	@Override
	public String toString() {
		return "FoodTruck ID: " + id + ",   TruckName: " + foodTruckName + ",  Food Type: " + foodType + ",  Rating: "
				+ rating;
	}
	
	
	

}
