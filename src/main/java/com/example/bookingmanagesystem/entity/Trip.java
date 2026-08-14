package com.example.bookingmanagesystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Trip {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
    @NotBlank(message="Field is mandatory")
	@Size(min=2,max=15,message="Enter proper name")
private String name;
	@Email(message="Enter proper email format")
	@NotBlank(message="email is requried")
private String email;
	@NotBlank(message="phone number is requried")
private String ph_no;
	@NotBlank(message="Field is mandatory")
	@Size(min=2,max=10,message="Enter proper Source")
private String source;
	@NotBlank(message="Field is mandatory")
	@Size(min=2,max=10,message="Enter proper Destination")
private String destination;
	@NotBlank(message="Field is mandatory")
private String date_time;
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @return the ph_no
 */
public @NotBlank(message = "phone number is requried") String getPh_no() {
	return ph_no;
}
/**
 * @param ph_no the ph_no to set
 */
public void setPh_no(String ph_no) {
	this.ph_no = ph_no;
}
/**
 * @return the source
 */
public String getSource() {
	return source;
}
/**
 * @param source the source to set
 */
public void setSource(String source) {
	this.source = source;
}
/**
 * @return the destination
 */
public String getDestination() {
	return destination;
}
/**
 * @param destination the destination to set
 */
public void setDestination(String destination) {
	this.destination = destination;
}
/**
 * @return the date_time
 */
public String getDate_time() {
	return date_time;
}
/**
 * @param date_time the date_time to set
 */
public void setDate_time(String date_time) {
	this.date_time = date_time;
}
@Override
public String toString() {
	return "Trip [id=" + id + ", name=" + name + ", email=" + email + ", ph_no=" + ph_no + ", source=" + source
			+ ", destination=" + destination + ", date_time=" + date_time + "]";
}


}
