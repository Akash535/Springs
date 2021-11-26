package com.bean;

import java.util.Set;

public class Cricket {
	private String countryName,coachName;
	private Set<Player> player;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCoachName() {
		return coachName;
	}
	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}
	public Set<Player> getPlayer() {
		return player;
	}
	public void setPlayer(Set<Player> player) {
		this.player = player;
	}
	 public void display() {
		 System.out.println(getCountryName()+"\n"+getCoachName());
		 Set<Player> s=getPlayer();
		 for(Player p:s) {
			 System.out.println(p);
		 }
	 }
}
