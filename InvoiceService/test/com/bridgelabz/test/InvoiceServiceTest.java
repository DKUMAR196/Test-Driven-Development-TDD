package com.bridgelabz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class InvoiceServiceTest {

	@Test
	public void givenDistanceAndTime_ShouldReturnTotalFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 2.0;
		int time = 5;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(25, fare, 0.0);		
	}
	
	@Test
	public void givenLessDistanceOrTime_ShouldReturnMinFare() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);		
	}
	
		
	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummary() {
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		Ride[] rides = {new Ride(2.0, 5),
				        new Ride(0.1, 1)
	    };
		InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 30.0);
		Assert.assertEquals(expectedInvoiceSummary, summary);
		}
	
	
	@Test
	public void givenMultipleRides_ReturnInvoice() {
		Ride rides[] = { new Ride(1.1, 1),
				         new Ride(2.1, 2),
				         new Ride(3.1, 3),
				         new Ride(4.1, 4)
		};
		String UserID ="Deepak";
	    InvoiceService invoice = new InvoiceService(UserID,rides);	   
	    Assert.assertNotNull(invoice);		
		}
	
	@Test
	public void givenMultipleRide_ArePremium() {
		double distance = 1;
		int time = 1;
		String RideType = "Premium";
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		invoiceGenerator.getRideType(RideType);
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(20, fare, 0.0);
	}
}
	


