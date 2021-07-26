package com.bridgelabz.test;

public class InvoiceGenerator {
	private static  int COST_PER_TIME = 1;
	private static  double MINIMUM_COST_PER_KILOMETER = 10;
	private static  double MINIMUM_FARE = 5;
	private static String choice = "premium";
	
	public void getRideType(String rideType) {
		if(rideType.equalsIgnoreCase(choice)) {
			 COST_PER_TIME = 2;
			 MINIMUM_COST_PER_KILOMETER = 15;
			 MINIMUM_FARE = 20;
		}		
	}
			
	public double calculateFare(double distance, int time) {
		double totalFare =  distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;
		if(totalFare < MINIMUM_FARE)
			return MINIMUM_FARE;
		return totalFare;
	}

	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0;
		for(Ride ride:rides) {
			totalFare += this.calculateFare(ride.distance, ride.time);
			System.out.println(totalFare);
		}
		return new InvoiceSummary(rides.length, totalFare);				
	}
}
