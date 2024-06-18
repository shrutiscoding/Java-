import java.awt.*;
import java.awt.event.*;

public class SpecialKeysDemo extends Frame implements KeyListener {

    TextArea ta;

    public SpecialKeysDemo() {
        ta = new TextArea();
        ta.setEditable(false);
        ta.addKeyListener(this);

        add(ta);

        setSize(400, 300);
        setTitle("Special Keys Demo");
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();

        switch (keyCode) {
            case KeyEvent.VK_UP:
                ta.append("Up Arrow Key Pressed\n");
                break;
            case KeyEvent.VK_DOWN:
                ta.append("Down Arrow Key Pressed\n");
                break;
            case KeyEvent.VK_LEFT:
                ta.append("Left Arrow Key Pressed\n");
                break;
            case KeyEvent.VK_RIGHT:
                ta.append("Right Arrow Key Pressed\n");
                break;
            case KeyEvent.VK_F1:
                ta.append("F1 Key Pressed\n");
                break;
            case KeyEvent.VK_F2:
                ta.append("F2 Key Pressed\n");
                break;
			 case KeyEvent.VK_F3:
                ta.append("F2 Key Pressed\n");
                break;
				 case KeyEvent.VK_F4:
                ta.append("F4 Key Pressed\n");
                break;
				 case KeyEvent.VK_F5:
                ta.append("F5 Key Pressed\n");
                break;
				 case KeyEvent.VK_F6:
                ta.append("F6 Key Pressed\n");
                break;
				 case KeyEvent.VK_F7:
                ta.append("F7 Key Pressed\n");
                break;
				 case KeyEvent.VK_F8:
                ta.append("F8 Key Pressed\n");
                break;
				 case KeyEvent.VK_F9:
                ta.append("F9 Key Pressed\n");
                break;
				 case KeyEvent.VK_F10:
                ta.append("F10 Key Pressed\n");
                break;
				 case KeyEvent.VK_F11:
                ta.append("F11 Key Pressed\n");
                break;
				 case KeyEvent.VK_F12:
                ta.append("F12 Key Pressed\n");
                break;
           
            default:
                ta.append("Key Pressed: " + KeyEvent.getKeyText(keyCode));
        }
    }

    public void keyReleased(KeyEvent e) {}

    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new SpecialKeysDemo();
    }
}
