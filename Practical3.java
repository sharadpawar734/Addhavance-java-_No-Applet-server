import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practical3 extends JFrame {

    private JLabel enrollmentLabel, nameLabel, branchLabel, yearLabel, coursesLabel, feesLabel;
    private JTextField enrollmentField, nameField, branchField, yearField, feesField;
    private JRadioButton firstYearRadio, secondYearRadio, thirdYearRadio, fourthYearRadio;
    private JCheckBox javaCheckBox, pythonCheckBox, cSharpCheckBox;
    private JButton submitButton;

    public  Practical3() {

        setTitle("Student Information Application");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        enrollmentLabel = new JLabel("Enrollment Number:");
        nameLabel = new JLabel("Name:");
        branchLabel = new JLabel("Branch:");
        yearLabel = new JLabel("Year:");
        coursesLabel = new JLabel("Selected Courses:");
        feesLabel = new JLabel("Fees Paid:");

        enrollmentField = new JTextField();
        nameField = new JTextField();
        branchField = new JTextField();
        yearField = new JTextField();
        feesField = new JTextField();

        firstYearRadio = new JRadioButton("Anudip_Foundation_Project.First Year");
        secondYearRadio = new JRadioButton("Second Year");
        thirdYearRadio = new JRadioButton("Third Year");
        fourthYearRadio = new JRadioButton("Fourth Year");

        javaCheckBox = new JCheckBox("Java");
        pythonCheckBox = new JCheckBox("Python");
        cSharpCheckBox = new JCheckBox("C#");

        submitButton = new JButton("Submit");


        setLayout(new GridLayout(7, 2, 10, 10));


        add(enrollmentLabel);
        add(enrollmentField);

        add(nameLabel);
        add(nameField);

        add(branchLabel);
        add(branchField);

        add(yearLabel);
        ButtonGroup yearGroup = new ButtonGroup();
        yearGroup.add(firstYearRadio);
        yearGroup.add(secondYearRadio);
        yearGroup.add(thirdYearRadio);
        yearGroup.add(fourthYearRadio);
        add(firstYearRadio);
        add(secondYearRadio);
        add(thirdYearRadio);
        add(fourthYearRadio);

        add(coursesLabel);
        add(javaCheckBox);
        add(pythonCheckBox);
        add(cSharpCheckBox);

        add(feesLabel);
        add(feesField);

        add(submitButton);


        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                displayStudentInformation();
            }
        });
    }

    private void displayStudentInformation() {
        String enrollment = enrollmentField.getText();
        String name = nameField.getText();
        String branch = branchField.getText();
        String year = getSelectedYear();
        String courses = getSelectedCourses();
        String fees = feesField.getText();

        // Display information (you can modify this part based on your requirements)
        JOptionPane.showMessageDialog(this,
                "Enrollment Number: " + enrollment + "\n" +
                        "Name: " + name + "\n" +
                        "Branch: " + branch + "\n" +
                        "Year: " + year + "\n" +
                        "Courses: " + courses + "\n" +
                        "Fees Paid: " + fees,
                "Student Information", JOptionPane.INFORMATION_MESSAGE);
    }

    private String getSelectedYear() {
        if (firstYearRadio.isSelected()) {
            return "Anudip_Foundation_Project.First Year";
        } else if (secondYearRadio.isSelected()) {
            return "Second Year";
        } else if (thirdYearRadio.isSelected()) {
            return "Third Year";
        } else if (fourthYearRadio.isSelected()) {
            return "Fourth Year";
        } else {
            return "";
        }
    }

    private String getSelectedCourses() {
        StringBuilder courses = new StringBuilder();
        if (javaCheckBox.isSelected()) {
            courses.append("Java, ");
        }
        if (pythonCheckBox.isSelected()) {
            courses.append("Python, ");
        }
        if (cSharpCheckBox.isSelected()) {
            courses.append("C#, ");
        }

        if (courses.length() > 0) {
            courses.delete(courses.length() - 2, courses.length());
        }
        return courses.toString();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new  Practical3().setVisible(true);
            }
        });
    }
}
