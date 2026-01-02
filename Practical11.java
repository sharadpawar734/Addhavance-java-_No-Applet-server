import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practical11 extends JFrame implements ActionListener {
    // Components
    private JLabel lblPassword;
    private JPasswordField pfPassword;
    private JButton btnCheck;

    public Practical11() {
        setTitle("Password Length Checker");
        setSize(300, 150);
        setLayout(new GridLayout(2, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        lblPassword = new JLabel("Password:");
        pfPassword = new JPasswordField();
        btnCheck = new JButton("Check Length");
        btnCheck.addActionListener(this);


        add(lblPassword);
        add(pfPassword);
        add(new JLabel());
        add(btnCheck);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCheck) {
            checkPasswordLength();
        }
    }

    private void checkPasswordLength() {
        char[] passwordChars = pfPassword.getPassword();
        String password = new String(passwordChars);


        if (password.length() > 6) {
            JOptionPane.showMessageDialog(this, "Password length is greater than 6 characters.");
        } else {
            JOptionPane.showMessageDialog(this, "Password length must be greater than 6 characters.");
        }


        pfPassword.setText("");
    }

    public static void main(String[] args) {
        new Practical11();
    }
}
