import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Pr10_p2 extends Applet implements KeyListener
{   Font f;
	String str="";
	public void init()
	{
		 f=new Font("courier",Font.BOLD,30);
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent k)
	{
		int key=k.getKeyCode();
		
		
		switch(key)
		{
			case KeyEvent.VK_F1: 
				str=str+" F1";
				break;
				
			case KeyEvent.VK_F2: 
				str=str+" F2";
				break;
			
			case KeyEvent.VK_F3: 
				str=str+" F3";
				break;

			case KeyEvent.VK_F4: 
				str=str+" F4";
				break;
				
			case KeyEvent.VK_F5: 
				str=str+" F5";
				break;
				
			case KeyEvent.VK_F6: 
				str=str+" F6";
				break;
				
			case KeyEvent.VK_F7: 
				str=str+" F7";
				break;
				
			case KeyEvent.VK_F8: 
				str=str+" F8";
				break;
				
			case KeyEvent.VK_F9: 
				str=str+" F9";
				break;
				
			case KeyEvent.VK_F10: 
				str=str+" F10";
				break;
				
			case KeyEvent.VK_F11: 
				str=str+" F11";
				break;
				
			case KeyEvent.VK_F12: 
				str=str+" F12";
				break;
				
			case KeyEvent.VK_RIGHT: 
				str=str+" RIGHT";
				break;
				
			case KeyEvent.VK_LEFT: 
				str=str+" LEFT";
				break;
				
			case KeyEvent.VK_UP: 
				str=str+" UP";
				break;
			
			case KeyEvent.VK_DOWN: 
				str=str+" DOWN";
				break;
		}
		repaint();
	}
	public void keyReleased(KeyEvent k)
	{
	}
	public void keyTyped(KeyEvent k)
	{
	}
	public void paint(Graphics g)
	{
		g.setFont(f);
		g.drawString("You Pressed Below Keys:",100,120);
		g.drawString(str,200,200);
	}
}
/*
<applet code="Pr10_p2.class" width="800" height="800">
</applet>
*/