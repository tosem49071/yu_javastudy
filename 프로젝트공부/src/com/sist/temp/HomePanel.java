package com.sist.temp;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sist.manager.TravelVO;

public class HomePanel extends JPanel {
	PosterCard[] pcs=new PosterCard[20];
	JPanel pan=new JPanel();
	JButton b1,b2;
	JLabel pageLa;
	public HomePanel()
	{
		b1=new JButton("이전");
		b2=new JButton("다음");
		pageLa=new JLabel("0 page / 0 pages");
		setLayout(null);
		pan.setLayout(new GridLayout(4,5,5,5));
		pan.setBounds(10, 15, 730, 700);
		add(pan);
		JPanel p=new JPanel();
		p.add(b1);
		p.add(pageLa);
		p.add(b2);
		p.setBounds(10, 720, 730, 35);
		add(p);
	}
	public void cardPrint(List<TravelVO> list)
	{
		
		int i=0;
		for(TravelVO vo:list)
		{
			pcs[i]=new PosterCard(vo);
			pan.add(pcs[i]);
			i++;
		}
		
	}
	public void cardInit(List<TravelVO> list)
	{
		/*for(int i=0;i<list.size();i++)
		{
			pcs[i].poLa.setIcon(null);
			pcs[i].tLa.setText("");
		}*/
		pan.removeAll(); // 데이터 제거
		pan.validate();  // Panel 재배치
	}
	
	
}
