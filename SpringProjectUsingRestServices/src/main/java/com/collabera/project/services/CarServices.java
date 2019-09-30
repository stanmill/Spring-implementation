package com.collabera.project.services;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.collabera.project.dto.CarDto;
import com.collabera.project.mapper.CarMapper;
import com.collabera.project.model.CarModel;
import com.collabera.project.repository.CarRepository;

@Service
public class CarServices {
	
	@Autowired
	private final CarRepository repo;
	private final CarMapper map;
	
	public CarServices(CarRepository repo, CarMapper map) {
		super();
		this.repo = repo;
		this.map = map;
	}
	

	public List<CarDto> findAll(){
		return repo.findAll().stream().map(m -> map.toDto(m)).collect(Collectors.toList());
	}
	
	public CarDto findById(BigInteger id) {
		Optional<CarModel> car = repo.findById(id);
		if(car.isPresent()) {
			return map.toDto(car.get());
		}
		return null;
	}
	
	public void deleteById(BigInteger id) {
		repo.deleteById(id);
	}
		
}
