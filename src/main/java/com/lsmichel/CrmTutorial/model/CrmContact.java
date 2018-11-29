package com.lsmichel.CrmTutorial.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class CrmContact implements Serializable{

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int contactId ;

@Column(nullable = true)
private String numTell;

@Column(nullable = true)
private String phoneNumber;

@Column(nullable = false)
private String email;

@Column(nullable = true)
private String webSite;

@Column(nullable = true)
private String contry;

@Column(nullable = true)
private String region;

@Column(nullable = true)
private String state;

@Column(nullable = true)
private String city;

@Column(nullable = true)
private String steet;

@ManyToMany(fetch = FetchType.LAZY,
cascade = {
    CascadeType.PERSIST,
    CascadeType.MERGE
},
mappedBy = "contacts"
)

private Set<CrmCompte> comptes = new HashSet<>();

public int getContactId() {
	return contactId;
}

public void setContactId(int contactId) {
	this.contactId = contactId;
}

public String getNumTell() {
	return numTell;
}

public void setNumTell(String numTell) {
	this.numTell = numTell;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getWebSite() {
	return webSite;
}

public void setWebSite(String webSite) {
	this.webSite = webSite;
}

public String getContry() {
	return contry;
}

public void setContry(String contry) {
	this.contry = contry;
}

public String getRegion() {
	return region;
}

public void setRegion(String region) {
	this.region = region;
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

public String getSteet() {
	return steet;
}

public void setSteet(String steet) {
	this.steet = steet;
}

}
