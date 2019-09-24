package com.collabera.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collabera.project.model.CarModel;

@Repository
public interface CarRepository extends JpaRepository<CarModel, Long>{

}
