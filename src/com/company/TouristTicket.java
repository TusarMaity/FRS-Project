package com.company;

public class TouristTicket extends  Ticket{
    private String hotelAddress;
    private String selectedTouristLocation;

    public TouristTicket(String  pnr,String from ,String to,String departureDateTime, String arrivalDateTime,String seatNo,float prise,boolean canceled,String hotelAddress,String selectedTourisrLocation) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, prise, canceled);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation=selectedTourisrLocation;
    }
          String location;
    public String getHotelAddress() {

        return hotelAddress;
    }
    String getSelectedTouristLocation() {

        return selectedTouristLocation;
    }
    void removeTouristLocation(String location){
         if(this.selectedTouristLocation==location){
             return ;
         }
    }
    void addTouristLocation(String location){
          this.location=location;
    }
}