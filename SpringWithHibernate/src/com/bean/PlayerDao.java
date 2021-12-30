package com.bean;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;

public class PlayerDao {

	private HibernateTemplate ht;

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}
	public int insertPlayer(Player p) {
		int i=(int)ht.save(p);
		return i;
	}
	public int updatePlayer(String pn,int sr) {
		return ht.bulkUpdate("update Player set strickRate="+sr+"where playerName='"+pn+"'");
	}
	public int deletePlayer(String pn) {
		return ht.bulkUpdate("delete from Player where playerName='"+pn+"'");
	}
	public List<Player> fetchPlayer(){
		return ht.loadAll(Player.class);
	}
	
}
