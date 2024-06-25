package com.blackcoffer.datavisualization.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class BlackCofferRecomDTO {

	int id;
	int endYear;
	String intensity;
	String topics;
	String sector;
	String region;
	String pestle;
	String source;
	String swot;
	String country;
	String city;
	int likelihood;
	int relevance;
	String startYear;

	public BlackCofferRecomDTO() {
		
	}
	
	
}
