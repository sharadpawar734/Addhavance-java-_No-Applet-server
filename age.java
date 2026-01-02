import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class age {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Age Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);

        JPanel panel = new JPanel();
        frame.add(panel);

        JLabel birthdateLabel = new JLabel("Enter your birthdate (yyyy-MM-dd):");
        JTextField birthdateField = new JTextField(10);
        JButton calculateButton = new JButton("Calculate Age");
        JLabel ageLabel = new JLabel("Your age is: ");

        panel.add(birthdateLabel);
        panel.add(birthdateField);
        panel.add(calculateButton);
        panel.add(ageLabel);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String birthdate = birthdateField.getText();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

                try {
                    Date birthDate = dateFormat.parse(birthdate);
                    Date currentDate = new Date();
                    long ageInMillis = currentDate.getTime() - birthDate.getTime();
                    long ageInYears = ageInMillis / (1000L * 60 * 60 * 24 * 365);
                    ageLabel.setText("Your age is: " + ageInYears + " years");
                } catch (Exception ex) {
                    ageLabel.setText("Invalid date format!");
                }
            }
        });

        frame.setVisible(true);
    }
}