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
	public List<TravelVO> travellisListData(int page)
	{
		List<TravelVO> gList=
				new ArrayList<TravelVO>();
		int j=0; // 20개씩 나눠주는 변수
		int rowSize=20;
		int start=(page-1)*rowSize;
		/*
		 *    1page => 0~19
		 *    2page => 20~39
		 */
		for(int i=0;i<list.size();i++)
		{
			if(j<rowSize && i>=start)
			{
				gList.add(list.get(i));
				j++;
			}
		}
		return gList;
	}
	public int travelTotalPage()
	{
		return (int)(Math.ceil(list.size()/20.0));
	}
	public List<TravelVO> TCastegoryData(int cno)//
	{
		List<TravelVO> mList=
				new ArrayList<>();
		for(TravelVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				System.out.println(vo.getNo()+""+vo.getTitle());
				mList.add(vo);
			}
		}
		return mList;
	}
	public List<TravelVO> travelFindData(String title)
	{
		List<TravelVO> mList=
				new ArrayList<>();
		for(TravelVO vo:list)
		{
			if(vo.getTitle().contains(title))
			{
				mList.add(vo);
			}
		}
		return mList;
	}
	/*public void TCastegoryData(int cno)//
	{
		for(TravelVO vo:list)
		{
			if(vo.getCno()==cno)
			{
				System.out.println(vo.getNo()+"."+vo.getTitle());
			}
		}
	}*/
	public TravelVO travelDetailData(String title)
	{
		TravelVO vo=new TravelVO();
		for(TravelVO tvo:list)
		{
			if(tvo.getTitle().equals(title))
			{
				vo=tvo;
				break;
			}
		}
		return vo;
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