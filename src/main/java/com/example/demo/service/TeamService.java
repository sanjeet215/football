package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.Team;

@Service
public interface TeamService {

	public List<Team> findAllTeams();
}
