package com.epita.tp.nutrition.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.epita.tp.nutrition.domain.Aliments;
import com.epita.tp.nutrition.repository.AlimentsRepositoryImpl;
import com.epita.tp.nutrition.repository.CSVCharging;

@Service
public class CSVChargementServiceImpl implements CSVChargementService {
	
	@Autowired
	AlimentsRepositoryImpl alimentsRepo;
	@Autowired
	CSVCharging csvCharging;

	public void save(String path) throws IOException {
		FileInputStream is;
		try {
			is = new FileInputStream(path);
			ArrayList <Aliments> aliments = (ArrayList<Aliments>) csvCharging.readAll(is);
			alimentsRepo.chargementBase(aliments);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
