package com.collabera.project.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;


public class CarModel {
	
	@Id
	private Long id;
	private String carBrand;
	private String carName;
	private LocalDate releaseDate;
	private String carType;
	
	public CarModel() {
		
	}
	
	public CarModel(Long id, String carBrand, String carName, LocalDate releaseDate, String carType) {
		super();
		this.id = id;
		this.carBrand = carBrand;
		this.carName = carName;
		this.releaseDate = releaseDate;
		this.carType = carType;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}
	

}
