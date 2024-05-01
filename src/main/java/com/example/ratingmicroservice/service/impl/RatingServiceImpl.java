package com.example.ratingmicroservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ratingmicroservice.model.Rating;
import com.example.ratingmicroservice.service.RatingService;
import com.example.ratingmicroservice.repository.RatingRepository;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingRepository ratingRepository;

	@Override
	public Rating createRating(Rating rating) {
		return ratingRepository.save(rating);
	}

	@Override
	public List<Rating> getAllRating() {
		return ratingRepository.findAll();
	}

	@Override
	public List<Rating> getRatingByVendorId(String vendorId) {
		return ratingRepository.findRatingByVendorId(vendorId);
	}
}
