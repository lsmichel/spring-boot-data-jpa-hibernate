package com.lsmichel.CrmTutorial.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;

import com.lsmichel.CrmTutorial.model.CrmCompte;

public class CrmCompteRepository implements ICrmCompteRepository{
	
	

	@Override
	public List<CrmCompte> findAll() {
		return this.findAll();
	}

	@Override
	public List<CrmCompte> findAll(Sort sort) {
		
		return this.findAll(sort);
	}

	@Override
	public List<CrmCompte> findAllById(Iterable<Long> ids) {
		
		return this.findAllById(ids);
	}

	@Override
	public <S extends CrmCompte> List<S> saveAll(Iterable<S> entities) {
		return this.saveAll(entities);
	}

	@Override
	public void flush() {
		this.flush();
		
	}

	@Override
	public <S extends CrmCompte> S saveAndFlush(S entity) {
		
		return this.saveAndFlush(entity);
	}

	@Override
	public void deleteInBatch(Iterable<CrmCompte> entities) {
		this.deleteInBatch(entities);
		
	}

	@Override
	public void deleteAllInBatch() {
		this.deleteAllInBatch();
		
	}

	@Override
	public CrmCompte getOne(Long id) {
		
		return this.getOne(id);
	}

	@Override
	public <S extends CrmCompte> List<S> findAll(Example<S> example) {
		return this.findAll(example);
	}

	@Override
	public <S extends CrmCompte> List<S> findAll(Example<S> example, Sort sort) {
		
		return this.findAll(example ,sort );
	}

	@Override
	public Page<CrmCompte> findAll(Pageable pageable) {
		
		return this.findAll(pageable);
	}

	@Override
	public <S extends CrmCompte> S save(S entity) {
		
		return this.save(entity);
	}

	@Override
	public Optional<CrmCompte> findById(Long id) {
		
		return this.findById(id);
	}

	@Override
	public boolean existsById(Long id) {
		
		return this.existsById(id);
	}

	@Override
	public long count() {
		
		return this.count();
	}

	@Override
	public void deleteById(Long id) {
		
		this.deleteById(id);
	}

	@Override
	public void delete(CrmCompte entity) {
		this.delete(entity);
		
	}

	@Override
	public void deleteAll(Iterable<? extends CrmCompte> entities) {
		this.deleteAll(entities);
		
	}

	@Override
	public void deleteAll() {
		this.deleteAll();
		
	}

	@Override
	public <S extends CrmCompte> Optional<S> findOne(Example<S> example) {
		
		return this.findOne(example);
	}

	@Override
	public <S extends CrmCompte> Page<S> findAll(Example<S> example, Pageable pageable) {
		
		return this.findAll(example, pageable);
	}

	@Override
	public <S extends CrmCompte> long count(Example<S> example) {
		
		return this.count(example);
	}

	@Override
	public <S extends CrmCompte> boolean exists(Example<S> example) {
		
		return this.exists(example);
	}

}
