package com.collabera.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.collabera.project.model.CarModel;

@Repository
public interface CarRepository extends MongoRepository<CarModel, Long>{

}
