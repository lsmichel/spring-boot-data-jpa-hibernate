package com.lsmichel.CrmTutorial.model;

import java.io.Serializable;
import java.util.HashSet;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import java.util.Set;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, allowGetters = true)
public class CrmCompte implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int compteId ;
	
	@Column(nullable = false)
    private String compteFistName;
	
	@Column(nullable = false)
    private String compteLastName;
	
	@Column(nullable = true)
    private String comptePhoto;
	
	@Column(nullable = false)
    private String compteBrithDate;
	
	@Column(nullable = false)
    private String compteBirthPlace;
	
	
	@ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
	@JoinTable(name = "crmCompte_Contact",
    joinColumns = { @JoinColumn(name = "compteId") },
    inverseJoinColumns = { @JoinColumn(name = "contactId") })
	private Set<CrmContact> contacts = new HashSet<>();

	public int getCompteId() {
		return compteId;
	}

	public void setCompteId(int compteId) {
		this.compteId = compteId;
	}

	public String getCompteFistName() {
		return compteFistName;
	}

	public void setCompteFistName(String compteFistName) {
		this.compteFistName = compteFistName;
	}

	public String getCompteLastName() {
		return compteLastName;
	}

	public void setCompteLastName(String compteLastName) {
		this.compteLastName = compteLastName;
	}

	public String getComptePhoto() {
		return comptePhoto;
	}

	public void setComptePhoto(String comptePhoto) {
		this.comptePhoto = comptePhoto;
	}

	public String getCompteBrithDate() {
		return compteBrithDate;
	}

	public void setCompteBrithDate(String compteBrithDate) {
		this.compteBrithDate = compteBrithDate;
	}

	public String getCompteBirthPlace() {
		return compteBirthPlace;
	}

	public void setCompteBirthPlace(String compteBirthPlace) {
		this.compteBirthPlace = compteBirthPlace;
	}

	public Set<CrmContact> getContacts() {
		return contacts;
	}

	public void setContacts(Set<CrmContact> contacts) {
		this.contacts = contacts;
	}
	
	
}
