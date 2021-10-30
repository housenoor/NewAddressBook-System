package com.bl.addressbook;

import java.util.Scanner;

class Contact {

    private String firstName, lastName, address, city, state, email;
    private int zip;
    private long phoneNumber;

    public Contact(String firstName, String lastName, String address, String city, String state, String email, int zip, long phoneNumber ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}

public class AddressBookMain {
    public static void main(String[] args) {
        Contact details = new Contact("Srikanth", "Housenoor", "Siddapur", "Hyderabad", "Telangana", "abc@gmail.com", 500085, 234567891);
        System.out.println("Welcome to Address Book Program");
        System.out.println("You have created details as: FirstName-" + details.getFirstName() + " , LastName-"
                + details.getLastName() + " , Address-" + details.getAddress() + " , City-" + details.getCity()
                + ", State-" + details.getState() + " , Email-" + details.getEmail() + " , Zip-" + details.getZip()
                + " , PhoneNumber-" + details.getPhoneNumber());
    }
}