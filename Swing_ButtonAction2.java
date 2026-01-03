import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_ButtonAction2 extends JFrame implements ActionListener {
    public JFrame jFrame; // locla varial aplaya asighned karav lagel jevha aapan constructor cha baher
    JLabel jLabel;    // aapan actionListner used karal action performed sati tar tevha ya global variable ch
    JButton jButton;  // used hoil
    public Swing_ButtonAction2() {
        jFrame = new JFrame();
        jFrame.setTitle("Swing Extends Frame program");

         jLabel = new JLabel("Sharad Rajaram Pawar");
        jLabel.setBounds(130,80,190,30);

        jButton = new JButton("Click me");
        jButton.setBounds(130,140,100,30);

        jFrame.add(jButton);
        jFrame.add(jLabel);

       jButton.addActionListener(this); // this type karun alt ani enter kara secound option choose kara

        jFrame.setLayout(null);                 // frame designed karta na pn jframe(local varible ) asighned
        jFrame.setSize(400,400);   // karav lagel
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // last code ni aaplaya la jFrame cha side la
        // cross or cancale button var click karun exit hoil windows
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jLabel.setText("Sharad Pawar");
    }


    public static void main(String[] args) {
       Swing_ButtonAction2 object = new Swing_ButtonAction2();
    }


}
