package com.bridgelabz.test;

public class InvoiceService {

	private String userID;
	private Ride[] rides;
	private String invoice;

	public InvoiceService(String userID, Ride[] rides) {
		this.userID = userID;
		this.rides = rides;
		InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
		InvoiceSummary totalFare = invoiceGenerator.calculateFare(rides);
		this.invoice = userID + rides;
	}
}
