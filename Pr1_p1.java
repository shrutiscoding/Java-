import java.awt.*;
 
public class Pr1_p1
{
 public static void main(String args[])
 {
  Frame f = new Frame();
  f.setSize(400,400);
  f.setVisible(true);
  f.setLayout(null);

  Label l1 = new Label();
  l1.setText("Enter Your Name "); 
  l1.setBounds(100,50,100,20); 

  TextField tf = new TextField("Shruti");
  tf.setBounds(200,50,100,20); 

  Label l2 = new Label("Address"); 
  l2.setBounds(100,100,50,20); 

  TextArea ta = new TextArea("",3,40);
  ta.setBounds(200,100,100,50); 

  Button b = new Button("Submit");
  b.setBounds(150,200,50,20); 

  f.add(l1);
  f.add(tf); 
  f.add(l2);
  f.add(ta); 
  f.add(b);
 }
}
