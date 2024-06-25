package com.blackcoffer.datavisualization.service;



import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blackcoffer.datavisualization.model.BlackCofferData;
import com.blackcoffer.datavisualization.repository.BlackCofferDataRepo;

@Service
public class BlackCofferDataService {

	
	@Autowired
	BlackCofferDataRepo blackCofferDataRepo;
	
	public List<?> getBlackCofferData(){
		return blackCofferDataRepo.findBlackCofferData();
		
	}
}
