import java.awt.*;
import javax.swing.*;

public class Pr4_ex2 extends JFrame {
    Pr4_ex2() {
        GridBagLayout grid = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();
        this.setLayout(grid);
        setTitle("GridBag Layout Example");

        JLabel L1 = new JLabel("Name");
        JLabel L2 = new JLabel("Comments");
        JTextField T1 = new JTextField(8);
        JTextArea T2 = new JTextArea(8,12);
        JScrollPane SP = new JScrollPane(T2);
        SP.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		
		gbc.weighty=1;
		
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(L1, gbc);
		
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(T1, gbc);
        
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(L2, gbc);
	
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2; 
        gbc.gridheight = 1; 
        this.add(SP, gbc); 

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridwidth = 1;
        gbc.gridx = 1;
        gbc.gridy = 2;
        this.add(new Button("Submit"), gbc);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Pr4_ex2();
    }
}
