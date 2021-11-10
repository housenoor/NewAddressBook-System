package com.bl.addressbook;

public class ContactDetails {

	private String firstName;
	private String lastName;
	private String addressCity;
	private String state;
	private String email;
	private String zip;
	private String phoneNumber;

	ContactDetails(String firstName, String lastName, String addressCity, String state, String email, String zip,
			String phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressCity = addressCity;
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

	public String getAddressCity() {
		return addressCity;
	}

	public void setAddressCity(String addressCity) {
		this.addressCity = addressCity;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {

		this.zip = zip;
	}

	public String getPhoneNumber() {

		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {

		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "ContactDetails{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\''
				+ ", addressCity='" + addressCity + '\'' + ", state='" + state + '\'' + ", email='" + email + '\''
				+ ", zip=" + zip + ", phoneNumber=" + phoneNumber + '}';
	}
}
