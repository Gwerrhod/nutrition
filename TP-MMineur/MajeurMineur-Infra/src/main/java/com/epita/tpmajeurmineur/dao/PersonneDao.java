package com.epita.tpmajeurmineur.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.epita.tpmajeurmineur.entite.Personne;

public interface PersonneDao extends CrudRepository<Personne, Long>{
  List<Personne> findByAgeGreaterThan(int agemin);
  
  Personne findByNomAndPrenom(String nom, String prenom);
  
  List<Personne> findByAgeGreaterThanOrderByNomAsc(int agemin);
  
 
}
