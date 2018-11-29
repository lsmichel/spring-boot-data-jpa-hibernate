package com.lsmichel.CrmTutorial.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lsmichel.CrmTutorial.model.CrmContact;

public interface CrmContactRepository extends JpaRepository<CrmContact, Long>{

}
