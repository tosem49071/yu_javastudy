package com.sist.client;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class NetworkMain extends JFrame implements ActionListener{
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JButton b1,b2,b3,b4,b5,b6,b7;
	public NetworkMain()
	{
		mp=new MenuPanel();
		cp=new ControlPanel();
		tp=new TopPanel();
		
		setLayout(null); // Layout없이 직접 배치
		
		mp.setBounds(10, 15, 1170, 50); //x,y 메뉴 크기
		cp.setBounds(10, 80, 960, 730); // mp 2,4째크기 더한값보다 크게 cp.setBounds 두번째 값
		tp.setBounds(980, 80, 200, 730);
		
		b1=new JButton("홈");
		b2=new JButton("관광");
		b3=new JButton("엔터");
		b4=new JButton("숙박");
		b5=new JButton("검색");
		b6=new JButton("뉴스");
		b7=new JButton("채팅");
		mp.setLayout(new GridLayout(1,7,5,5));
		mp.add(b1);
		mp.add(b2);
		mp.add(b3);
		mp.add(b4);
		mp.add(b5);
		mp.add(b6);
		mp.add(b7);
		// 추가
		add(mp);
		add(cp);
		add(tp);
		
		
		// 윈도우 크기
		setSize(1200,800);
		setVisible(true);
		// 종료
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("여행");
		// 이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{     
			//UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McwinLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			
		}catch(Exception ex) {}
		new NetworkMain();
	}
	// 버튼 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			cp.card.show(cp, "home");
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp, "location");
		}
		else if(e.getSource()==b3)
		{
			cp.card.show(cp, "enter");
		}
		else if(e.getSource()==b4)
		{
			cp.card.show(cp, "accomm");
		}
		else if(e.getSource()==b5)
		{
			cp.card.show(cp, "find");
		}
		else if(e.getSource()==b6)
		{
			cp.card.show(cp, "news");
		}
		else if(e.getSource()==b7)
		{
			cp.card.show(cp, "chat");
		}
		
	}
	

}
