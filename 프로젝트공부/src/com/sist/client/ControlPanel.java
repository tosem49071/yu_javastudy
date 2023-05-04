package com.sist.client;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;
public class ControlPanel extends JPanel{
	HomePanel hp=new HomePanel();
	LocationPanel lp=new LocationPanel();
	EnterPanel ep=new EnterPanel();
	AccommPanel ap=new AccommPanel();
	FindPanel fp=new FindPanel();
	NewsPanel np=new NewsPanel();
	ChatPanel cp=new ChatPanel();
	
	CardLayout card=new CardLayout();
	public ControlPanel()
	{
		setLayout(card);
		add("home",hp);
		add("location",lp);
		add("enter",ep);
		add("accomm",ap);
		add("find",fp);
		add("news",np);
		add("chat",cp);
	}


}
