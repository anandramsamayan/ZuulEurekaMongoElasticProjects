package com.purpleslatelogdev.elasticsearch.bean;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class User {
	
	private String id;
	private String name;
	private Date creationDate = new Date();
	private Map<String, String> userSettings = new HashMap<>();
	private String firstName;
	private String lastName;
	private String photo;
	private String contactTitle;
	private String address;
	private String city;
	private String postalcode;
	private String country;
	private String phone;
	private String fax;
	private String loginDateTime;
	private String lastLoginDateTime;
	private String logoutDateTime;
	private String lastLogoutDateTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Map<String, String> getUserSettings() {
		return userSettings;
	}
	public void setUserSettings(Map<String, String> userSettings) {
		this.userSettings = userSettings;
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
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getContactTitle() {
		return contactTitle;
	}
	public void setContactTitle(String contactTitle) {
		this.contactTitle = contactTitle;
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
	public String getPostalcode() {
		return postalcode;
	}
	public void setPostalcode(String postalcode) {
		this.postalcode = postalcode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getLoginDateTime() {
		return loginDateTime;
	}
	public void setLoginDateTime(String loginDateTime) {
		this.loginDateTime = loginDateTime;
	}
	public String getLastLoginDateTime() {
		return lastLoginDateTime;
	}
	public void setLastLoginDateTime(String lastLoginDateTime) {
		this.lastLoginDateTime = lastLoginDateTime;
	}
	public String getLogoutDateTime() {
		return logoutDateTime;
	}
	public void setLogoutDateTime(String logoutDateTime) {
		this.logoutDateTime = logoutDateTime;
	}
	public String getLastLogoutDateTime() {
		return lastLogoutDateTime;
	}
	public void setLastLogoutDateTime(String lastLogoutDateTime) {
		this.lastLogoutDateTime = lastLogoutDateTime;
	}
}
