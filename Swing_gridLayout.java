import javax.swing.*;
import java.awt.*;

public class Swing_gridLayout extends JFrame {

    public Swing_gridLayout(){
        JFrame jFrame = new JFrame();

        JButton b1 = new JButton("Button1");
        JButton b2 = new JButton("Button2");
        JButton b3 = new JButton("Button3");
        JButton b4 = new JButton("Button4");
        JButton b5 = new JButton("Button5");

        jFrame.add(b1);
        jFrame.add(b2);
        jFrame.add(b3);
        jFrame.add(b4);
        jFrame.add(b5);

        GridLayout gridLayout = new GridLayout(3,2);
        jFrame.setLayout(gridLayout);


        jFrame.setBounds(100,200,500,300);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
       Swing_gridLayout obje33 = new Swing_gridLayout();
    }
}
