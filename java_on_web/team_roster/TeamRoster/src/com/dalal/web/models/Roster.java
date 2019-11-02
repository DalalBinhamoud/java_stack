package com.dalal.web.models;

import java.util.ArrayList;

public class Roster {
	ArrayList<Team> teams;
	
	
	public Roster() {
		this.teams  = new ArrayList<Team>();
		
	}
	public void setTeam(Team t) {
		this.teams.add(t);
	}

	public ArrayList<Team> getTeams() {
		return this.teams;
	}
}
