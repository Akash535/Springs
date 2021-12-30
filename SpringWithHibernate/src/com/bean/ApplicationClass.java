package com.bean;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationClass {
	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String pn,cn;
			List<Player> l;
			int ch,i,jno,sr;
			
			ApplicationContext a=new ClassPathXmlApplicationContext("player.xml");
			PlayerDao pd=(PlayerDao)a.getBean("pdao");
			do {
				System.out.println("1:insert\n2:update\n3:delete\n4:fetchPlayer\n5:exit");
				System.out.println("Enter choice :");
				ch=Integer.parseInt(br.readLine());
				switch(ch) {
				case 1:
					System.out.println("Enter jno, Name, CountryName & StrickRate:");
					Player p=new Player();
					p.setJno(Integer.parseInt(br.readLine()));
					p.setPlayerName(br.readLine());
					p.setCountryName(br.readLine());
					p.setStrickRate(Integer.parseInt(br.readLine()));
					
					i=pd.insertPlayer(p);
					if(i>0)
						System.out.println("Inserted !!!\n");
					else
						System.out.println("Try Again !!!\n");
					break;
				case 2:
					System.out.println("Enter name and updated Strick Rate:");
					pn=br.readLine();
					sr=Integer.parseInt(br.readLine());
					i=pd.updatePlayer(pn, sr);
					if(i>0)
						System.out.println("Updated !!!\n");
					else
						System.out.println("Try Again !!!\n");
					break;
				case 3:
					System.out.println("Enter name of the player");
					pn=br.readLine();
					i=pd.deletePlayer(pn);
					if(i>0)
						System.out.println("Deleted !!!\n");
					else
						System.out.println("Try Again !!!\n");
					break;
				case 4:
					l=pd.fetchPlayer();
					for(Player obj:l) {
						System.out.println(obj);
					}
					break;
				case 5:
					System.out.println("Thanks for using application!!!\n");
					System.exit(0);
				default:
					System.out.println("Please Enter valid choice !!!\n");
				}
			}while(true);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
