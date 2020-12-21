/**
 * 
 */
package com.epita.tp.nutrition.repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.epita.tp.nutrition.domain.Aliments;
import com.epita.tp.nutrition.domain.AlimentsRepository;

/**
 * @author abail
 *
 */
@Repository
public class AlimentsRepositoryImpl implements AlimentsRepository {

	public String findInfos(String nomAliment) {
		// TODO Auto-generated method stub
		return null;
	}

	public void chargementBase(ArrayList <Aliments> aliments ) {
	
		SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		for (Aliments aliment : aliments) {
			session.saveOrUpdate(aliment);	
		}
		session.getTransaction().commit();
		session.close();
	
		
		
	}



}
