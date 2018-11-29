package com.lsmichel.CrmTutorial.message;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import com.lsmichel.CrmTutorial.model.CrmCompte;
import com.lsmichel.CrmTutorial.model.CrmContact;

public class CreateCompteWithContactsMessage implements Serializable {
private CrmCompte compte;
private Set<CrmContact> contacts ;
public CrmCompte getCompte() {
	return compte;
}
public void setCompte(CrmCompte compte) {
	this.compte = compte;
}
public Set<CrmContact> getContacts() {
	return contacts;
}
public void setContacts(Set<CrmContact> contacts) {
	this.contacts = contacts;
}
}
