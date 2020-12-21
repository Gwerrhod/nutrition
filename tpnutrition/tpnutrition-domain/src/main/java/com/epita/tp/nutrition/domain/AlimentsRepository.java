package com.epita.tp.nutrition.domain;

import java.util.ArrayList;

public interface AlimentsRepository {
	
	public String findInfos (String nomAliment);
	
	public void chargementBase (ArrayList <Aliments> aliments);
	


}
