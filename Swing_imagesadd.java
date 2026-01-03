import javax.swing.*;
import java.awt.*;

public class Swing_imagesadd extends JFrame {

    public Swing_imagesadd() {
        JFrame jFrame = new JFrame();

        JLabel jLabel = new JLabel("Chalo Aagra TajMehal ko dhekhane");
        jFrame.setBounds(70,20,30,40);
        jFrame.add(jLabel);

       ImageIcon imageIcon = new ImageIcon("D:\\racing code\\htdocs\\Janvi(Project)\\img\\aurangabad.jpg");
       JLabel jLabel1 = new JLabel(imageIcon);
       JScrollPane jScrollPane = new JScrollPane(jLabel1);
       jFrame.add(jScrollPane);
       jFrame.setVisible(true);


        jFrame.setSize(400, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
       Swing_imagesadd obj = new Swing_imagesadd();

    }
}
