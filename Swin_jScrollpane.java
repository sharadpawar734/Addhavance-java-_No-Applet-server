import javax.swing.*;
import java.awt.*;

public class Swin_jScrollpane extends JFrame {

    public Swin_jScrollpane(){
        JFrame jFrame = new JFrame();

        JTextArea jTextArea = new JTextArea(10,15);
        JScrollPane sp = new JScrollPane(jTextArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        jFrame.add(sp);

        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new FlowLayout());  // fllow layout manje aapan kiti word tyakle te windows paramane adjiust hoil  pn tit aapan null leyout dil ki te aaplya la set karav lagel ,ya flow layout madhi set karav lagat nahi
    }

    public static void main(String[] args) {
        Swin_jScrollpane obj = new Swin_jScrollpane();
    }
}
