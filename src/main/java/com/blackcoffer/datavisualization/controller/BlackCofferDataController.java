package com.blackcoffer.datavisualization.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blackcoffer.datavisualization.dto.BlackCofferRecomDTO;
import com.blackcoffer.datavisualization.model.BlackCofferData;
import com.blackcoffer.datavisualization.service.BlackCofferDataService;

@RestController
@RequestMapping("/blackCoffer")
public class BlackCofferDataController {
	
	@Autowired
	private BlackCofferDataService blackCofferDataService;

	@GetMapping("/getdatarecom")
	public ResponseEntity<List<BlackCofferRecomDTO>> getRecommendedData(){
		
		List<?> bcrDto =  this.blackCofferDataService.getBlackCofferData();
		
		  List<Object[]> genericList = (List<Object[]>) bcrDto;
		  List<BlackCofferRecomDTO> dtoList = mapToDTOList(genericList);
		
		return ResponseEntity.ok(dtoList);
	}
	
	public static List<BlackCofferRecomDTO> mapToDTOList(List<Object[]> genericList) {
		

        return genericList.stream()
                .map((data)-> BlackCofferRecomDTO.builder().id((Integer) data[0])
                		.endYear((Integer) data[1])
                		.intensity((String) data[2])
                		.topics((String) data[3])
                		.sector((String) data[4])
                		.region((String) data[5])
                		.pestle((String) data[6])
                		.source((String) data[7])
                		.swot((String) data[8])
                		.country((String) data[9])
                		.city((String) data[10])
                		.likelihood((Integer) data[11]).relevance((Integer) data[12]).startYear((String) data[13]).build())
                .collect(Collectors.toList());
    }
}
