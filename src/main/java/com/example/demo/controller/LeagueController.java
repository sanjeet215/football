package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.LeagueService;

@RestController
@RequestMapping("/api/league")
public class LeagueController {

	@Autowired
	LeagueService service;

	@GetMapping(value = "/all")
	public ResponseEntity<?> getCountryList() {
		return new ResponseEntity<>(service.findAllLeagues(), HttpStatus.OK);
	}
}
