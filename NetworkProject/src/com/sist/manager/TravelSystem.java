package com.sist.manager;
import java.io.*;
import java.util.*;
public class TravelSystem {
	//데이터 읽기
	private static List<TravelVO> list=
			        new ArrayList<TravelVO>();
	static
	{
		// 초기화 브럭
		FileInputStream fis=null;
		ObjectInputStream ois=null;
		try
		{
			fis=new FileInputStream("c:\\java_datas\\travel.txt");
			ois=new ObjectInputStream(fis); // 객체단위로 값 읽어오기
			list=(List<TravelVO>)ois.readObject();
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try
			{
				fis.close();
				ois.close();
			}catch(Exception e) {}
		}
	}
	public void TCastegoryData(int cno)//
	{
		for(TravelVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				System.out.println(vo.getNo()+"."+vo.getTitle());
			}
		}
	}
	public static void main(String[] args) {
		TravelSystem ts=new TravelSystem();
		try
		{
			BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("(1page), (2page), (3page), (4page), (5page)");
			//페이지당 60개(명소:8개~호텔 8개 게스트하우스 12개)씩  5페이지 
			String cno=in.readLine();
			ts.TCastegoryData(Integer.parseInt(cno));
		}catch(Exception ex) {}
	}
}