package com.collabera.project.controller;

import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping("/api/cars") // gets all of the items in the database
	public List<CarDto> getAll(){
		return service.findAll();
	}
	
	@GetMapping("/api/cars/{id}") // finds an element in the database by the id
	public ResponseEntity<CarDto> findById(@PathVariable BigInteger id) {
		CarDto dto = service.findById(id);
		return ResponseEntity.ok(dto);	
	}
	
	@PostMapping("/api/cars") // adds a new item into the database
	public ResponseEntity<CarDto> post(@RequestBody @Valid CarDto car) throws URISyntaxException {
		CarDto result = service.save(car);
		return ResponseEntity.created(new URI("/api/cars/" + result.getId())).body(result);
	}
	
	@PutMapping("/api/cars") // updates a current element in the database
	public ResponseEntity<CarDto> update(@RequestBody @Valid CarDto car) {
		CarDto result = service.update(car);
		return ResponseEntity.ok().body(result);
	}
	
	@DeleteMapping("/api/cars/{id}") // deletes an element by the specified id
	public ResponseEntity<CarDto> deleteById(@PathVariable BigInteger id){
		service.deleteById(id);
		return ResponseEntity.ok().build();
	}

}
