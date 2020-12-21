package com.epita.tp.nutrition.expo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.epita.tp.nutrition.repository.CSVCharging;
import com.epita.tp.nutrition.service.CSVChargementService;


@RestController
@RequestMapping("/charger")
public class NutritionController {

	@Autowired
	CSVChargementService csvChargementService;
	
	@GetMapping
	public void chargement() {
		String path = "C:\\Users\\abail\\Documents\\exos vacances\\fichier.csv";
		try {
			csvChargementService.save(path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
