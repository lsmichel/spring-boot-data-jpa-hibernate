package com.lsmichel.CrmTutorial.message;

import java.io.Serializable;
import java.util.List;

import com.lsmichel.CrmTutorial.model.CrmCompte;

public class CreatedCompteWithContactsMessage implements Serializable{
 public CrmCompte compte;

public CrmCompte getCompte() {
	return compte;
}

public void setCompte(CrmCompte compte) {
	this.compte = compte;
}


 
}
