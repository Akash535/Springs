package com.bean;

public class Player {

	private int jno;
	private String playerName,countryName;
	private int strickRate;
	public int getJno() {
		return jno;
	}
	public void setJno(int jno) {
		this.jno = jno;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public int getStrickRate() {
		return strickRate;
	}
	public void setStrickRate(int strickRate) {
		this.strickRate = strickRate;
	}
	@Override
	public String toString() {
		return "Player [jno=" + jno + ", playerName=" + playerName + ", countryName=" + countryName + ", strickRate="
				+ strickRate + "]";
	}
	
}
