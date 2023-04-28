package com.sist.main4;

public class Human {
	private static String name;
	static {
		name="홍길동";
	}
	public String getData()
	{
		return name;
	}
	public void setData(String name)
	{
		this.name=name;
	}
	
}
