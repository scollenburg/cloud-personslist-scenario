package com.sap.hana.cloud.sample;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@NamedQuery(name = "AllPersons", query = "select p from Person p")
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	public Person() {
	}

	@Id
	@GeneratedValue
	private long id;
	private String firstName;
	private String lastName;
	private String country;
	private String countryCode;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String param) {
		this.firstName = param;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String param) {
		this.lastName = param;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}