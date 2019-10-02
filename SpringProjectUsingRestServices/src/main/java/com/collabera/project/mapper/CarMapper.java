package com.collabera.project.mapper;

import org.springframework.stereotype.Component;

import com.collabera.project.dto.CarDto;
import com.collabera.project.model.CarModel;

@Component
public class CarMapper {
	
	public CarModel toEntity(CarDto dto) {
		CarModel car = new CarModel();
		car.setCarBrand(dto.getCarBrand());
		car.setCarName(dto.getCarName());
		car.setCarType(dto.getCarType());
		car.setReleaseDate(dto.getReleaseDate());
		return car;	
	}
	
	public CarDto toDto(CarModel entity) {
		CarDto car = new CarDto();
		car.setCarBrand(entity.getCarBrand());
		car.setCarName(entity.getCarName());
		car.setCarType(entity.getCarType());
		car.setId(entity.getId());
		car.setReleaseDate(entity.getReleaseDate());
		return car;	
	}
}
