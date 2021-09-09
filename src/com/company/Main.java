package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Passenger p = new Passenger("BBS","Od","Odi","hf","56644","tusar96@gmail.com");
        System.out.println(p.getId());
        System.out.println(p.getAddressDetails());
        System.out.println(p.getContactDetails());

        Flight f1=new Flight("A12","Indian_Airway",100,1);
        System.out.println(f1.getFlightDetails());
        System.out.println(f1.checkAvailability());

        RegularTicket rt=new RegularTicket("A12","Kolkata","Mumbai","12.3","3.4","A5",500.00f,true,"Tea");
       // System.out.println(rt.getSpecialService());

        TouristTicket tt=new TouristTicket("B12","Kolkata","Mumbai","12.30","4.00","B1",500.00f,true,"Taj_Hotel","Mumbai");
       // System.out.println(tt.getSelectedTouristLocation());

        System.out.println(tt.getFlightDuration());
        System.out.println(rt.getFlightDuration());
    }
}
