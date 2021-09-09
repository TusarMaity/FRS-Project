package com.company;

public class Ticket {
    private String pnr;
    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private float prise;
    private boolean canceled;
    public Ticket(String  pnr,String from ,String to,String departureDateTime, String arrivalDateTime,String seatNo,float prise,boolean canceled){
        this.pnr=pnr;
        this.from=from;
        this.to=to;
        this.departureDateTime=departureDateTime;
        this.arrivalDateTime=arrivalDateTime;
        this.seatNo=seatNo;
        this.prise=prise;
        this.canceled=canceled;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {

        this.to = to;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {

        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {

        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {

        this.seatNo = seatNo;
    }

    public float getPrise() {

        return prise;
    }

    public void setPrise(float prise) {

        this.prise = prise;
    }

    public boolean isCanceled() {

        return canceled;
    }

    public void setCanceled(boolean canceled) {

        this.canceled = canceled;
    }
    public  String checkStatus(){

        return this.from;
    }
    public  int getFlightDuration(){
        String [] splitArr=arrivalDateTime.split(".");
        String s1=splitArr[0];
        String s2=splitArr[1];
        String s3=s1.concat(s2);
        int intArr = Integer.parseInt((s3));
        String [] splitArr1=arrivalDateTime.split(".");
        String s4=splitArr[0];
        String s5=splitArr[1];
        String s6=s4.concat(s5);
        int intDep = Integer.parseInt((s6));
        return intDep-intArr;
    }
    public void cancel(){
        if(this.canceled==true)
            System.out.println("cancel");
    }
}
