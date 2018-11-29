package com.lsmichel.CrmTutorial.restController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lsmichel.CrmTutorial.message.CreateCompteWithContactsMessage;
import com.lsmichel.CrmTutorial.message.CreatedCompteWithContactsMessage;
import com.lsmichel.CrmTutorial.model.CrmCompte;
import com.lsmichel.CrmTutorial.model.CrmContact;
import com.lsmichel.CrmTutorial.model.repository.ICrmCompteRepository;
import com.lsmichel.CrmTutorial.model.repository.CrmContactRepository;

@CrossOrigin({"*"})
@RestController
@RequestMapping({"/crmCompte"})
public class CrmCompteRest {
	 @Autowired
	 ICrmCompteRepository crmCompteRepository;
	 @PostMapping("/createCompte")
	public CreatedCompteWithContactsMessage createNote(@Valid @RequestBody CreateCompteWithContactsMessage compte) {
		 CrmCompte crmCompte = compte.getCompte();
		 crmCompte.setContacts(compte.getContacts());
		 CrmCompte createdComp = crmCompteRepository.save(crmCompte);
		 CreatedCompteWithContactsMessage createdCompteWithContactsMessage = new CreatedCompteWithContactsMessage();
		 createdCompteWithContactsMessage.setCompte(createdComp);
		 return createdCompteWithContactsMessage;
	}
}
