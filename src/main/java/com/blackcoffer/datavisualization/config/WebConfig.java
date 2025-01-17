package com.blackcoffer.datavisualization.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer{

	@Value("${BlackCoffer.allowedApi}")
	public String allowedApi;
	
	@Override
	public void addCorsMappings(CorsRegistry cors) {
		//set up cors mapping
		
		cors.addMapping("/**").allowedMethods("GET","POST","PUT","DELETE")
		.allowedOrigins(allowedApi).allowedHeaders("*");
	}
}
