import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEditorApp extends JFrame {

    private JTextField textField;
    private JButton sizeButton, styleButton, fontButton;

    public TextEditorApp() {
        // Set up the main frame
        setTitle("Text Editor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Initialize components
        textField = new JTextField("Sample Text", 20);
        sizeButton = new JButton("Change Size");
        styleButton = new JButton("Change Style");
        fontButton = new JButton("Change Font");

        // Add components to the frame
        add(textField);
        add(sizeButton);
        add(styleButton);
        add(fontButton);

        // Attach listeners to buttons
        sizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeSize();
            }
        });

        styleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeStyle();
            }
        });

        fontButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeFont();
            }
        });

        // Set the initial state of the frame
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void changeSize() {
        String currentText = textField.getText();
        Font currentFont = textField.getFont();
        int newSize = currentFont.getSize() + 2; // Increase font size by 2
        Font newFont = new Font(currentFont.getName(), currentFont.getStyle(), newSize);
        textField.setFont(newFont);
        textField.setText(currentText);
    }

    private void changeStyle() {
        Font currentFont = textField.getFont();
        int newStyle = (currentFont.getStyle() == Font.BOLD) ? Font.ITALIC : Font.BOLD;
        Font newFont = new Font(currentFont.getName(), newStyle, currentFont.getSize());
        textField.setFont(newFont);
    }

    private void changeFont() {
        Font currentFont = textField.getFont();
        FontChooser fontChooser = new FontChooser(this, currentFont);
        Font newFont = fontChooser.getSelectedFont();
        if (newFont != null) {
            textField.setFont(newFont);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TextEditorApp();
            }
        });
    }
}

class FontChooser extends JDialog {

    private JList<String> fontList;
    private JList<Integer> sizeList;
    private JCheckBox boldCheckBox, italicCheckBox;
    private JButton okButton, cancelButton;

    private Font selectedFont;

    public FontChooser(Frame parent, Font currentFont) {
        super(parent, "Choose Font", true);
        setLayout(new BorderLayout());

        // Initialize components
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = ge.getAvailableFontFamilyNames();
        fontList = new JList<>(fontNames);
        fontList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        fontList.setSelectedValue(currentFont.getName(), true);

        Integer[] sizeValues = { 8, 10, 12, 14, 16, 18, 20, 22, 24 };
        sizeList = new JList<>(sizeValues);
        sizeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        sizeList.setSelectedValue(currentFont.getSize(), true);

        boldCheckBox = new JCheckBox("Bold", currentFont.isBold());
        italicCheckBox = new JCheckBox("Italic", currentFont.isItalic());

        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");

        // Add components to the dialog
        JPanel fontPanel = new JPanel();
        fontPanel.setLayout(new GridLayout(3, 1));
        fontPanel.add(fontList);
        fontPanel.add(sizeList);
        fontPanel.add(boldCheckBox);
        fontPanel.add(italicCheckBox);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);

        add(fontPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // Attach listeners to buttons
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int size = sizeList.getSelectedValue();
                int style = Font.PLAIN;
                if (boldCheckBox.isSelected()) {
                    style += Font.BOLD;
                }
                if (italicCheckBox.isSelected()) {
                    style += Font.ITALIC;
                }
                selectedFont = new Font(fontList.getSelectedValue(), style, size);
                dispose();
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selectedFont = null;
                dispose();
            }
        });

        // Set the initial state of the dialog
        pack();
        setLocationRelativeTo(parent);
        setVisible(true);
    }

    public Font getSelectedFont() {
        return selectedFont;
    }
}
