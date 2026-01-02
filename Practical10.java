import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practical10 extends JFrame implements ActionListener {
    // Components
    private JLabel lblUsername, lblPassword;
    private JTextField tfUsername;
    private JPasswordField pfPassword;
    private JButton btnLogin;

    public Practical10() {
        setTitle("Login Application");
        setSize(300, 150);
        setLayout(new GridLayout(3, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        lblUsername = new JLabel("Username:");
        lblPassword = new JLabel("Password:");

        tfUsername = new JTextField();
        pfPassword = new JPasswordField();

        btnLogin = new JButton("Login");
        btnLogin.addActionListener(this);


        add(lblUsername);
        add(tfUsername);
        add(lblPassword);
        add(pfPassword);
        add(new JLabel());
        add(btnLogin);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            checkCredentials();
        }
    }

    private void checkCredentials() {
        String username = tfUsername.getText();
        char[] passwordChars = pfPassword.getPassword();
        String password = new String(passwordChars);


        if ("admin".equals(username) && "password123".equals(password)) {
            JOptionPane.showMessageDialog(this, "Login successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Login failed. Please check your username and password.");
        }


        tfUsername.setText("");
        pfPassword.setText("");
    }

    public static void main(String[] args) {
        new Practical10();
    }
}
