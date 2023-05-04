package com.sist.manager;

import java.io.Serializable;

public class TravelVO implements Serializable {
	 private int no;
	 private String title;
	 private String contents;
	 private String poster;
	 private int cno;

	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	public int getCno() {
		return cno;
	}
	public void setCno(int cno) {
		this.cno = cno;
	}
	public TravelVO(int no, String title, String contents, String poster, int cno) {
		this.no = no;
		this.title = title;
		this.contents = contents;
		this.poster = poster;
		this.cno = cno;
	}

	public TravelVO(){
	}

}