package com.company;
public class Passenger {
    int id;
    public static int idCounter;
    static{
        idCounter=0;
    }
    private static class Address{
        String street;
        String city;
        String state;
        public  Address(String street,String city,String state){
            this.street=street;
            this.city=city;
            this.state=state;
        }
    }
    private Address address;
    private static class Contact{
        String name;
        String phone;
        String email;
        public  Contact(String name,String phone,String email){
            this.name=name;
            this.phone=phone;
            this.email=email;
        }
    }
    private Contact contact;
    public Passenger(String addressStreet, String addressCity,
                     String addressState, String contactName, String contactPhone,
                     String contactEmail) {
        this.id = ++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }
    public int getId() {
        return this.id;
    }
    public String getAddressDetails() {

        return address.street + ", " + address.city + ", " + address.state;
    }

    public String getContactDetails() {

        return contact.name + ", " + contact.phone + ", " + contact.email;
    }
    private  void updateAddressDetails(String ustreet, String ucity, String ustate){
        address.street=ustreet;
        address.city=ucity;
        address.state=ustate;
    }
    public  void updateContactDetails( String uname, String uphone, String uemail ){
        contact.name=uname;
        contact.phone=uphone;
        contact.email=uemail;
    }
}
