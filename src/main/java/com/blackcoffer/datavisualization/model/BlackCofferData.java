package com.blackcoffer.datavisualization.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Data
@Table(name="comp_data")
@AllArgsConstructor
public class BlackCofferData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="end_year")
	private int endYear;
	
	@Column(name="citylng")
	private String cityLang;
	
	@Column(name="citylat")
	private String cityLat;
	
	@Column(name="intensity")
	private String intensity;
	
	@Column(name="sector")
	private String sector;
	
	@Column(name="topics")
	private String topics;
	
	@Column(name="insight")
	private String insight;
	
	@Column(name="swot")
	private String swot;
	
	@Column(name="url")
	private String url;
	
	@Column(name="region")
	private String region;
	
	@Column(name="start_year")
	private String startYear;
	
	@Column(name="impact")
	private String impact;
	
	@Column(name="added")
	private String added;
	
	@Column(name="published")
	private String published;
	
	@Column(name="city")
	private String city;
	
	@Column(name="country")
	private String country;
	
	@Column(name="relevance")
	private int relevance;
	
	@Column(name="pestle")
	private String pestle;
	
	@Column(name="source")
	private String source;
	
	@Column(name="title")
	private String title;
	
	@Column(name="likelihood")
	private int likelihood;
	
	public BlackCofferData() {
		
	}
}
