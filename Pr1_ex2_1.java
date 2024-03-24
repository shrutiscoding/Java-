import java.awt.*;
 
class Pr1_ex2_1
{
    public static void main( String args[] )
    {
        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(500,500); 
        f.setLayout(null);
        Font f1=new Font("Arial Narrow",Font.BOLD,15);
   
        Label l1 = new Label("Select Languages:");
        l1.setBounds(100,100,150,50);
        l1.setFont(f1);
        Checkbox cb1 = new Checkbox("Marathi");
        cb1.setBounds(100,150,100,30);
        Checkbox cb2 = new Checkbox("Hindi");
        cb2.setBounds(100,200,100,30);
        Checkbox cb3 = new Checkbox("English");
        cb3.setBounds(100,250,100,30);
        Checkbox cb4 = new Checkbox("Sanskrit");
        cb4.setBounds(100,300,100,30);
        Checkbox cb5 = new Checkbox("Urdu");
        cb5.setBounds(100,350,100,30);
        Checkbox cb6 = new Checkbox("Telugu");
        cb6.setBounds(100,400,100,30);
        Checkbox cb7 = new Checkbox("Kannada");
        cb7.setBounds(100,450,100,30);
        Checkbox cb8 = new Checkbox("Malyalam");
        cb8.setBounds(100,500,100,30);
        f.add(l1);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(cb5);
        f.add(cb6);
        f.add(cb7);
        f.add(cb8);
		
      }
}