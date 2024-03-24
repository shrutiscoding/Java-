import java.awt.*;

class Pr1_ex3
{
   public static void main(String args[])
   {
     Frame f = new Frame ("My first frame");
     Button b1=new Button("OK");
     Button b2=new Button("RESET");
     Button b3=new Button("CANCEL");
     Font f1=new Font("Times New Roman",Font.ITALIC|Font.BOLD,15);
     f.setFont(f1);
     f.setForeground(Color.magenta);
     b1.setBounds(50,100,100,50);
     b2.setBounds(200,100,100,50);
     b3.setBounds(350,100,100,50);
     f.setBackground(Color.pink);
     b1.setBackground(Color.orange);
     b2.setBackground(Color.white);
     b3.setBackground(Color.green);
     f.add(b1);
     f.add(b2);
     f.add(b3);
     f.setLayout(null);
     f.setSize(500,200);
     f.setVisible(true);
   }
}