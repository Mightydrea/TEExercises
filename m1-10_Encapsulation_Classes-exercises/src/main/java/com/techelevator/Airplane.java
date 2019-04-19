package com.techelevator;

public class Airplane {
	
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int availableFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int availableCoachSeats;
	private int totalCoachSeats;
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
		
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
		availableCoachSeats = totalCoachSeats - bookedCoachSeats;
		availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
		bookedFirstClassSeats = 0;
		bookedCoachSeats = 0;

	}

	
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		
		if(forFirstClass && totalNumberOfSeats < getAvailableFirstClassSeats()){				
			
			 availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
					
			 return true;
					
			}
		
		return forFirstClass;
	}
	
	public String getPlaneNumber() {
		
		return planeNumber;
	}
	public int getBookedFirstClassSeats() {
		
		return bookedFirstClassSeats;
	}

	public int getAvailableFirstClassSeats() {
		
		return availableFirstClassSeats;
	}

	public int getTotalFirstClassSeats() {
		
		return totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		
		return bookedCoachSeats;
	}

	public int getAvailableCoachSeats() {
		
		return availableCoachSeats;
	}

	public int getTotalCoachSeats() {
		
		return totalCoachSeats;
	}
	
}
