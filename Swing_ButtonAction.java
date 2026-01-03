// ya program madhe aapan constrctor ch madhi code kela ahe button la click kelya var Action
// performed hoil manje tit name change hoil,actionlisner he constructor ch madhi ahe
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_ButtonAction extends JFrame{
    public JFrame jFrame;
    public Swing_ButtonAction() {
        jFrame = new JFrame();
        jFrame.setTitle("Swing Extends Frame program");

        JLabel jLabel = new JLabel("Sharad Rajaram Pawar");
        jLabel.setBounds(130,80,190,30);

        JButton jButton = new JButton("Click me");
        jButton.setBounds(130,140,100,30);

        jFrame.add(jButton);
        jFrame.add(jLabel);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              jLabel.setText("Sharad Pawar");
            }
        });

        jFrame.setLayout(null);                 // frame designed karta na pn jframe(local varible ) asighned
        jFrame.setSize(400,400);   // karav lagel
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // last code ni aaplaya la jFrame cha side la
        // cross or cancale button var click karun exit hoil windows
    }

    public static void main(String[] args) {
      Swing_ButtonAction object = new Swing_ButtonAction();
    }
}
