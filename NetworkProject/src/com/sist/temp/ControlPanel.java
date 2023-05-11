package com.sist.temp;
import java.awt.CardLayout;
import java.awt.Color;

import javax.swing.*;
public class ControlPanel extends JPanel{
	FindPanel fp=new FindPanel();
	NewsPanel np=new NewsPanel();
	ChatPanel cp=new ChatPanel();
	
	HomePanel hp;
	DetailPanel dp;
	BoardListPanel bp;
	BoardInsertPanel ip;
	BoardDetailPanel bdp;
	BoardUpdatePanel bup;
	BoardDeletePanel bdelp;
	CardLayout card=new CardLayout();
	public ControlPanel()
	{
		hp=new HomePanel(this);
		dp=new DetailPanel(this);
		bp=new BoardListPanel(this);
		ip=new BoardInsertPanel(this);
		bdp=new BoardDetailPanel(this);
		bup=new BoardUpdatePanel(this);
		bdelp=new BoardDeletePanel(this);
		setLayout(card);
		add("home",hp);
		add("find",fp);
		add("news",np);
		add("chat",cp);
		add("detail",dp);
		add("board",bp);
		add("insert",ip);
		add("bdp",bdp);
		add("bup",bup);
		add("delete",bdelp);
	}


}