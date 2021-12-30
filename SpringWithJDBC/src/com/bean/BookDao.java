package com.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class BookDao {
	private JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}
	public int insertBook(Book b) {
		return jt.update("insert into BookInfo values(?,?,?,?)",null,b.getBookName(),b.getAuthorName(),b.getPrice());
	}
	public int UpdateBook(String bn,float p) {
		return jt.update("update BookInfo set price=? where bookName=?",p,bn);
	}
	public int deleteBook(String bn) {
		return jt.update("delete from BookInfo where bookName=?",bn);
	}
	public List<Book> fetchBookUsingRSE(){
		return jt.query("select *from BookInfo", new ResultSetExtractor<List<Book>>() {

			@Override
			public List<Book> extractData(ResultSet rs) throws SQLException, DataAccessException {
				List<Book> l=new ArrayList<Book>();
				while(rs.next()) {
					Book b=new Book();
					b.setBid(rs.getInt(1));
					b.setBookName(rs.getString(2));
					b.setAuthorName(rs.getString(3));
					b.setPrice(rs.getFloat(4));
					l.add(b);
				}
				return l;
			}
			
		});
	}
	public List<Book> fetchBookUsingRM(){
		return jt.query("select *from BookInfo", new RowMapper<Book>() {

			@Override
			public Book mapRow(ResultSet rs, int arg1) throws SQLException {
				Book b=new Book();
				b.setBid(rs.getInt(1));
				b.setBookName(rs.getString(2));
				b.setAuthorName(rs.getString(3));
				b.setPrice(rs.getFloat(4));
				
				return b;
			}
			
		});
	}
}
