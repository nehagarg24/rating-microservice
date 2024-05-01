package com.example.ratingmicroservice.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.ratingmicroservice.model.Rating;

public interface RatingRepository extends MongoRepository<Rating, String> {

	//custom finder methods
	List<Rating> findRatingByVendorId(String vendorId);
}
