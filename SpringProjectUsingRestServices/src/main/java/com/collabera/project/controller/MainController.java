package com.collabera.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.collabera.project.model.CarModel;

@Controller
public class MainController {
	
	@RequestMapping(value="/login")
	private String indexPage(CarModel car) {
		
	}

}
