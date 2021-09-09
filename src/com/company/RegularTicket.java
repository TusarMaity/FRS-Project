package com.company;

public class RegularTicket extends  Ticket{
    private String specialService;

    public RegularTicket(String  pnr,String from ,String to,String departureDateTime, String arrivalDateTime,String seatNo,float prise,boolean canceled,String specialService) {
        super(pnr, from, to, departureDateTime, arrivalDateTime, seatNo, prise, canceled);
        this.specialService = specialService;
    }
     public  String getSpecialService(){
        return getSpecialService();
     }
    private void updateSpecialService(String specialService) {
             this.specialService=specialService;
    }

}
