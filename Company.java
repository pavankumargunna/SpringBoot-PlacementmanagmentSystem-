package com.PlacmentManagmentSystem.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="company")
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String company_name;
	private String profile;
	private float salary;
	private String location;
	private String eligiblty;
	private int no_of_postion;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getEligiblty() {
		return eligiblty;
	}
	public void setEligiblty(String eligiblty) {
		eligiblty = eligiblty;
	}
	public int getNo_of_postion() {
		return no_of_postion;
	}
	public void setNo_of_postion(int no_of_postion) {
		this.no_of_postion = no_of_postion;
	}
}
