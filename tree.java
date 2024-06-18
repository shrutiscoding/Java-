import javax.swing.*;
 import javax.swing.tree.DefaultMutableTreeNode; 
 public class tree extends JFrame
{
	tree() 	
    { 		
	  DefaultMutableTreeNode country =new DefaultMutableTreeNode("India"); 		
	  DefaultMutableTreeNode cities =new DefaultMutableTreeNode("Cities");
	  country.add(cities); 	
	  DefaultMutableTreeNode bombay =new DefaultMutableTreeNode("Bombay");
	  DefaultMutableTreeNode delhi =new DefaultMutableTreeNode("Delhi"); 		
	  DefaultMutableTreeNode kolkata =new DefaultMutableTreeNode("Kolkata"); 	
	  cities.add(bombay);
	  cities.add(delhi); 		
	  cities.add(kolkata); 		
	  DefaultMutableTreeNode tbombay =new DefaultMutableTreeNode("Transport in Bombay"); 		
	  DefaultMutableTreeNode tdelhi =new DefaultMutableTreeNode("Transport in Delhi");
	  DefaultMutableTreeNode tkolkata =new DefaultMutableTreeNode("Transport in Kolkata"); 		
	  bombay.add(tbombay);
	  delhi.add(tdelhi); 		
	  kolkata.add(tkolkata); 		
	  DefaultMutableTreeNode CSIA =new DefaultMutableTreeNode("Chhatrapati Shivaji International Airport"); 		
	  DefaultMutableTreeNode CSTRS =new DefaultMutableTreeNode("Chhatrapati Shivaji Terminus Railway Station"); 		
	  DefaultMutableTreeNode MCBS =new DefaultMutableTreeNode("Mumbai Central Bus Station"); 		
	  tbombay.add(CSIA); tbombay.add(CSTRS); tbombay.add(MCBS); 
	  DefaultMutableTreeNode IGIA =new DefaultMutableTreeNode("Indira Gandhi International Airport"); 		
	  DefaultMutableTreeNode HNRS =new DefaultMutableTreeNode("Hazrat Nizamuddin Railway Station"); 		
	  DefaultMutableTreeNode MPISBT =new DefaultMutableTreeNode("Maharana Pratap Inter State Bus Terminus"); 		
	  tdelhi.add(IGIA); tdelhi.add(HNRS); tdelhi.add(MPISBT); 
	  DefaultMutableTreeNode NSCBIA =new DefaultMutableTreeNode("Netaji Subhas Chandra Bose International Airport"); 		
	  DefaultMutableTreeNode HRS =new DefaultMutableTreeNode("Howrah Railway Station"); 		
	  DefaultMutableTreeNode EBT =new DefaultMutableTreeNode("Esplanade Bus Terminus"); 		
	  tkolkata.add(NSCBIA); tkolkata.add(HRS); tkolkata.add(EBT); 
	  JTree jt=new JTree(country); 		
	  add(jt); 	setSize(200,200); setVisible(true); 	
    }
 	public static void main(String[] args)
	{ 		
        new tree(); 
	} 
}