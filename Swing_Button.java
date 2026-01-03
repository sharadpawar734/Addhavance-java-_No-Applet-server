// Button and label,TextFiled  create for Swing program Style
import javax.swing.*;

public class Swing_Button {
public JFrame jFrame;       // swing ch program madhi local variable varti diclare karav lagel
    public Swing_Button()  {
       jFrame = new JFrame();
        jFrame.setTitle("Swing Extends Frame program");   //kahi pn event & button gaych asel tya word ch
                                                          // pudhe jFrame(local varible) asigned karav lagel
        JButton jButton = new JButton("Click me");
        jButton.setBounds(130,80,100,30);

        JLabel jLabel = new JLabel("Enter Your Name");
        jLabel.setBounds(10,40,150,30);

        JTextField jTextField = new JTextField("");
        jTextField.setBounds(180,40,190,30);

        jFrame.add(jLabel);
        jFrame.add(jButton);
        jFrame.add(jTextField);

        jFrame.setLayout(null);                 // frame designed karta na pn jframe(local varible ) asighned
        jFrame.setSize(400,400);   // karav lagel
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // last code ni aaplaya la jFrame cha side la
        // cross or cancale button var click karun exit hoil
    }

    public static void main(String[] args) {

        Swing_Button object = new Swing_Button();
    }
}
