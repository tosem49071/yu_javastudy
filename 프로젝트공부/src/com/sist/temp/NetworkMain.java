package com.sist.temp;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.*;

import com.sist.common.Function;
import com.sist.common.ImageChange;
import com.sist.manager.*;
public class NetworkMain extends JFrame implements ActionListener{
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JButton b1,b2,b3,b4,b5,b6,b7;
	JLabel logo;	
	Login login=new Login(); 
	// 페이지 지정
		int curpage=1;
		int totalpage=0;
		TravelSystem ts=new TravelSystem();
		// 네트워크 관련 클래스
		// 서버연결 => 연결기기
		Socket s; // 서버의 메모리 연결
		// 서버에서 보내준 값을 받는다
		BufferedReader in;
		// 서버로 값을 전송
		OutputStream out;
	public NetworkMain()
	
	{
		logo=new JLabel();
		Image img=ImageChange.getImage(
				new ImageIcon("c:\\javaDev\\log.png"),200,130);
		
		logo.setIcon(new ImageIcon(img));
		mp=new MenuPanel();
		cp=new ControlPanel();
		tp=new TopPanel();
		
		setLayout(null); // Layout없이 직접 배치
		logo.setBounds(10, 15, 200, 80);
		mp.setBounds(230, 25, 950, 60); 
		cp.setBounds(10, 100, 960, 650); 
		tp.setBounds(980, 100, 200, 650);
		
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
		add(logo);
		
		// 윈도우 크기
		setSize(1200,800);
		//setVisible(true);
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
		// 로그인
		login.b1.addActionListener(this); 
		login.b2.addActionListener(this); 
		// 채팅
		cp.cp.tf.addActionListener(this);
		// HomePage
		List<TravelVO> list=ts.travelListData(curpage);
		cp.hp.cardInit(list);
		cp.hp.cardPrint(list);
		totalpage=ts.travelTotalPage();
		// 여러번 => 동작을 여러번 수행
		cp.hp.b1.addActionListener(this); // 이전
		cp.hp.b2.addActionListener(this); // 다음
		cp.hp.pageLa.setText(curpage+"page /"
							+ totalpage+" pages");
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
			//BernsteinLookAndFeel
			//UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
			//UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
			UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
			
		}catch(Exception ex) {ex.printStackTrace();}
		new NetworkMain();
	}
	// 버튼 처리
	public void travelDisplay()
	{
		
		List<TravelVO> list=ts.travelListData(curpage);
		cp.hp.cardInit(list);
		cp.hp.cardPrint(list);
		totalpage=ts.travelTotalPage();
		cp.hp.pageLa.setText(curpage+"page /"
							+ totalpage+" pages");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1)
		{
			curpage=1;
			travelDisplay();
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
		else if(e.getSource()==login.b1)
		{
			// 로그인 데이터 읽기
			String id=login.tf1.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "ID를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			String name=login.tf2.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "이름를 입력하세요");
				login.tf2.requestFocus();
				return;
			}
			String sex="남자";
			if(login.rb1.isSelected()) // 남자 라디오버튼이 선택
			{
				sex="남자";
			}
			else 
			{
				sex="여자";
			}
						
			// 서버로 전송
			try
			{
				// 서버 연결
				s=new Socket("localhost",3456);
				// 서버 컴퓨터 => IP
				// 211.238.142.()
				// 읽는 위치 / 쓰는 위치
				in=new BufferedReader(new InputStreamReader(s.getInputStream()));
				// s는 서버 메모리 => 서버메모리로부터 값을 읽어온다
				out=s.getOutputStream();
				// 서버에서 읽어 갈 수 있게 메모리에 저장
				
				// 서버로 로그인 요청
				out.write((Function.LOGIN+"|"
						+id+"|"+name+"|"+sex+"\n").getBytes());
			}catch(Exception ex) {}
			// 서버로부터 전송된 값을 받아 온다
			new Thread(this).start(); // run()호출
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0); // 프로그램 종료
		}
		else if(e.getSource()==cp.cp.tf)
		{
			cp.cp.initStyle();
			String msg=cp.cp.tf.getText();
			String color=cp.cp.box.getSelectedItem().toString();
			if(msg.length()<1) {
				return;
			}
		    cp.cp.append(msg, color);
		    
		    cp.cp.tf.setText("");
		}
		else if(e.getSource()==cp.hp.b1)
		{
			if(curpage>1)
			{
				curpage--;
				travelDisplay();
			}
		}
		else if(e.getSource()==cp.hp.b2)
		{
			if(curpage<totalpage)
			{
				curpage++;
				travelDisplay();
			}
		}
		
	}
	// 서버에서 결과값을 받아서 출력 => 쓰레드 (자동화)
	// member.jsp?id=aaa&pwd=1234&name=홍길동
	//   100
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				String msg=in.readLine();
				// 서버에서 보낸 값
				StringTokenizer st=
						new StringTokenizer(msg,"|");
				int protocol=Integer.parseInt(st.nextToken());
				// 100|id|name|sex
				switch(protocol)
				{
					//서버에서 로그인이 들어온 경우
				// LOGIN => 테이블에 정보를 출력한다
					case Function.LOGIN:
					{
						String[] data= {
								st.nextToken(), //ID
								st.nextToken(), //Name
								st.nextToken()  //sex
						};
						cp.cp.model.addRow(data);
					}
					// C/S => 모든 명령이 서버로부터 받아서 처리
					// MYLOG => 로그인 종료하고 메인창을 보여준다
					break;
					case Function.MYLOG:
					{
						setTitle(st.nextToken());
						login.setVisible(false);
						setVisible(true);
					}
					break;
					case Function.CHAT:
					{
						cp.cp.initStyle();
						cp.cp.append(st.nextToken(), st.nextToken());
						//           채팅문자열          색상
					}
					break;
				}
			} 
		}catch(Exception ex) {}
	}
	
	

}
