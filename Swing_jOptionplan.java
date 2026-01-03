import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Swing_jOptionplan extends JFrame {
    private static int Yes_OPTION;
    int a;
    public Swing_jOptionplan() {
        JFrame jFrame = new JFrame();

       jFrame.addWindowListener(new WindowAdapter() {
           @Override
           public void windowClosing(WindowEvent e) {
               int a;
               a = Swing_jOptionplan.showconfirmDialog(jFrame,"are you want");
              if(a == Swing_jOptionplan.Yes_OPTION) {
                 jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); ;
              }
           }
       });

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setVisible(true);
    }

    private static int showconfirmDialog(JFrame jFrame, String areYouWant) {
        return 0;
    }

    public static void main(String[] args) {
    Swing_jOptionplan object = new Swing_jOptionplan();
    }
}
