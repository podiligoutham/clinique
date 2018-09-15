package com.training.ocs.bean;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
//user
@Entity
@Table(name = "ocs_tbl_user_profile")
public class ProfileBean{
	@Id 
	//@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="gen_id")
	//@SequenceGenerator(name="gen_id",sequenceName="id_seq")
	@Column(name="userid",updatable=false,nullable=false)
	private String userID;
	private String firstName;
	private String lastName;
	//@Temporal(TemporalType.DATE)
	//@DateTimeFormat(pattern="MM/dd/yyyy")
	private Date dateOfBirth;
	private String gender;
	private String street;
	private String location;	
	private String city;
	private String state;
	private String pincode;
	@Pattern(regexp = "[1-9]{1}[0-9]{9}", message = "cell number not valid")
	private String mobileNo;
	@Email(message = "email id not valid")
	private String emailID;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	
	@Override
	public String toString() {
		return "ProfileBean [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", street=" + street + ", location="
				+ location + ", city=" + city + ", state=" + state + ", pincode=" + pincode + ", mobileNo=" + mobileNo
				+ ", emailID=" + emailID + "]";
	}

	
	
	
}
