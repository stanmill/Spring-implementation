package com.collabera.project.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.collabera.project.dto.CarDto;
import com.collabera.project.mapper.CarMapper;
import com.collabera.project.model.CarModel;
import com.collabera.project.repository.CarRepository;

@Service
@Transactional
public class CarServices {
	
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
	
	public CarDto findByid(Long id) {
		Optional<CarModel> car = repo.findById(id);
		if(car.isPresent()) {
			return map.toDto(car.get());
		}
		return null;
	}
	

	
	
	

	
		
	

}
