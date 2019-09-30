package com.collabera.project.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.project.dto.CarDto;
import com.collabera.project.services.CarServices;

@RestController
public class CarController {
	
	@Autowired
	private final CarServices service;
	
	public CarController(CarServices service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/api/cars")
	public List<CarDto> getAll(){
		return service.findAll();
	}
	
	@GetMapping("api/cars/{id}")
	public ResponseEntity<CarDto> findByid(@PathVariable BigInteger id) {
		CarDto dto = service.findByid(id);
		return ResponseEntity.ok(dto);
		
	}

}
