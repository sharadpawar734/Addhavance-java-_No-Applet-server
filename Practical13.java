import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practical13 extends JFrame implements ActionListener {
    // Components
    private JLabel lblEnrollment, lblName, lblBranch, lblYear, lblAddress, lblCourses, lblFeesPaid;
    private JTextField tfEnrollment, tfName, tfAddress, tfFeesPaid;
    private JComboBox<String> cbBranch, cbYear;
    private JCheckBox cbMath, cbScience, cbHistory, cbProgramming;
    private JButton btnSave;
    private JTextArea taCourses;
    private JScrollPane scrollPane;

    public Practical13() {
        // Frame setup
        setTitle("Student Information Entry");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());

        // Components initialization
        lblEnrollment = new JLabel("Enrollment Number:");
        lblName = new JLabel("Name:");
        lblBranch = new JLabel("Branch:");
        lblYear = new JLabel("Year:");
        lblAddress = new JLabel("Address:");
        lblCourses = new JLabel("Selected Courses:");
        lblFeesPaid = new JLabel("Fees Paid:");

        tfEnrollment = new JTextField();
        tfName = new JTextField();
        tfAddress = new JTextField();
        tfFeesPaid = new JTextField();

        cbBranch = new JComboBox<>(new String[]{"Computer Science", "Electrical Engineering", "Mechanical Engineering", "Civil Engineering", "Other"});
        cbYear = new JComboBox<>(new String[]{"1st Year", "2nd Year", "3rd Year", "4th Year"});

        cbMath = new JCheckBox("Mathematics");
        cbScience = new JCheckBox("Science");
        cbHistory = new JCheckBox("History");
        cbProgramming = new JCheckBox("Programming");

        btnSave = new JButton("Save");
        btnSave.addActionListener(this);

        taCourses = new JTextArea(4, 20);
        taCourses.setEditable(false);
        scrollPane = new JScrollPane(taCourses);


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;


        gbc.gridx = 0;
        gbc.gridy = 0;
        add(lblEnrollment, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(tfEnrollment, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lblName, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        add(tfName, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        add(lblBranch, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        add(cbBranch, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        add(lblYear, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        add(cbYear, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        add(lblAddress, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(tfAddress, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(lblCourses, gbc);

        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        add(scrollPane, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        add(lblFeesPaid, gbc);

        gbc.gridx = 1;
        gbc.gridy = 6;
        add(tfFeesPaid, gbc);

        gbc.gridx = 1;
        gbc.gridy = 7;
        add(btnSave, gbc);

        // Displaying the frame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSave) {
            saveStudentInformation();
        }
    }

    private void saveStudentInformation() {
        String enrollment = tfEnrollment.getText();
        String name = tfName.getText();
        String branch = cbBranch.getSelectedItem().toString();
        String year = cbYear.getSelectedItem().toString();
        String address = tfAddress.getText();
        String courses = getSelectedCourses();
        String feesPaid = tfFeesPaid.getText();


        String message = "Student Information Saved:\n"
                + "Enrollment Number: " + enrollment + "\n"
                + "Name: " + name + "\n"
                + "Branch: " + branch + "\n"
                + "Year: " + year + "\n"
                + "Address: " + address + "\n"
                + "Selected Courses: " + courses + "\n"
                + "Fees Paid: " + feesPaid;

        JOptionPane.showMessageDialog(this, message);
    }

    private String getSelectedCourses() {
        StringBuilder selectedCourses = new StringBuilder();
        if (cbMath.isSelected()) {
            selectedCourses.append("Mathematics, ");
        }
        if (cbScience.isSelected()) {
            selectedCourses.append("Science, ");
        }
        if (cbHistory.isSelected()) {
            selectedCourses.append("History, ");
        }
        if (cbProgramming.isSelected()) {
            selectedCourses.append("Programming, ");
        }


        if (selectedCourses.length() > 0) {
            selectedCourses.delete(selectedCourses.length() - 2, selectedCourses.length());
        }

        return selectedCourses.toString();
    }

    public static void main(String[] args) {
        new  Practical13 ();
    }
}
