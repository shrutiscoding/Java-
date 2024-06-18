import java.awt.*;
import java.awt.event.*;
class Pr11_ex3 extends Frame implements MouseMotionListener
{
	Pr11_ex3()
	{
		addMouseMotionListener(this);
		setSize(500,500);
		setLayout(null);
		setBackground(Color.blue);
		setVisible(true);
	}
	public void mouseDragged(MouseEvent e)
	{
		setBackground(Color.cyan);
	}
	public void mouseMoved(MouseEvent e)
	{
			setBackground(Color.pink);
	}
	public static void main(String args[])
	{
		new Pr11_ex3();
	}
}	