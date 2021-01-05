package com.epita.tpmajeurmineur.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epita.tpmajeurmineur.dao.PersonneDao;
import com.epita.tpmajeurmineur.entite.Personne;

@Service

public class PersonneServiceImpl implements PersonneService {

	@Autowired
	private PersonneDao dao;
	
	@Transactional
	public void save(Personne p) {
		
		
		dao.save(p);

	}
	
	public List<Personne> personnesMajeures() {
		
		return dao.findByAgeGreaterThan(18);
	}

	public Personne findByNomAndPrenom(String nom, String prenom) {
		return  dao.findByNomAndPrenom(nom, prenom);
	}

}
