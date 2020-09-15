package com.example.demo.model;

public class League {

	private int league_id;
	private String league_name;

	public League() {
		super();
	}

	public League(int league_id, String league_name) {
		super();
		this.league_id = league_id;
		this.league_name = league_name;
	}

	public int getLeague_id() {
		return league_id;
	}

	public void setLeague_id(int league_id) {
		this.league_id = league_id;
	}

	public String getLeague_name() {
		return league_name;
	}

	public void setLeague_name(String league_name) {
		this.league_name = league_name;
	}

}
