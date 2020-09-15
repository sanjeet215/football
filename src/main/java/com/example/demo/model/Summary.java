package com.example.demo.model;

public class Summary {

	private int league_id;
	private String overall_league_position;

	public Summary() {
		super();
	}

	public Summary(int league_id, String overall_league_position) {
		super();
		this.league_id = league_id;
		this.overall_league_position = overall_league_position;
	}

	public int getLeague_id() {
		return league_id;
	}

	public void setLeague_id(int league_id) {
		this.league_id = league_id;
	}

	public String getOverall_league_position() {
		return overall_league_position;
	}

	public void setOverall_league_position(String overall_league_position) {
		this.overall_league_position = overall_league_position;
	}

}
