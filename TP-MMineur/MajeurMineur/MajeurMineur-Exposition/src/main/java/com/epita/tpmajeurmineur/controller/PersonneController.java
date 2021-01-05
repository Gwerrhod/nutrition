package com.epita.tpmajeurmineur.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epita.tpmajeurmineur.entite.Personne;
import com.epita.tpmajeurmineur.service.PersonneService;

@RestController
@RequestMapping("/personne")
public class PersonneController {

	@Autowired
	private PersonneService service;
	
	@GetMapping("/create/{nom}/{age}")
	public void createPersonne(@PathVariable("nom") String nom,
							  @PathVariable("age") int age) {
		
		Personne p=new Personne();
		p.setNom(nom);
		p.setAge(age);
		service.save(p);
		
	}
	
	@PostMapping("/postcreate")
	public String createFromPostPersonne(@RequestBody Personne p) {
		
		if(p.getAge()>0) {
			service.save(p);
			return "Personne enregistrée avec succès";
		}
		else {
			return "La personne n'a pas l'age requis";
		}
	}
	
	@GetMapping("/list")
	public List<Personne> getPersonneMajeures(){
		return service.personnesMajeures();
	}
	
	@GetMapping("/list/{nom}/{prenom}")
	public Personne getPersonne(@PathVariable("nom") String nom,
			  @PathVariable("prenom") String prenom){
		return service.findByNomAndPrenom(nom, prenom);
	}
}
