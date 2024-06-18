import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

class Pr8_p1 extends JFrame
{
  Pr8_p1()
  {
    String Columns[] = {"RollNo", "Name", "Marks of AJP"};
    String Data[][] = {
      {"21440", "Shruti", "17"},
      {"21445", "Samiksha", "19"},
      {"21330", "Madhura", "16"},
      {"21367", "Akanksha", "17"},
      {"21477", "Seema", "12"}
    };

    JTable table = new JTable(Data, Columns);
    JScrollPane scrollPane = new JScrollPane(table);
    add(scrollPane);

    setVisible(true);
    setSize(500, 500);
    setLayout(new FlowLayout());
  }

  public static void main(String args[])
  {
    new Pr8_p1();
  }
}
