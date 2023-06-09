package it.saracirone.fabula.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.saracirone.fabula.entities.Ruolo;
import it.saracirone.fabula.repositories.RuoloRepo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
@Service

public class RuoloService {
	
	@Autowired
	private RuoloRepo ur;
	
	public Ruolo save(Ruolo u) {
		return ur.save(u);
	}
	
	public Optional<Ruolo> getById(int id) {
		return ur.findById(id);
	}
	
	public List<Ruolo> getAll() {
		return ur.findAll();
	}
	
	public Page<Ruolo> getAll_page(Pageable pageable) {
		return ur.findAll(pageable);
	}
	
	public void delete(Ruolo u) {
		ur.delete(u);
	}

}
