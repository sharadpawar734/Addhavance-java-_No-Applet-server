import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_Menuebar extends JFrame implements ActionListener {
    public JFrame jFrame;
    JMenuBar jMenuBar;
    JMenu file,edit,format,submenu;
    JMenuItem cut,copy,past,save,exit,zoom,delete,check;
    JTextArea jTextArea;

    public Swing_Menuebar(){
         jFrame = new JFrame();

         jTextArea = new JTextArea();
         jTextArea.setBounds(5,5,360,320);

        jMenuBar = new JMenuBar();

        cut = new JMenuItem("Cut");
        copy = new JMenuItem("copy");
        past = new JMenuItem("pate");

        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        zoom = new JMenuItem("Zoom");

        delete = new JMenuItem("Delete");

        check = new JMenuItem("Check");

        cut.addActionListener(this );
        past.addActionListener(this);
        copy.addActionListener(this);


        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = JOptionPane.showConfirmDialog(jFrame,"You want to exit");
                if(a == JOptionPane.YES_OPTION);{
                    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                }
            }
        });


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

        jFrame.add(jTextArea);
        jFrame.add(jMenuBar);
        jFrame.setJMenuBar(jMenuBar);

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    if( e.getSource() == cut){
      jTextArea.cut();
    } if (e.getSource() == copy){
        jTextArea.copy();
        } if (e.getSource() == past){
        jTextArea.paste();
        }
    }

    public static void main(String[] args) {
     Swing_Menuebar object = new Swing_Menuebar();
    }


}
