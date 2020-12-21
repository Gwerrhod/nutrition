package com.epita.tp.nutrition.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

@Entity
public class Aliments {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String alim_grp_code ;
	private String alim_ssgrp_code ;
	private String alim_ssssgrp_code ;
	
	@NotNull
	private String alim_grp_nom_fr ;
	private String alim_ssgrp_nom_fr ;
	private String alim_ssssgrp_nom_fr ;
	private String alim_code ;
	private String alim_nom_fr ;
	private String alim_nom_sci ;
	private String Energie_kJ_100_g ;
	private String Energie_kcal_100_g ;
	private String Energie_N_facteurJones_kJ_100_g ;
	private String Energie_N_facteur_Jones_kcal_100_g ;
	private String Eau_g_100_g ;
	private String Proteines_N_x_facteur_de_Jones_g_100_g ;
	private String Proteines_N_x_6_25_g_100_g ;
	private String Glucides_g_100_g ;
	private String Lipides_g_100_g ;
	private String Sucres_g_100_g ;
	private String Fructose_g_100_g ;
	private String Galactose_g_100_g ;
	private String Glucose_g_100_g ;
	private String Lactose_g_100_g ;
	private String Maltose_g_100_g ;
	private String Saccharose_g_100_g ;
	private String Amidon_g_100_g ;
	private String Fibres_alimentaires_g_100_g ;
	private String Polyols_totaux_g_100_g ;
	private String Cendres_g_100_g ;
	private String Alcool_g_100_g ;
	private String Acides_organiques_g_100_g ;
	private String AG_satures_g_100_g ;
	private String AG_monoinsatures_g_100_g ;
	private String AG_polyinsatures_g_100_g ;
	private String AG_4_0_butyrique_g_100_g ;
	private String AG_6_0_caproïque_g_100_g ;
	private String AG_8_0_caprylique_g_100_g ;
	private String AG_10_0_caprique_g_100_g ;
	private String AG_12_0_laurique_g_100_g ;
	private String AG_14_0_myristique_g_100_g ;
	private String AG_16_0_palmitique_g_100_g ;
	private String AG_18_0_stearique_g_100_g ;
	private String AG_18_1_9c_n_9_oleique_g_100_g ;
	private String AG_18_2_9c12c_n_6_linoleique_g_100_g ;
	private String AG_18_3_c9c12c15_n_3_alpha_linolenique_g_100_g ;
	private String AG_20_4_5c8c11c14c_n_6_arachidonique_g_100_g ;
	private String AG_20_5_5c8c11c14c17c_n_3_EPA_g_100_g ;
	private String AG_22_6_4c7c10c13c16c19c_n_3_DHA_g_100_g ;
	private String Cholesterol_mg_100_g ;
	private String Sel_chlorure_de_sodium_g_100_g ;
	private String Calcium_mg_100_g ;
	private String Chlorure_mg_100_g ;
	private String Cuivre_mg_100_g ;
	private String Fer_mg_100_g ;
	private String Iode_microg_100_g ;
	private String Magnesium_mg_100_g ;
	private String Manganese_mg_100_g ;
	private String Phosphore_mg_100_g ;
	private String Potassium_mg_100_g ;
	private String Selenium_microg_100_g ;
	private String Sodium_mg_100_g ;
	private String Zinc_mg_100_g ;
	private String Retinol_microg_100_g ;
	private String Beta_Carotene_microg_100_g ;
	private String Vitamine_D_microg_100_g ;
	private String Vitamine_E_mg_100_g ;
	private String Vitamine_K1_microg_100_g ;
	private String Vitamine_K2_microg_100_g ;
	private String Vitamine_C_mg_100_g ;
	private String Vitamine_B1_ou_Thiamine_mg_100_g ;
	private String Vitamine_B2_ou_Riboflavine_mg_100_g ;
	private String Vitamine_B3_ou_PP_ou_Niacine_mg_100_g ;
	private String Vitamine_B5_ou_Acide_pantothenique_mg_100_g ;
	private String Vitamine_B6_mg_100_g ;
	private String Vitamine_B9_ou_Folates_totaux_microg_100_g ;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAlim_grp_code() {
		return alim_grp_code;
	}
	public void setAlim_grp_code(String alim_grp_code) {
		this.alim_grp_code = alim_grp_code;
	}
	public String getAlim_ssgrp_code() {
		return alim_ssgrp_code;
	}
	public void setAlim_ssgrp_code(String alim_ssgrp_code) {
		this.alim_ssgrp_code = alim_ssgrp_code;
	}
	public String getAlim_ssssgrp_code() {
		return alim_ssssgrp_code;
	}
	public void setAlim_ssssgrp_code(String alim_ssssgrp_code) {
		this.alim_ssssgrp_code = alim_ssssgrp_code;
	}
	public String getAlim_grp_nom_fr() {
		return alim_grp_nom_fr;
	}
	public void setAlim_grp_nom_fr(String alim_grp_nom_fr) {
		this.alim_grp_nom_fr = alim_grp_nom_fr;
	}
	public String getAlim_ssgrp_nom_fr() {
		return alim_ssgrp_nom_fr;
	}
	public void setAlim_ssgrp_nom_fr(String alim_ssgrp_nom_fr) {
		this.alim_ssgrp_nom_fr = alim_ssgrp_nom_fr;
	}
	public String getAlim_ssssgrp_nom_fr() {
		return alim_ssssgrp_nom_fr;
	}
	public void setAlim_ssssgrp_nom_fr(String alim_ssssgrp_nom_fr) {
		this.alim_ssssgrp_nom_fr = alim_ssssgrp_nom_fr;
	}
	public String getAlim_code() {
		return alim_code;
	}
	public void setAlim_code(String alim_code) {
		this.alim_code = alim_code;
	}
	public String getAlim_nom_fr() {
		return alim_nom_fr;
	}
	public void setAlim_nom_fr(String alim_nom_fr) {
		this.alim_nom_fr = alim_nom_fr;
	}
	public String getAlim_nom_sci() {
		return alim_nom_sci;
	}
	public void setAlim_nom_sci(String alim_nom_sci) {
		this.alim_nom_sci = alim_nom_sci;
	}
	public String getEnergie_kJ_100_g() {
		return Energie_kJ_100_g;
	}
	public void setEnergie_kJ_100_g(String energie_kJ_100_g) {
		Energie_kJ_100_g = energie_kJ_100_g;
	}
	public String getEnergie_kcal_100_g() {
		return Energie_kcal_100_g;
	}
	public void setEnergie_kcal_100_g(String energie_kcal_100_g) {
		Energie_kcal_100_g = energie_kcal_100_g;
	}
	public String getEnergie_N_facteurJones_kJ_100_g() {
		return Energie_N_facteurJones_kJ_100_g;
	}
	public void setEnergie_N_facteurJones_kJ_100_g(String energie_N_facteurJones_kJ_100_g) {
		Energie_N_facteurJones_kJ_100_g = energie_N_facteurJones_kJ_100_g;
	}
	public String getEnergie_N_facteur_Jones_kcal_100_g() {
		return Energie_N_facteur_Jones_kcal_100_g;
	}
	public void setEnergie_N_facteur_Jones_kcal_100_g(String energie_N_facteur_Jones_kcal_100_g) {
		Energie_N_facteur_Jones_kcal_100_g = energie_N_facteur_Jones_kcal_100_g;
	}
	public String getEau_g_100_g() {
		return Eau_g_100_g;
	}
	public void setEau_g_100_g(String eau_g_100_g) {
		Eau_g_100_g = eau_g_100_g;
	}
	public String getProteines_N_x_facteur_de_Jones_g_100_g() {
		return Proteines_N_x_facteur_de_Jones_g_100_g;
	}
	public void setProteines_N_x_facteur_de_Jones_g_100_g(String proteines_N_x_facteur_de_Jones_g_100_g) {
		Proteines_N_x_facteur_de_Jones_g_100_g = proteines_N_x_facteur_de_Jones_g_100_g;
	}
	public String getProteines_N_x_6_25_g_100_g() {
		return Proteines_N_x_6_25_g_100_g;
	}
	public void setProteines_N_x_6_25_g_100_g(String proteines_N_x_6_25_g_100_g) {
		Proteines_N_x_6_25_g_100_g = proteines_N_x_6_25_g_100_g;
	}
	public String getGlucides_g_100_g() {
		return Glucides_g_100_g;
	}
	public void setGlucides_g_100_g(String glucides_g_100_g) {
		Glucides_g_100_g = glucides_g_100_g;
	}
	public String getLipides_g_100_g() {
		return Lipides_g_100_g;
	}
	public void setLipides_g_100_g(String lipides_g_100_g) {
		Lipides_g_100_g = lipides_g_100_g;
	}
	public String getSucres_g_100_g() {
		return Sucres_g_100_g;
	}
	public void setSucres_g_100_g(String sucres_g_100_g) {
		Sucres_g_100_g = sucres_g_100_g;
	}
	public String getFructose_g_100_g() {
		return Fructose_g_100_g;
	}
	public void setFructose_g_100_g(String fructose_g_100_g) {
		Fructose_g_100_g = fructose_g_100_g;
	}
	public String getGalactose_g_100_g() {
		return Galactose_g_100_g;
	}
	public void setGalactose_g_100_g(String galactose_g_100_g) {
		Galactose_g_100_g = galactose_g_100_g;
	}
	public String getGlucose_g_100_g() {
		return Glucose_g_100_g;
	}
	public void setGlucose_g_100_g(String glucose_g_100_g) {
		Glucose_g_100_g = glucose_g_100_g;
	}
	public String getLactose_g_100_g() {
		return Lactose_g_100_g;
	}
	public void setLactose_g_100_g(String lactose_g_100_g) {
		Lactose_g_100_g = lactose_g_100_g;
	}
	public String getMaltose_g_100_g() {
		return Maltose_g_100_g;
	}
	public void setMaltose_g_100_g(String maltose_g_100_g) {
		Maltose_g_100_g = maltose_g_100_g;
	}
	public String getSaccharose_g_100_g() {
		return Saccharose_g_100_g;
	}
	public void setSaccharose_g_100_g(String saccharose_g_100_g) {
		Saccharose_g_100_g = saccharose_g_100_g;
	}
	public String getAmidon_g_100_g() {
		return Amidon_g_100_g;
	}
	public void setAmidon_g_100_g(String amidon_g_100_g) {
		Amidon_g_100_g = amidon_g_100_g;
	}
	public String getFibres_alimentaires_g_100_g() {
		return Fibres_alimentaires_g_100_g;
	}
	public void setFibres_alimentaires_g_100_g(String fibres_alimentaires_g_100_g) {
		Fibres_alimentaires_g_100_g = fibres_alimentaires_g_100_g;
	}
	public String getPolyols_totaux_g_100_g() {
		return Polyols_totaux_g_100_g;
	}
	public void setPolyols_totaux_g_100_g(String polyols_totaux_g_100_g) {
		Polyols_totaux_g_100_g = polyols_totaux_g_100_g;
	}
	public String getCendres_g_100_g() {
		return Cendres_g_100_g;
	}
	public void setCendres_g_100_g(String cendres_g_100_g) {
		Cendres_g_100_g = cendres_g_100_g;
	}
	public String getAlcool_g_100_g() {
		return Alcool_g_100_g;
	}
	public void setAlcool_g_100_g(String alcool_g_100_g) {
		Alcool_g_100_g = alcool_g_100_g;
	}
	public String getAcides_organiques_g_100_g() {
		return Acides_organiques_g_100_g;
	}
	public void setAcides_organiques_g_100_g(String acides_organiques_g_100_g) {
		Acides_organiques_g_100_g = acides_organiques_g_100_g;
	}
	public String getAG_satures_g_100_g() {
		return AG_satures_g_100_g;
	}
	public void setAG_satures_g_100_g(String aG_satures_g_100_g) {
		AG_satures_g_100_g = aG_satures_g_100_g;
	}
	public String getAG_monoinsatures_g_100_g() {
		return AG_monoinsatures_g_100_g;
	}
	public void setAG_monoinsatures_g_100_g(String aG_monoinsatures_g_100_g) {
		AG_monoinsatures_g_100_g = aG_monoinsatures_g_100_g;
	}
	public String getAG_polyinsatures_g_100_g() {
		return AG_polyinsatures_g_100_g;
	}
	public void setAG_polyinsatures_g_100_g(String aG_polyinsatures_g_100_g) {
		AG_polyinsatures_g_100_g = aG_polyinsatures_g_100_g;
	}
	public String getAG_4_0_butyrique_g_100_g() {
		return AG_4_0_butyrique_g_100_g;
	}
	public void setAG_4_0_butyrique_g_100_g(String aG_4_0_butyrique_g_100_g) {
		AG_4_0_butyrique_g_100_g = aG_4_0_butyrique_g_100_g;
	}
	public String getAG_6_0_caproïque_g_100_g() {
		return AG_6_0_caproïque_g_100_g;
	}
	public void setAG_6_0_caproïque_g_100_g(String aG_6_0_caproïque_g_100_g) {
		AG_6_0_caproïque_g_100_g = aG_6_0_caproïque_g_100_g;
	}
	public String getAG_8_0_caprylique_g_100_g() {
		return AG_8_0_caprylique_g_100_g;
	}
	public void setAG_8_0_caprylique_g_100_g(String aG_8_0_caprylique_g_100_g) {
		AG_8_0_caprylique_g_100_g = aG_8_0_caprylique_g_100_g;
	}
	public String getAG_10_0_caprique_g_100_g() {
		return AG_10_0_caprique_g_100_g;
	}
	public void setAG_10_0_caprique_g_100_g(String aG_10_0_caprique_g_100_g) {
		AG_10_0_caprique_g_100_g = aG_10_0_caprique_g_100_g;
	}
	public String getAG_12_0_laurique_g_100_g() {
		return AG_12_0_laurique_g_100_g;
	}
	public void setAG_12_0_laurique_g_100_g(String aG_12_0_laurique_g_100_g) {
		AG_12_0_laurique_g_100_g = aG_12_0_laurique_g_100_g;
	}
	public String getAG_14_0_myristique_g_100_g() {
		return AG_14_0_myristique_g_100_g;
	}
	public void setAG_14_0_myristique_g_100_g(String aG_14_0_myristique_g_100_g) {
		AG_14_0_myristique_g_100_g = aG_14_0_myristique_g_100_g;
	}
	public String getAG_16_0_palmitique_g_100_g() {
		return AG_16_0_palmitique_g_100_g;
	}
	public void setAG_16_0_palmitique_g_100_g(String aG_16_0_palmitique_g_100_g) {
		AG_16_0_palmitique_g_100_g = aG_16_0_palmitique_g_100_g;
	}
	public String getAG_18_0_stearique_g_100_g() {
		return AG_18_0_stearique_g_100_g;
	}
	public void setAG_18_0_stearique_g_100_g(String aG_18_0_stearique_g_100_g) {
		AG_18_0_stearique_g_100_g = aG_18_0_stearique_g_100_g;
	}
	public String getAG_18_1_9c_n_9_oleique_g_100_g() {
		return AG_18_1_9c_n_9_oleique_g_100_g;
	}
	public void setAG_18_1_9c_n_9_oleique_g_100_g(String aG_18_1_9c_n_9_oleique_g_100_g) {
		AG_18_1_9c_n_9_oleique_g_100_g = aG_18_1_9c_n_9_oleique_g_100_g;
	}
	public String getAG_18_2_9c12c_n_6_linoleique_g_100_g() {
		return AG_18_2_9c12c_n_6_linoleique_g_100_g;
	}
	public void setAG_18_2_9c12c_n_6_linoleique_g_100_g(String aG_18_2_9c12c_n_6_linoleique_g_100_g) {
		AG_18_2_9c12c_n_6_linoleique_g_100_g = aG_18_2_9c12c_n_6_linoleique_g_100_g;
	}
	public String getAG_18_3_c9c12c15_n_3_alpha_linolenique_g_100_g() {
		return AG_18_3_c9c12c15_n_3_alpha_linolenique_g_100_g;
	}
	public void setAG_18_3_c9c12c15_n_3_alpha_linolenique_g_100_g(String aG_18_3_c9c12c15_n_3_alpha_linolenique_g_100_g) {
		AG_18_3_c9c12c15_n_3_alpha_linolenique_g_100_g = aG_18_3_c9c12c15_n_3_alpha_linolenique_g_100_g;
	}
	public String getAG_20_4_5c8c11c14c_n_6_arachidonique_g_100_g() {
		return AG_20_4_5c8c11c14c_n_6_arachidonique_g_100_g;
	}
	public void setAG_20_4_5c8c11c14c_n_6_arachidonique_g_100_g(String aG_20_4_5c8c11c14c_n_6_arachidonique_g_100_g) {
		AG_20_4_5c8c11c14c_n_6_arachidonique_g_100_g = aG_20_4_5c8c11c14c_n_6_arachidonique_g_100_g;
	}
	public String getAG_20_5_5c8c11c14c17c_n_3_EPA_g_100_g() {
		return AG_20_5_5c8c11c14c17c_n_3_EPA_g_100_g;
	}
	public void setAG_20_5_5c8c11c14c17c_n_3_EPA_g_100_g(String aG_20_5_5c8c11c14c17c_n_3_EPA_g_100_g) {
		AG_20_5_5c8c11c14c17c_n_3_EPA_g_100_g = aG_20_5_5c8c11c14c17c_n_3_EPA_g_100_g;
	}
	public String getAG_22_6_4c7c10c13c16c19c_n_3_DHA_g_100_g() {
		return AG_22_6_4c7c10c13c16c19c_n_3_DHA_g_100_g;
	}
	public void setAG_22_6_4c7c10c13c16c19c_n_3_DHA_g_100_g(String aG_22_6_4c7c10c13c16c19c_n_3_DHA_g_100_g) {
		AG_22_6_4c7c10c13c16c19c_n_3_DHA_g_100_g = aG_22_6_4c7c10c13c16c19c_n_3_DHA_g_100_g;
	}
	public String getCholesterol_mg_100_g() {
		return Cholesterol_mg_100_g;
	}
	public void setCholesterol_mg_100_g(String cholesterol_mg_100_g) {
		Cholesterol_mg_100_g = cholesterol_mg_100_g;
	}
	public String getSel_chlorure_de_sodium_g_100_g() {
		return Sel_chlorure_de_sodium_g_100_g;
	}
	public void setSel_chlorure_de_sodium_g_100_g(String sel_chlorure_de_sodium_g_100_g) {
		Sel_chlorure_de_sodium_g_100_g = sel_chlorure_de_sodium_g_100_g;
	}
	public String getCalcium_mg_100_g() {
		return Calcium_mg_100_g;
	}
	public void setCalcium_mg_100_g(String calcium_mg_100_g) {
		Calcium_mg_100_g = calcium_mg_100_g;
	}
	public String getChlorure_mg_100_g() {
		return Chlorure_mg_100_g;
	}
	public void setChlorure_mg_100_g(String chlorure_mg_100_g) {
		Chlorure_mg_100_g = chlorure_mg_100_g;
	}
	public String getCuivre_mg_100_g() {
		return Cuivre_mg_100_g;
	}
	public void setCuivre_mg_100_g(String cuivre_mg_100_g) {
		Cuivre_mg_100_g = cuivre_mg_100_g;
	}
	public String getFer_mg_100_g() {
		return Fer_mg_100_g;
	}
	public void setFer_mg_100_g(String fer_mg_100_g) {
		Fer_mg_100_g = fer_mg_100_g;
	}
	public String getIode_microg_100_g() {
		return Iode_microg_100_g;
	}
	public void setIode_microg_100_g(String iode_microg_100_g) {
		Iode_microg_100_g = iode_microg_100_g;
	}
	public String getMagnesium_mg_100_g() {
		return Magnesium_mg_100_g;
	}
	public void setMagnesium_mg_100_g(String magnesium_mg_100_g) {
		Magnesium_mg_100_g = magnesium_mg_100_g;
	}
	public String getManganese_mg_100_g() {
		return Manganese_mg_100_g;
	}
	public void setManganese_mg_100_g(String manganese_mg_100_g) {
		Manganese_mg_100_g = manganese_mg_100_g;
	}
	public String getPhosphore_mg_100_g() {
		return Phosphore_mg_100_g;
	}
	public void setPhosphore_mg_100_g(String phosphore_mg_100_g) {
		Phosphore_mg_100_g = phosphore_mg_100_g;
	}
	public String getPotassium_mg_100_g() {
		return Potassium_mg_100_g;
	}
	public void setPotassium_mg_100_g(String potassium_mg_100_g) {
		Potassium_mg_100_g = potassium_mg_100_g;
	}
	public String getSelenium_microg_100_g() {
		return Selenium_microg_100_g;
	}
	public void setSelenium_microg_100_g(String selenium_microg_100_g) {
		Selenium_microg_100_g = selenium_microg_100_g;
	}
	public String getSodium_mg_100_g() {
		return Sodium_mg_100_g;
	}
	public void setSodium_mg_100_g(String sodium_mg_100_g) {
		Sodium_mg_100_g = sodium_mg_100_g;
	}
	public String getZinc_mg_100_g() {
		return Zinc_mg_100_g;
	}
	public void setZinc_mg_100_g(String zinc_mg_100_g) {
		Zinc_mg_100_g = zinc_mg_100_g;
	}
	public String getRetinol_microg_100_g() {
		return Retinol_microg_100_g;
	}
	public void setRetinol_microg_100_g(String retinol_microg_100_g) {
		Retinol_microg_100_g = retinol_microg_100_g;
	}
	public String getBeta_Carotene_microg_100_g() {
		return Beta_Carotene_microg_100_g;
	}
	public void setBeta_Carotene_microg_100_g(String beta_Carotene_microg_100_g) {
		Beta_Carotene_microg_100_g = beta_Carotene_microg_100_g;
	}
	public String getVitamine_D_microg_100_g() {
		return Vitamine_D_microg_100_g;
	}
	public void setVitamine_D_microg_100_g(String vitamine_D_microg_100_g) {
		Vitamine_D_microg_100_g = vitamine_D_microg_100_g;
	}
	public String getVitamine_E_mg_100_g() {
		return Vitamine_E_mg_100_g;
	}
	public void setVitamine_E_mg_100_g(String vitamine_E_mg_100_g) {
		Vitamine_E_mg_100_g = vitamine_E_mg_100_g;
	}
	public String getVitamine_K1_microg_100_g() {
		return Vitamine_K1_microg_100_g;
	}
	public void setVitamine_K1_microg_100_g(String vitamine_K1_microg_100_g) {
		Vitamine_K1_microg_100_g = vitamine_K1_microg_100_g;
	}
	public String getVitamine_K2_microg_100_g() {
		return Vitamine_K2_microg_100_g;
	}
	public void setVitamine_K2_microg_100_g(String vitamine_K2_microg_100_g) {
		Vitamine_K2_microg_100_g = vitamine_K2_microg_100_g;
	}
	public String getVitamine_C_mg_100_g() {
		return Vitamine_C_mg_100_g;
	}
	public void setVitamine_C_mg_100_g(String vitamine_C_mg_100_g) {
		Vitamine_C_mg_100_g = vitamine_C_mg_100_g;
	}
	public String getVitamine_B1_ou_Thiamine_mg_100_g() {
		return Vitamine_B1_ou_Thiamine_mg_100_g;
	}
	public void setVitamine_B1_ou_Thiamine_mg_100_g(String vitamine_B1_ou_Thiamine_mg_100_g) {
		Vitamine_B1_ou_Thiamine_mg_100_g = vitamine_B1_ou_Thiamine_mg_100_g;
	}
	public String getVitamine_B2_ou_Riboflavine_mg_100_g() {
		return Vitamine_B2_ou_Riboflavine_mg_100_g;
	}
	public void setVitamine_B2_ou_Riboflavine_mg_100_g(String vitamine_B2_ou_Riboflavine_mg_100_g) {
		Vitamine_B2_ou_Riboflavine_mg_100_g = vitamine_B2_ou_Riboflavine_mg_100_g;
	}
	public String getVitamine_B3_ou_PP_ou_Niacine_mg_100_g() {
		return Vitamine_B3_ou_PP_ou_Niacine_mg_100_g;
	}
	public void setVitamine_B3_ou_PP_ou_Niacine_mg_100_g(String vitamine_B3_ou_PP_ou_Niacine_mg_100_g) {
		Vitamine_B3_ou_PP_ou_Niacine_mg_100_g = vitamine_B3_ou_PP_ou_Niacine_mg_100_g;
	}
	public String getVitamine_B5_ou_Acide_pantothenique_mg_100_g() {
		return Vitamine_B5_ou_Acide_pantothenique_mg_100_g;
	}
	public void setVitamine_B5_ou_Acide_pantothenique_mg_100_g(String vitamine_B5_ou_Acide_pantothenique_mg_100_g) {
		Vitamine_B5_ou_Acide_pantothenique_mg_100_g = vitamine_B5_ou_Acide_pantothenique_mg_100_g;
	}
	public String getVitamine_B6_mg_100_g() {
		return Vitamine_B6_mg_100_g;
	}
	public void setVitamine_B6_mg_100_g(String vitamine_B6_mg_100_g) {
		Vitamine_B6_mg_100_g = vitamine_B6_mg_100_g;
	}
	public String getVitamine_B9_ou_Folates_totaux_microg_100_g() {
		return Vitamine_B9_ou_Folates_totaux_microg_100_g;
	}
	public void setVitamine_B9_ou_Folates_totaux_microg_100_g(String vitamine_B9_ou_Folates_totaux_microg_100_g) {
		Vitamine_B9_ou_Folates_totaux_microg_100_g = vitamine_B9_ou_Folates_totaux_microg_100_g;
	} 
	
	

}
