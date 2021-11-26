package com.bean;

import java.util.Map;

public class IPLTeam {
	private Map<String,Player> p;

	public Map<String, Player> getP() {
		return p;
	}

	public void setP(Map<String, Player> p) {
		this.p = p;
	}
	public void display() {
		Map<String, Player> m=getP();
		for(Map.Entry<String ,Player> data:m.entrySet()) {
			System.out.println(data.getValue()+"\t"+data.getKey());
		}
	}
}
