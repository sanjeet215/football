package com.example.demo.model;

public class Team {
	private int team_key;
	private String team_name;

	public Team() {
		super();
	}

	public Team(int team_key, String team_name) {
		super();
		this.team_key = team_key;
		this.team_name = team_name;
	}

	public int getTeam_key() {
		return team_key;
	}

	public void setTeam_key(int team_key) {
		this.team_key = team_key;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

}
