package com.sist.Travel;

import java.io.Serializable;

public class TravelVO implements Serializable{
	private int no;
	private int cno;
	private String title;
	private String contents;
	private String poster;
	private String holy;
	private String tel;
	private int price;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getHoly() {
		return holy;
	}
	public void setHoly(String holy) {
		this.holy = holy;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public TravelVO() {
		this.no = no;
		this.cno = cno;
		this.title = title;
		this.contents = contents;
		this.poster = poster;
		this.holy = holy;
		this.tel = tel;
		this.price = price;
	}
	
	
	
}
