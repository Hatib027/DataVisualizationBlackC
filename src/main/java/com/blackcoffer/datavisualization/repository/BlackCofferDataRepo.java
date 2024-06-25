package com.blackcoffer.datavisualization.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.blackcoffer.datavisualization.model.BlackCofferData;

public interface BlackCofferDataRepo extends JpaRepository<BlackCofferData, Integer>{
	
	@Query("SELECT bcu.id,bcu.endYear,bcu.intensity, bcu.topics,bcu.sector,bcu.region,bcu.pestle,bcu.source,bcu.swot,bcu.country,bcu.city,bcu.likelihood,bcu.relevance,bcu.startYear FROM BlackCofferData bcu")
	List<?> findBlackCofferData();

}
