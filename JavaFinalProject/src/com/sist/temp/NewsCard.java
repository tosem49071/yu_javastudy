package com.sist.temp;
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class NewsCard extends JPanel{
	JLabel titleLa;
	JTextArea contentTa;
	JLabel authorLa,dateLa;
	public NewsCard()
	{
		setLayout(null);
		titleLa=new JLabel("");
		contentTa=new JTextArea();
		contentTa.setEnabled(false);
		authorLa=new JLabel("");
		dateLa=new JLabel("");
		
		// 배치
		titleLa.setBounds(10, 10, 730, 35);
		contentTa.setBounds(10, 50, 730, 100);
		authorLa.setBounds(10, 155, 360, 35);
		dateLa.setBounds(380, 155, 360, 35);
		
		// 추가
		add(titleLa);
		add(contentTa);
		add(authorLa);add(dateLa);
	}
}
