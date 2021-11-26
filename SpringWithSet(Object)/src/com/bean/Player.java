package com.bean;

public class Player {

	private int jno;
	private String pName;
	public int getJno() {
		return jno;
	}
	public void setJno(int jno) {
		this.jno = jno;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	@Override
	public String toString() {
		return "Player [jno=" + jno + ", pName=" + pName + "]";
	}
	
}
