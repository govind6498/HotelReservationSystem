package com.bridgelabz.hotelreservationsystem;

public class Hotel {
	String hotelName;
	int rating;
	double weekdayRegularCustomerCost;
	double weekendRegularCustomerCost;
	public Hotel() {

	}
	public Hotel(String hotelName, int rating,double weekdayRegularCustomerCost, double weekendRegularCustomerCost) {
		this.hotelName = hotelName;
		this.rating = rating;
		this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
		this.weekendRegularCustomerCost = weekendRegularCustomerCost;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public double getweekdayRegularCustomerPrice() {
		return weekdayRegularCustomerCost;
	}
	public void setweekdayRegularCustomerPrice(double weekdayRegularCustomerCost) {
		this.weekdayRegularCustomerCost = weekdayRegularCustomerCost;
	}
	public double getweekendRegularCustomerPrice() {
		return weekendRegularCustomerCost;
	}
	public void setweekendRegularCustomerPrice(double weekendRegularCustomerCost) {
		this.weekendRegularCustomerCost = weekendRegularCustomerCost;
	}
	public String toString() {
		return "Hotels [hotelName="+hotelName+", rating="+rating+", weekdayRegularCustomerPrice="+", weekendRegularCustomerPrice=" + weekendRegularCustomerCost + "]";
	}

}
