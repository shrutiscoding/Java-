import java.awt.*;
 
class Pr1_ex2_2
{
    public static void main( String args[] )
    {
        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(400,400); 
        f.setLayout(null);
        Font f1=new Font("Arial Narrow",Font.BOLD,15);
   
        Label l1 = new Label("Select Languages:");
        l1.setBounds(100,100,150,50);
        l1.setFont(f1);
        List c1 = new List(3,true);
        c1.setBounds(100,150,100,50);
        c1.add("Marathi");
        c1.add("Hindi");
        c1.add("English");
        c1.add("Sanskrit");
        c1.add("Urdu");
        c1.add("Telugu");
        c1.add("Kannada");
        c1.add("Malyalam");
        f.add(l1);
        f.add(c1);
      }
}