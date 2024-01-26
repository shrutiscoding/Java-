import java.applet.*;
import java.awt.*;

/*<applet code = "AppletParam.class" width=500 height=500>
<param name="Name" value="Rani" />
<param name="Age" value="15" />
</applet>
*/
public class AppletParam extends Applet
{
	String n;
	String a;
	
	public void init()
	{
		n = getParameter("Name").toUpperCase();  //Sandhya
		a = getParameter("Age");   //15
	
	}
	
	public void paint(Graphics g)
	{
		g.drawString(n, 200, 200);
		g.drawString(a, 200, 250);
	}
		
}