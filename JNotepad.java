import java.awt.*;
import javax.swing.*;
public class JNotepad extends JFrame 
{

JNotepad()
{
    JMenuBar mb=new JMenuBar();
	
	JMenu f=new JMenu("File");
	mb.add(f);
	JMenuItem n=new JMenuItem("New");
	JMenuItem nw=new JMenuItem("New Window");
	JMenuItem o=new JMenuItem("Open...");
	JMenuItem s=new JMenuItem("Save");
	JMenuItem sa=new JMenuItem("Save As...");
	JMenuItem ps=new JMenuItem("Page Setup...");
	JMenuItem p=new JMenuItem("Print...");
	JMenuItem e=new JMenuItem("Exit");
	f.add(n);
	f.add(nw);
	f.add(o);
	f.add(s);
	f.add(sa);
	f.addSeparator();
	f.add(ps);
	f.add(p);
	f.addSeparator();
	f.add(e);
	
	JMenu ed=new JMenu("Edit");
	mb.add(ed);
	JMenuItem u=new JMenuItem("Undo");
	JMenuItem cu=new JMenuItem("Cut");
	JMenuItem cp=new JMenuItem("Copy");
	JMenuItem pa=new JMenuItem("Paste");
	JMenuItem d=new JMenuItem("Delete");
	JMenuItem swb=new JMenuItem("Search with Bing...");
	JMenuItem fi=new JMenuItem("Find...");
	JMenuItem fn=new JMenuItem("Find Next");
	JMenuItem fp=new JMenuItem("Find Previous");
	JMenuItem r=new JMenuItem("Replace...");
	JMenuItem gt=new JMenuItem("Go To...");
	JMenuItem sal=new JMenuItem("Select All");
	JMenuItem td=new JMenuItem("Time/Date");
	ed.add(u);
	ed.addSeparator();
	ed.add(cu);
	ed.add(cp);
	ed.add(pa);
	ed.add(d);
    ed.addSeparator();
	ed.add(swb);
	ed.add(fi);
	ed.add(fn);
	ed.add(fp);
	ed.add(r);
	ed.add(gt);
	ed.addSeparator();
	ed.add(sal);
	ed.add(td);
	
	JMenu fo=new JMenu("Format");
	JCheckBoxMenuItem w=new JCheckBoxMenuItem("Word Wrap");
	JMenuItem font=new JMenuItem("Font");
	fo.add(w);
	fo.add(font);
	
	JMenu v=new JMenu("View");
	JMenu z=new JMenu("Zoom");
	JMenuItem zi=new JMenuItem("Zoom In");
	JMenuItem zo=new JMenuItem("Zoom out");
	JMenuItem sb=new JMenuItem("Status Bar");
	JMenuItem rdz=new JMenuItem("Restore Default Zoom");
	v.add(z);
	z.add(zi);
	z.add(zo);
	v.add(sb);
	z.add(rdz);
	
	JMenu h=new JMenu("Help");
	JMenuItem vh=new JMenuItem("View Help");
	JMenuItem sf=new JMenuItem("Send Feedback");
	JMenuItem an=new JMenuItem("About Notepad");
	h.add(vh);
	h.add(sf);
	h.addSeparator();
	h.add(an);
	
	mb.add(fo);
	mb.add(v);
	mb.add(h);
	setJMenuBar(mb);
	setSize(400,400);
	setVisible(true);
	setLayout(new FlowLayout());
}
public static void main(String[] args)
{
new JNotepad();
}
}
