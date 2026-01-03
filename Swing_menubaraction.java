import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Swing_menubaraction extends JFrame implements ActionListener {
    public JFrame jFrame;
    JMenuBar jMenuBar;
    JMenu file,edit,format,submenu;
    JMenuItem cut,copy,past,save,exit,zoom,delete,check;
    JTextArea ta;

        public Swing_menubaraction() {
            jFrame = new JFrame();
            Container container = getContentPane();
            container.setLayout(new BorderLayout());

            ta = new JTextArea();
            container.add(new JScrollPane(ta), BorderLayout.CENTER);
            ta.setBounds(5,5,360,320);

            jMenuBar = new JMenuBar();

            cut = new JMenuItem("File");
            copy = new JMenuItem("copy");
            past = new JMenuItem("pate");

            save = new JMenuItem("Save");
            exit = new JMenuItem("Exit");

            zoom = new JMenuItem("Zoom");

            delete = new JMenuItem("Delete");

            check = new JMenuItem("Check");


            file = new JMenu("File");
            file.add(save);
            file.add(exit);

            edit = new JMenu("Edit");
            edit.add(cut);
            edit.add(copy);
            edit.add(past);

            format = new JMenu("Format");
            format.add(zoom);

            submenu = new JMenu("Submenu");
            file.add(submenu);

            submenu.add(delete);
            submenu.add(check);



            jMenuBar.add(file);
            jMenuBar.add(edit);
            jMenuBar.add(format);

            jFrame.add(ta);
            jFrame.add(jMenuBar);
            jFrame.setJMenuBar(jMenuBar);


            cut.addActionListener(this);
            copy.addActionListener(this);
            past.addActionListener(this);
            save.addActionListener(this);
            exit.addActionListener(this);
            zoom.addActionListener(this);
            delete.addActionListener(this);
            check.addActionListener(this);



            jFrame.setLayout(null);
            jFrame.setSize(400, 400);
            jFrame.setVisible(true);
            jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Copy")) {
            ta.copy();
        } else if (e.getActionCommand().equals("Paste")) {
            ta.paste();
        } else if (e.getActionCommand().equals("Save")) {
            ta.setText("Save File...");
        } else if (e.getActionCommand().equals("Exit")) {
            System.exit(0); // You can customize the exit action as needed
        } else if (e.getActionCommand().equals("Zoom")) {
            ta.setText("Zoom File");
        } else if (e.getActionCommand().equals("Delete")) {
            ta.setText("Delete File...");
        } else if (e.getActionCommand().equals("Check")) {
            ta.setText("Check File");
        }
    }

        public static void main(String[] args) {
            Swing_menubaraction obj = new Swing_menubaraction();


        }


}
