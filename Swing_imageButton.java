import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_imageButton extends JFrame {
    JFrame jFrame = new JFrame();
    JLabel jLabel;
    public Swing_imageButton() {
        JCheckBox checkBoxone, checkBoxTwo, checkBoxThree;


        this.jFrame.setTitle("this is iframe tutorial");
        this.jLabel = new JLabel("Food billing");
        this.jLabel.setBounds(50,50,300,20);



        JButton jButton = new JButton("Total",new ImageIcon("D:\\racing code\\htdocs\\Janvi(Project)\\img\\collage.jpg")); // path dilya natar parat jit tit slash ahe tit parat tychaya baju la yk slash wadvaychi \\\ hi wali
        jButton.setBounds(100,250,80,30);



        jFrame.add(this.jLabel);
        jFrame.add(jButton);


        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {
Swing_imageButton object = new Swing_imageButton();
    }
}

