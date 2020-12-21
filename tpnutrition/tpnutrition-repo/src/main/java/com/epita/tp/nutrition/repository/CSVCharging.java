package com.epita.tp.nutrition.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import com.epita.tp.nutrition.domain.Aliments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

@Repository
public class CSVCharging {



	final String[] HEADERs = { "alim_grp_code", "alim_ssgrp_code", "alim_ssssgrp_code", "alim_grp_nom_fr",
			"alim_ssgrp_nom_fr", "alim_ssssgrp_nom_fr", "alim_code", "alim_nom_fr", "alim_nom_sci", "Energie_kJ_100_g",
			"Energie_kcal_100_g", "Energie_N_facteurJones_kJ_100_g", "Energie_N_facteur_Jones_kcal_100_g",
			"Eau_g_100_g", "Proteines_N_x_facteur_de_Jones_g_100_g", "Proteines_N_x_6_25_g_100_g", "Glucides_g_100_g",
			"Lipides_g_100_g", "Sucres_g_100_g", "Fructose_g_100_g", "Galactose_g_100_g", "Glucose_g_100_g",
			"Lactose_g_100_g", "Maltose_g_100_g", "Saccharose_g_100_g", "Amidon_g_100_g", "Fibres_alimentaires_g_100_g",
			"Polyols_totaux_g_100_g", "Cendres_g_100_g", "Alcool_g_100_g", "Acides_organiques_g_100_g",
			"AG_satures_g_100_g", "AG_monoinsatures_g_100_g", "AG_polyinsatures_g_100_g", "AG_4_0_butyrique_g_100_g",
			"AG_6_0_caproïque_g_100_g", "AG_8_0_caprylique_g_100_g", "AG_10_0_caprique_g_100_g",
			"AG_12_0_laurique_g_100_g", "AG_14_0_myristique_g_100_g", "AG_16_0_palmitique_g_100_g",
			"AG_18_0_stearique_g_100_g", "AG_18_1_9c_n_9_oleique_g_100_g", "AG_18_2_9c12c_n_6_linoleique_g_100_g",
			"AG_18_3_c9c12c15_n_3_alpha_linolenique_g_100_", "AG_20_4_5c8c11c14c_n_6_arachidonique_g_100_g",
			"AG_20_5_5c8c11c14c17c_n_3_EPA_g_100_g", "AG_22_6_4c7c10c13c16c19c_n_3_DHA_g_100_g", "Cholesterol_mg_100_g",
			"Sel_chlorure_de_sodium_g_100_g", "Calcium_mg_100_g", "Chlorure_mg_100_g", "Cuivre_mg_100_g",
			"Fer_mg_100_g", "Iode_microg_100_g", "Magnesium_mg_100_g", "Manganese_mg_100_g", "Phosphore_mg_100_g",
			"Potassium_mg_100_g", "Selenium_microg_100_g", "Sodium_mg_100_g", "Zinc_mg_100_g", "Retinol_microg_100_g",
			"Beta_Carotene_microg_100_g", "Vitamine_D_microg_100_g", "Vitamine_E_mg_100_g", "Vitamine_K1_microg_100_g",
			"Vitamine_K2_microg_100_g", "Vitamine_C_mg_100_g", "Vitamine_B1_ou_Thiamine_mg_100_g",
			"Vitamine_B2_ou_Riboflavine_mg_100_g", "Vitamine_B3_ou_PP_ou_Niacine_mg_100_g",
			"Vitamine_B5_ou_Acide_pantothenique_mg_100_g", "Vitamine_B6_mg_100_g",
			"Vitamine_B9_ou_Folates_totaux_microg_100_g" };

	
	public  List<Aliments> readAll(InputStream is) throws IOException {
		System.out.println("debut methode chargement");

		
		BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));

		CSVParser csvParser = new CSVParser(fileReader,
				CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());

		List<Aliments> alimentsListe = new ArrayList<Aliments>();
		Iterable<CSVRecord> csvRecords = csvParser.getRecords();

		for (CSVRecord csvRecord : csvRecords) {
			Aliments alimentsAIntegrer = new Aliments();
			alimentsAIntegrer.setAlim_grp_code(csvRecord.get("Alim_grp_code"));
			alimentsAIntegrer.setAlim_ssgrp_code(csvRecord.get("Alim_ssgrp_code"));
			alimentsAIntegrer.setAlim_ssssgrp_code(csvRecord.get("Alim_ssssgrp_code"));
			alimentsAIntegrer.setAlim_grp_nom_fr(csvRecord.get("Alim_grp_nom_fr"));
			alimentsAIntegrer.setAlim_ssgrp_nom_fr(csvRecord.get("Alim_ssgrp_nom_fr"));
			alimentsAIntegrer.setAlim_ssssgrp_nom_fr(csvRecord.get("Alim_ssssgrp_nom_fr"));
			alimentsAIntegrer.setAlim_code(csvRecord.get("Alim_code"));
			alimentsAIntegrer.setAlim_nom_fr(csvRecord.get("Alim_nom_fr"));
			alimentsAIntegrer.setAlim_nom_sci(csvRecord.get("Alim_nom_sci"));
			alimentsAIntegrer.setEnergie_kJ_100_g(csvRecord.get("Energie_kJ_100_g"));
			alimentsAIntegrer.setEnergie_kcal_100_g(csvRecord.get("Energie_kcal_100_g"));
			alimentsAIntegrer.setEnergie_N_facteurJones_kJ_100_g(csvRecord.get("Energie_N_facteurJones_kJ_100_g"));
			alimentsAIntegrer
					.setEnergie_N_facteur_Jones_kcal_100_g(csvRecord.get("Energie_N_facteur_Jones_kcal_100_g"));
			alimentsAIntegrer.setEau_g_100_g(csvRecord.get("Eau_g_100_g"));
			alimentsAIntegrer
					.setProteines_N_x_facteur_de_Jones_g_100_g(csvRecord.get("Proteines_N_x_facteur_de_Jones_g_100_g"));
			alimentsAIntegrer.setProteines_N_x_6_25_g_100_g(csvRecord.get("Proteines_N_x_6_25_g_100_g"));
			alimentsAIntegrer.setGlucides_g_100_g(csvRecord.get("Glucides_g_100_g"));
			alimentsAIntegrer.setLipides_g_100_g(csvRecord.get("Lipides_g_100_g"));
			alimentsAIntegrer.setSucres_g_100_g(csvRecord.get("Sucres_g_100_g"));
			alimentsAIntegrer.setFructose_g_100_g(csvRecord.get("Fructose_g_100_g"));
			alimentsAIntegrer.setGalactose_g_100_g(csvRecord.get("Galactose_g_100_g"));
			alimentsAIntegrer.setGlucose_g_100_g(csvRecord.get("Glucose_g_100_g"));
			alimentsAIntegrer.setLactose_g_100_g(csvRecord.get("Lactose_g_100_g"));
			alimentsAIntegrer.setMaltose_g_100_g(csvRecord.get("Maltose_g_100_g"));
			alimentsAIntegrer.setSaccharose_g_100_g(csvRecord.get("Saccharose_g_100_g"));
			alimentsAIntegrer.setAmidon_g_100_g(csvRecord.get("Amidon_g_100_g"));
			alimentsAIntegrer.setFibres_alimentaires_g_100_g(csvRecord.get("Fibres_Alimentaires_g_100_g"));
			alimentsAIntegrer.setPolyols_totaux_g_100_g(csvRecord.get("Polyols_totaux_g_100_g"));
			alimentsAIntegrer.setCendres_g_100_g(csvRecord.get("Cendres_g_100_g"));
			alimentsAIntegrer.setAlcool_g_100_g(csvRecord.get("Alcool_g_100_g"));
			alimentsAIntegrer.setAcides_organiques_g_100_g(csvRecord.get("Acides_organiques_g_100_g"));
			alimentsAIntegrer.setAG_satures_g_100_g(csvRecord.get("AG_satures_g_100_g"));
			alimentsAIntegrer.setAG_monoinsatures_g_100_g(csvRecord.get("AG_monoinsatures_g_100_g"));
			alimentsAIntegrer.setAG_polyinsatures_g_100_g(csvRecord.get("AG_polyinsatures_g_100_g"));
			alimentsAIntegrer.setAG_4_0_butyrique_g_100_g(csvRecord.get("AG_4_0_butyrique_g_100_g"));
			alimentsAIntegrer.setAG_6_0_caproïque_g_100_g(csvRecord.get("AG_6_0_caproïque_g_100_g"));
			alimentsAIntegrer.setAG_8_0_caprylique_g_100_g(csvRecord.get("AG_8_0_caprylique_g_100_g"));
			alimentsAIntegrer.setAG_10_0_caprique_g_100_g(csvRecord.get("AG_10_0_caprique_g_100_g"));
			alimentsAIntegrer.setAG_12_0_laurique_g_100_g(csvRecord.get("AG_12_0_laurique_g_100_g"));
			alimentsAIntegrer.setAG_14_0_myristique_g_100_g(csvRecord.get("AG_14_0_myristique_g_100_g"));
			alimentsAIntegrer.setAG_16_0_palmitique_g_100_g(csvRecord.get("AG_16_0_palmitique_g_100_g"));
			alimentsAIntegrer.setAG_18_0_stearique_g_100_g(csvRecord.get("AG_18_0_stearique_g_100_g"));
			alimentsAIntegrer.setAG_18_1_9c_n_9_oleique_g_100_g(csvRecord.get("AG_18_1_9c_n_9_oleique_g_100_g"));
			alimentsAIntegrer
					.setAG_18_2_9c12c_n_6_linoleique_g_100_g(csvRecord.get("AG_18_2_9c12c_n_6_linoleique_g_100_g"));
			alimentsAIntegrer.setAG_18_3_c9c12c15_n_3_alpha_linolenique_g_100_g(
					csvRecord.get("AG_18_3_c9c12c15_n_3_alpha_linolenique_g_100_"));
			alimentsAIntegrer.setAG_20_4_5c8c11c14c_n_6_arachidonique_g_100_g(
					csvRecord.get("AG_20_4_5c8c11c14c_n_6_arachidonique_g_100_g"));
			alimentsAIntegrer
					.setAG_20_5_5c8c11c14c17c_n_3_EPA_g_100_g(csvRecord.get("AG_20_5_5c8c11c14c17c_n_3_EPA_g_100_g"));
			alimentsAIntegrer.setAG_22_6_4c7c10c13c16c19c_n_3_DHA_g_100_g(
					csvRecord.get("AG_22_6_4c7c10c13c16c19c_n_3_DHA_g_100_g"));
			alimentsAIntegrer.setCholesterol_mg_100_g(csvRecord.get("Cholesterol_mg_100_g"));
			alimentsAIntegrer.setSel_chlorure_de_sodium_g_100_g(csvRecord.get("Sel_chlorure_de_sodium_g_100_g"));
			alimentsAIntegrer.setCalcium_mg_100_g(csvRecord.get("Calcium_mg_100_g"));
			alimentsAIntegrer.setChlorure_mg_100_g(csvRecord.get("Chlorure_mg_100_g"));
			alimentsAIntegrer.setCuivre_mg_100_g(csvRecord.get("Cuivre_mg_100_g"));
			alimentsAIntegrer.setFer_mg_100_g(csvRecord.get("Fer_mg_100_g"));
			alimentsAIntegrer.setIode_microg_100_g(csvRecord.get("Iode_microg_100_g"));
			alimentsAIntegrer.setMagnesium_mg_100_g(csvRecord.get("Magnesium_mg_100_g"));
			alimentsAIntegrer.setManganese_mg_100_g(csvRecord.get("Manganese_mg_100_g"));
			alimentsAIntegrer.setPhosphore_mg_100_g(csvRecord.get("Phosphore_mg_100_g"));
			alimentsAIntegrer.setPotassium_mg_100_g(csvRecord.get("Potassium_mg_100_g"));
			alimentsAIntegrer.setSelenium_microg_100_g(csvRecord.get("Selenium_microg_100_g"));
			alimentsAIntegrer.setSodium_mg_100_g(csvRecord.get("Sodium_mg_100_g"));
			alimentsAIntegrer.setZinc_mg_100_g(csvRecord.get("Zinc_mg_100_g"));
			alimentsAIntegrer.setRetinol_microg_100_g(csvRecord.get("Retinol_microg_100_g"));
			alimentsAIntegrer.setBeta_Carotene_microg_100_g(csvRecord.get("Beta_Carotene_microg_100_g"));
			alimentsAIntegrer.setVitamine_D_microg_100_g(csvRecord.get("Vitamine_D_microg_100_g"));
			alimentsAIntegrer.setVitamine_E_mg_100_g(csvRecord.get("Vitamine_E_mg_100_g"));
			alimentsAIntegrer.setVitamine_K1_microg_100_g(csvRecord.get("Vitamine_K1_microg_100_g"));
			alimentsAIntegrer.setVitamine_K2_microg_100_g(csvRecord.get("Vitamine_K2_microg_100_g"));
			alimentsAIntegrer.setVitamine_C_mg_100_g(csvRecord.get("Vitamine_C_mg_100_g"));
			alimentsAIntegrer.setVitamine_B1_ou_Thiamine_mg_100_g(csvRecord.get("Vitamine_B1_ou_Thiamine_mg_100_g"));
			alimentsAIntegrer
					.setVitamine_B2_ou_Riboflavine_mg_100_g(csvRecord.get("Vitamine_B2_ou_Riboflavine_mg_100_g"));
			alimentsAIntegrer
					.setVitamine_B3_ou_PP_ou_Niacine_mg_100_g(csvRecord.get("Vitamine_B3_ou_PP_ou_Niacine_mg_100_g"));
			alimentsAIntegrer.setVitamine_B5_ou_Acide_pantothenique_mg_100_g(
					csvRecord.get("Vitamine_B5_ou_Acide_pantothenique_mg_100_g"));
			alimentsAIntegrer.setVitamine_B6_mg_100_g(csvRecord.get("Vitamine_B6_mg_100_g"));
			alimentsAIntegrer.setVitamine_B9_ou_Folates_totaux_microg_100_g(
					csvRecord.get("Vitamine_B9_ou_Folates_totaux_microg_100_g"));

			alimentsListe.add(alimentsAIntegrer);
		}
		csvParser.close();
		return alimentsListe;

	}

}
