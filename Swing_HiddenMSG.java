// ya program madhi aapan input dialgoue box ghenar ahe ki user kadun input kas gayach
//joptionplan madhi Input dialog mule aapan input gevu shakto
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_HiddenMSG extends JFrame {

    public Swing_HiddenMSG() {
        JFrame jFrame = new JFrame();

        JButton jButton = new JButton("Click me");
        jFrame.setBounds(250,20,40,30);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String str = JOptionPane.showInputDialog("Enter your Name");
                if(str.length() > 0);
                System.out.println("The name of uder is:  "+str);
            }

        });

        jFrame.add(jButton);

        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new FlowLayout());
    }

    public static void main(String[] args) {
        Swing_HiddenMSG obj = new Swing_HiddenMSG();

    }
}
