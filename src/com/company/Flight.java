package com.company;

public class Flight {
    private String flightNo;
    private  String airline;
    private int capacity;
    public int bookedSeats;
    public Flight flight;

    public Flight(String flightNo,String airline,int capacity,int bookedSeats){
        this.flightNo=flightNo;
        this.airline=airline;
        this.capacity=capacity;
        this.bookedSeats=bookedSeats;
    }
    public Flight(Flight flight){
        this.flightNo=flight.flightNo;
        this.airline=flight.airline;
        this.capacity=flight.capacity;
        this.bookedSeats=flight.bookedSeats;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public void setFlightNo(String flightNo) {
        this.flightNo = flightNo;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public Flight getFlightDetails(){
        return this.flight;
    }
    public boolean checkAvailability(){
        return this.capacity<100;
    }
    public void IncrementBookingCounter(){
        ++ bookedSeats;
    }
}
