package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Summary;

@Service
public interface SummaryService {

	public List<Summary> findPositions();
}
