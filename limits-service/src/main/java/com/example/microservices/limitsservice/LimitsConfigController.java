package com.example.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigController {

	@Autowired
	private Configurations config;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfiguration() {	
		return new LimitConfiguration(config.getMaximum(), config.getMinimum());		
	}
}
