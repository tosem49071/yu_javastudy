import javax.swing.*;
import java.awt.*;
public class GameView extends JPane1{
	Image back,air;
	int x=600,y=100;
	public GameView()
	{
		back=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\back.jpg");
		air=Toolkit.getDefaultToolkit().getImage("C:\\javaDev\\air.gif");
	}
	public void paint(Graphics g)
	{
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
		g.drawImage(air,x,y,150,120,this);
	}
}