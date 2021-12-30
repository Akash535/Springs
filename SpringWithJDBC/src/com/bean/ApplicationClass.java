package com.bean;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationClass {

	

	private static List<Book> l;

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String bn,an;
			float p;
			int ch,i;
			Book b;
			ApplicationContext a=new ClassPathXmlApplicationContext("jdbc.xml");
			BookDao bd=(BookDao)a.getBean("bdao");
			do {
				System.out.println("1:insert\n2:update\n3:delete\n4:fetchBookUsingRSE\n5:fetchBookUsingRM\n6:exit");
				System.out.println("Enter choice :");
				ch=Integer.parseInt(br.readLine());
				switch(ch) {
				case 1:
					System.out.println("Enter bookName, AuthorName & Price:");
					b=new Book();
					b.setBookName(br.readLine());
					b.setAuthorName(br.readLine());
					b.setPrice(Float.parseFloat(br.readLine()));
					i=bd.insertBook(b);
					if(i>0)
						System.out.println("Data Inserted !!!!\n");
					else
						System.out.println("Try Again !!!");
					break;
				case 2:
					System.out.println("Enter bookName & updated Price:");
					bn=br.readLine();
					p=Float.parseFloat(br.readLine());
					i=bd.UpdateBook(bn, p);
					if(i>0)
						System.out.println("Data Updated !!!!\n");
					else
						System.out.println("Try Again !!!");
					break;
				case 3:
					System.out.println("Enter BookName:");
					bn=br.readLine();
					i=bd.deleteBook(bn);
					if(i>0)
						System.out.println("Data Deleted !!!!\n");
					else
						System.out.println("Try Again !!!");
					break;
				case 4:
					l=bd.fetchBookUsingRSE();
					for(Book b1:l)
						System.out.println(b1);
					break;
				case 5:
					l=bd.fetchBookUsingRM();
					for(Book b1:l)
						System.out.println(b1);
					break;
				case 6:
					System.out.println("Thanks for using application !!!");
					System.exit(0);
				}
			}while(true);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
