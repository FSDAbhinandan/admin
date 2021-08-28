package com.admin.entity;

public class FlightList {
	
	private int airlineId;
	private String airlineName;
	private String fromLocation;
	private String toLocation;
	private String departureTime;
	private String arrivalTime;
	private int totalSeats;
	private int ticketCost;
	private boolean block = false;
	public FlightList() {
		super();
		// TODO Auto-generated constructor stub
	}
	public FlightList(int airlineId, String airlineName, String fromLocation, String toLocation, String departureTime,
			String arrivalTime, int totalSeats, int ticketCost, boolean block) {
		super();
		this.airlineId = airlineId;
		this.airlineName = airlineName;
		this.fromLocation = fromLocation;
		this.toLocation = toLocation;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.totalSeats = totalSeats;
		this.ticketCost = ticketCost;
		this.block=block;
	}
	public int getAirlineId() {
		return airlineId;
	}
	public void setAirlineId(int airlineId) {
		this.airlineId = airlineId;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getFromLocation() {
		return fromLocation;
	}
	public void setFromLocation(String fromLocation) {
		this.fromLocation = fromLocation;
	}
	public String getToLocation() {
		return toLocation;
	}
	public void setToLocation(String toLocation) {
		this.toLocation = toLocation;
	}
	public String getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(String departureTime){
		this.departureTime = departureTime;
	}
	public String getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public int getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(int ticketCost) {
		this.ticketCost = ticketCost;
	}
	public boolean isBlock() {
		return block;
	}
	public void setBlock(boolean block) {
		this.block = block;
	}
	
	

}
