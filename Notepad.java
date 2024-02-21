import java.awt.*;
public class Notepad extends Frame 
{

Notepad()
{
    MenuBar mb=new MenuBar();
	
	Menu f=new Menu("File");
	mb.add(f);
	MenuItem n=new MenuItem("New");
	MenuItem nw=new MenuItem("New Window");
	MenuItem o=new MenuItem("Open...");
	MenuItem s=new MenuItem("Save");
	MenuItem sa=new MenuItem("Save As...");
	MenuItem ps=new MenuItem("Page Setup...");
	MenuItem p=new MenuItem("Print...");
	MenuItem e=new MenuItem("Exit");
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
	
	Menu ed=new Menu("Edit");
	mb.add(ed);
	MenuItem u=new MenuItem("Undo");
	MenuItem cu=new MenuItem("Cut");
	MenuItem cp=new MenuItem("Copy");
	MenuItem pa=new MenuItem("Paste");
	MenuItem d=new MenuItem("Delete");
	MenuItem swb=new MenuItem("Search with Bing...");
	MenuItem fi=new MenuItem("Find...");
	MenuItem fn=new MenuItem("Find Next");
	MenuItem fp=new MenuItem("Find Previous");
	MenuItem r=new MenuItem("Replace...");
	MenuItem gt=new MenuItem("Go To...");
	MenuItem sal=new MenuItem("Select All");
	MenuItem td=new MenuItem("Time/Date");
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
	
	Menu fo=new Menu("Format");
	CheckboxMenuItem w=new CheckboxMenuItem("Word Wrap");
	MenuItem font=new MenuItem("Font");
	fo.add(w);
	fo.add(font);
	
	Menu v=new Menu("View");
	Menu z=new Menu("Zoom");
	MenuItem zi=new MenuItem("Zoom In");
	MenuItem zo=new MenuItem("Zoom out");
	MenuItem sb=new MenuItem("Status Bar");
	MenuItem rdz=new MenuItem("Restore Default Zoom");
	v.add(z);
	z.add(zi);
	z.add(zo);
	v.add(sb);
	z.add(rdz);
	
	Menu h=new Menu("Help");
	MenuItem vh=new MenuItem("View Help");
	MenuItem sf=new MenuItem("Send Feedback");
	MenuItem an=new MenuItem("About Notepad");
	h.add(vh);
	h.add(sf);
	h.addSeparator();
	h.add(an);
	
	mb.add(fo);
	mb.add(v);
	mb.add(h);
	setMenuBar(mb);
	setSize(400,400);
	setVisible(true);
	setLayout(new FlowLayout());
}
public static void main(String[] args)
{
new Notepad();
}
}
