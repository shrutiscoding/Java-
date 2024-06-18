import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pr9_ex2 extends JFrame {
    private JProgressBar progressBar;
    private JButton startButton;

    public Pr9_ex2() {
        setTitle("Progress Bar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 100);
        setVisible(true);
        setLayout(new FlowLayout());
        progressBar = new JProgressBar(0, 200);
        progressBar.setStringPainted(true);

        startButton = new JButton("Start");
        add(progressBar);
        add(startButton);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startButton.setEnabled(false); // Disable the button during progress
                progressBar.setValue(0); // Reset progress bar

                // Create a separate thread to run the iterate method
                Thread workerThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        iterate();
                        startButton.setEnabled(true); // Re-enable the button when done
                    }
                });

                workerThread.start();
            }
        });
    }

    // The iterate method to update the progress bar iteratively
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
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Pr9_ex2();
            }
        });
    }
}
