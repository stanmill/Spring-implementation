package com.collabera.project.repository;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.collabera.project.model.CarModel;

@Repository
public interface CarRepository extends MongoRepository<CarModel, BigInteger>{

}
