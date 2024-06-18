import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pr9_ex2_1 extends JFrame {
    private JProgressBar progressBar;
    private JButton startButton;

    public Pr9_ex2_1() {
        setTitle("Progress Bar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
        setLayout(new FlowLayout());
        progressBar = new JProgressBar(0, 200);
        progressBar.setStringPainted(true);
		progressBar.setVisible(false);

        startButton = new JButton("Start");
        add(progressBar);
        add(startButton);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startButton.setEnabled(false); // Disable the button during progress
                progressBar.setValue(0); // Reset progress bar
				progressBar.setVisible(true);
				}
        });
    }

    public void iterate() {
        int i = 0;
        while (i <= 200) {
            progressBar.setValue(i);
            i += 10;
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		progressBar.setValue(0);
		progressBar.setVisible(false);
		startButton.setEnabled(true);
    }

    public static void main(String[] args) {
      Pr9_ex2_1 p=new Pr9_ex2_1();
	  p.iterate();
    }
}
