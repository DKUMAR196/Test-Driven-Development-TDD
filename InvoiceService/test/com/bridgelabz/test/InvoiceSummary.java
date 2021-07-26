package com.bridgelabz.test;

import java.util.Objects;

public class InvoiceSummary {
	private final int numOfRides = 0;
	private final double totalFare;
	private final double averageFare;

	public InvoiceSummary(int numOfRide, double totalFare) {
		
		this.numOfRides = numOfRides;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare/this.numOfRides;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InvoiceSummary other = (InvoiceSummary) obj;
		return Double.doubleToLongBits(averageFare) == Double.doubleToLongBits(other.averageFare)
				&& numOfRides == other.numOfRides
				&& Double.doubleToLongBits(totalFare) == Double.doubleToLongBits(other.totalFare);
	}
}
