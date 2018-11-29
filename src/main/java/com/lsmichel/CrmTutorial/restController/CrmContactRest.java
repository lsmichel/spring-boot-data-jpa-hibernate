package com.lsmichel.CrmTutorial.restController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.lsmichel.CrmTutorial.model.CrmContact;
import com.lsmichel.CrmTutorial.model.repository.CrmContactRepository;

@CrossOrigin({"*"})
@RestController
@RequestMapping({"/crmContact"})
public class CrmContactRest {
	 @Autowired
	 CrmContactRepository crmContactRepository;
	@PostMapping("/createContact")
	public List<CrmContact> createNote(@Valid @RequestBody CrmContact contact) {
		if(contact.getEmail()==null) {
			return null;
		}
	     crmContactRepository.save(contact);
	     return crmContactRepository.findAll();
	}
}
