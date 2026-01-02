import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class text extends JFrame implements ActionListener {
    static JTextField t;
    static JPasswordField pass;
    static JFrame f;
    static JButton b;
    static JLabel l;
    text()
    {
    }

    public static void main(String[] args)
    {
        f = new JFrame("textfield");

        l = new JLabel("nothing entered");

        b = new JButton("submit");

        text te = new text();

        b.addActionListener(te);

        t = new JTextField("enter name", 16);

        pass = new JPasswordField(16);
        Font fo = new Font("Serif", Font.ITALIC, 20);

        t.setFont(fo);
        JPanel p = new JPanel();

        p.add(t);
        p.add(pass);
        p.add(b);
        p.add(l);

        f.add(p);

        f.setSize(300, 300);

        f.show();
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if (s.equals("submit")) {
            l.setText("name = " + t.getText() + "\t Password = " + pass.getText());
            t.setText(" ");
            pass.setText("");
        }
    }
}
