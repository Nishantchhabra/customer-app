/**
 * 
 */
package com.tracker.customerapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Nishant Chhabra
 *
 */

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue
	private int id;
	
	private String firstName;
	
	private String lastName;
	
	private String dob;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String firstName, String lastName, String dob) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
}
