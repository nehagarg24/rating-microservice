package com.example.ratingmicroservice.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ratingmicroservice.model.Rating;
import com.example.ratingmicroservice.service.RatingService;

@RestController
@RequestMapping("/ratings")
public class RatingController {

	@Autowired
	private RatingService ratingService;

	// create rating
	@PostMapping
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.createRating(rating));
	}

	// get all notification
	@GetMapping
	public ResponseEntity<List<Rating>> getAllRating() {
		return ResponseEntity.ok(ratingService.getAllRating());
	}

	// get by vendor id
	@GetMapping("cloudvendor/{vendorId}")
	public ResponseEntity<List<Rating>> getRatingByVendorId(@PathVariable String vendorId) {
		return ResponseEntity.ok(ratingService.getRatingByVendorId(vendorId));
	}
}
