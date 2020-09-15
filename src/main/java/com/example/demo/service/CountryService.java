package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Country;

@Service
public interface CountryService {

	public List<Country> findAllContries();
}
