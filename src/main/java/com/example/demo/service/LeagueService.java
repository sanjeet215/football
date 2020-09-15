package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.League;


@Service
public interface LeagueService {

	public List<League> findAllLeagues();
}
