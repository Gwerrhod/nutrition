package com.epita.tpmajeurmineur.service;

import java.util.List;

import com.epita.tpmajeurmineur.entite.Personne;

public interface PersonneService {
    void save(Personne p);
    
    List<Personne> personnesMajeures();
    
    Personne findByNomAndPrenom(String nom, String prenom);
}
