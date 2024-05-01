package com.example.ratingmicroservice.service;

import java.util.List;

import com.example.ratingmicroservice.model.Rating ;

public interface RatingService {
	public Rating createRating(Rating rating);
	public List<Rating> getAllRating();
	public List<Rating> getRatingByVendorId(String vendorId);
}
