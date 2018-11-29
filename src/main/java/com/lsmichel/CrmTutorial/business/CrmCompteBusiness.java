package com.lsmichel.CrmTutorial.business;

import org.springframework.stereotype.Component;

import com.lsmichel.CrmTutorial.model.CrmCompte;

@Component
public class CrmCompteBusiness {
public Boolean IsValidAccount(CrmCompte compte) {
	if(compte !=null && 
			compte.getCompteFistName()!=null && !compte.getCompteFistName().isEmpty()  && 
			compte.getCompteLastName()!=null && !compte.getCompteLastName().isEmpty()  && 
			compte.getCompteBrithDate()!=null && !compte.getCompteBrithDate().isEmpty() &&
			compte.getCompteBirthPlace()!=null && ! compte.getCompteBirthPlace().isEmpty())
		return true ;

	    return false;
  }

}
