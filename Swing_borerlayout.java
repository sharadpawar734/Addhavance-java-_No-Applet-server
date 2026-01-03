import javax.swing.*;
import java.awt.*;

public class Swing_borerlayout extends JFrame {

    public Swing_borerlayout(){
      JFrame jFrame = new JFrame();

      BorderLayout borderLayout = new BorderLayout(10,5);//aapan madhi gap dila ahe ya sentance ni verticallyano horrzontally
      jFrame.setLayout(borderLayout);


        JButton b1 = new JButton("NORTH");
        JButton b2 = new JButton("SOUTH");
        JButton b3 = new JButton("EAST");
        JButton b4 = new JButton("CENTER");
        JButton b5 = new JButton("WEST");

        jFrame.add(b1,BorderLayout.NORTH);
        jFrame.add(b2,BorderLayout.SOUTH);
        jFrame.add(b3,BorderLayout.EAST);
        jFrame.add(b4,BorderLayout.CENTER);
        jFrame.add(b5,BorderLayout.WEST);


        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
    Swing_borerlayout obng23 = new Swing_borerlayout();
    }
}
