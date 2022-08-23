package com.supratik.entities;

import javax.persistence.*;

@Entity
@Table(name = "ADRC")
public class Address {
	@Id
	@Column(nullable = false, name = "ADRNR")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long addressNumber;
	@Column(name = "FIRST_NAME")
	public String firstName;
	@Column(name = "LAST_NAME")
	public String lastName;
	@Column(name = "COUNTRY")
	public String country;
	@Column(name = "STATE")
	public String state;
	@Column(name = "CITY")
	public String city;

	public Address() {

	}

	public Address(Long addressNumber, String firstName, String lastName, String country, String state, String city) {
		super();
		this.addressNumber = addressNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.state = state;
		this.city = city;
	}

	public Long getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(Long addressNumber) {
		this.addressNumber = addressNumber;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

}
