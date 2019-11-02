package com.dalal.web.models;
import java.util.ArrayList;
public class Team {
	
	String team_name;
	ArrayList<Player> players;
	
	
	public Team(String name) {
		this.team_name = name;

		this.players  = new ArrayList<Player>();
		
	}
	public void setTName(String team_name) {
		this.team_name = team_name;
	}
	
	public void setPlayer(String fname,String lName,int age) {
		
		Player p = new Player(fname,lName,age);
		this.players.add(p);
	}
	
	public String getTName() {
		return this.team_name;
	}
	
	public ArrayList<Player> getPlayers() {
		return this.players;
	}

}
