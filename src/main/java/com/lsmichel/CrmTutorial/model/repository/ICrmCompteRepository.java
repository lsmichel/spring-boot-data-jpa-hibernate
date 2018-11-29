package com.lsmichel.CrmTutorial.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lsmichel.CrmTutorial.model.CrmCompte;


public interface ICrmCompteRepository extends JpaRepository<CrmCompte, Long>{

}
