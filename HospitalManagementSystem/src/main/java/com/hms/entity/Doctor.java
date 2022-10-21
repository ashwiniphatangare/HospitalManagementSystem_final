package com.hms.entity;









import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name = "Doctor")
public class Doctor {

	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public int getContact() {
		return contact;
	}



	public void setContact(int contact) {
		this.contact = contact;
	}



	public String getSpecialization() {
		return specialization;
	}



	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}



	


	



	@Column(name = "name")
	private String Name;
	
	@Column(name = "contact")
	private int contact;
	
	@Column(name = "specialization")
	private String specialization;
	
	
	
	

		
	
}
