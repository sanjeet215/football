package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TeamService;

@RestController
@RequestMapping("/api/team")
public class TeamController {

	@Autowired
	TeamService service;

	@GetMapping(value = "/all")
	public ResponseEntity<?> getCountryList() {
		return new ResponseEntity<>(service.findAllTeams(), HttpStatus.OK);
	}
}
