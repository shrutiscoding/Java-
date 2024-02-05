import java.awt.*;
class MyTextArea extends Frame
{
  MyTextArea()
  {
    TextArea ta1,ta2,ta3,ta4,ta5;
 
    ta1=new TextArea();
    ta2=new TextArea(4,10);
    ta3=new TextArea("Hello Guys");
    ta4=new TextArea("My name is Shruti",5,10);
    ta5=new TextArea("I am in Information Technology Department",6,10,TextArea.SCROLLBARS_VERTICAL_ONLY);

    ta1.setBounds(100,100,50,60);
    ta2.setBounds(100,200,70,60);
    ta3.setBounds(100,300,90,60);
    ta4.setBounds(100,400,200,60);
    ta5.setBounds(100,500,200,60);

    setSize(400,400);
    setVisible(true);
    setLayout(null);
    add(ta1);
    add(ta2);
    add(ta3);
    add(ta4);
    add(ta5);
   }
   public static void main(String args[])
  {
    new MyTextArea();
  }
}