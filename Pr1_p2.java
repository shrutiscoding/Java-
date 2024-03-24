import java.awt.*;
 
public class Pr1_p2
{
    public static void main( String args[] )
    {
        Frame f = new Frame();
        f.setVisible(true);
        f.setSize(500,500); 
        f.setLayout(null);
        Font f1=new Font("Arial Black",Font.BOLD,15);
   
        Label l1 = new Label("Select Colleges:");
        l1.setBounds(100,100,150,50);
        l1.setFont(f1);
        Checkbox cb1 = new Checkbox("GRWP,Tasgaon");
        cb1.setBounds(100,150,150,30);
        Checkbox cb2 = new Checkbox("GP,Kolhapur");
        cb2.setBounds(100,200,150,30);
        Checkbox cb3 = new Checkbox("GP,Karad");
        cb3.setBounds(100,250,150,30);
        Checkbox cb4 = new Checkbox("DYPatil,Kolhapur");
        cb4.setBounds(100,300,150,30);
         
        Label l2 = new Label("Select Gender:");
        l2.setBounds(300,100,150,50);
        l2.setFont(f1);
        CheckboxGroup cg = new CheckboxGroup();
        Checkbox c1 = new Checkbox("Male",cg,false);     
        c1.setBounds(300,150,70,30);   
        Checkbox c2 = new Checkbox("Female",cg,false);        
        c2.setBounds(300,200,70,30);
        f.add(l1);
        f.add(cb1);
        f.add(cb2);
        f.add(cb3);
        f.add(cb4);
        f.add(l2); 
        f.add(c1); 
        f.add(c2);
    }
 
}