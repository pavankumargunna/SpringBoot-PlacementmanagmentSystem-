package com.PlacmentManagmentSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="apply")
public class Apply {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
  
	private String firstName;
    private String last_name;
    private String email;
    private Long phone_no;
    private Long alternate_phone_no;
    private String address;
    private String qualification;
    private String branch;
    private float qualification_percentage;
    private int qualification_poy;
    private float XIIth_percentage;
    private int XIIth_poy;
    private float Xth_percentage;
    private int  Xth_poy;
    public long getId() {
  		return id;
  	}
  	public void setId(long id) {
  		this.id = id;
  	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(Long phone_no) {
		this.phone_no = phone_no;
	}
	public Long getAlternate_phone_no() {
		return alternate_phone_no;
	}
	public void setAlternate_phone_no(Long alternate_phone_no) {
		this.alternate_phone_no = alternate_phone_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public float getQualification_percentage() {
		return qualification_percentage;
	}
	public void setQualification_percentage(float qualification_percentage) {
		this.qualification_percentage = qualification_percentage;
	}
	public int getQualification_poy() {
		return qualification_poy;
	}
	public void setQualification_poy(int qualification_poy) {
		this.qualification_poy = qualification_poy;
	}
	public float getXIIth_percentage() {
		return XIIth_percentage;
	}
	public void setXIIth_percentage(float xIIth_percentage) {
		XIIth_percentage = xIIth_percentage;
	}
	public int getXIIth_poy() {
		return XIIth_poy;
	}
	public void setXIIth_poy(int xIIth_poy) {
		XIIth_poy = xIIth_poy;
	}
	public float getXth_percentage() {
		return Xth_percentage;
	}
	public void setXth_percentage(float xth_percentage) {
		Xth_percentage = xth_percentage;
	}
	public int getXth_poy() {
		return Xth_poy;
	}
	public void setXth_poy(int xth_poy) {
		Xth_poy = xth_poy;
	}
}