import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practical8 extends JFrame implements ActionListener {
    // Components
    private JLabel lblEnrollment, lblName, lblBranch, lblYear, lblCourses, lblFeesPaid;
    private JTextField tfEnrollment, tfName, tfFeesPaid;
    private JComboBox<String> cbBranch, cbYear;
    private JCheckBox cbMath, cbScience, cbHistory, cbProgramming;
    private JButton btnAddToTable;
    private JTable studentTable;
    private DefaultTableModel tableModel;

    public Practical8() {
        setTitle("Student Information Entry");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        lblEnrollment = new JLabel("Enrollment Number:");
        lblName = new JLabel("Name:");
        lblBranch = new JLabel("Branch:");
        lblYear = new JLabel("Year:");
        lblCourses = new JLabel("Selected Courses:");
        lblFeesPaid = new JLabel("Fees Paid:");

        tfEnrollment = new JTextField();
        tfName = new JTextField();
        tfFeesPaid = new JTextField();

        cbBranch = new JComboBox<>(new String[]{"Computer Science", "Electrical Engineering", "Mechanical Engineering", "Civil Engineering", "Other"});
        cbYear = new JComboBox<>(new String[]{"1st Year", "2nd Year", "3rd Year", "4th Year"});

        cbMath = new JCheckBox("Mathematics");
        cbScience = new JCheckBox("Science");
        cbHistory = new JCheckBox("History");
        cbProgramming = new JCheckBox("Programming");

        btnAddToTable = new JButton("Add to Table");
        btnAddToTable.addActionListener(this);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Enrollment Number");
        tableModel.addColumn("Name");
        tableModel.addColumn("Branch");
        tableModel.addColumn("Year");
        tableModel.addColumn("Courses");
        tableModel.addColumn("Fees Paid");

        studentTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(studentTable);


        JPanel inputPanel = new JPanel(new GridLayout(7, 2));
        inputPanel.add(lblEnrollment);
        inputPanel.add(tfEnrollment);
        inputPanel.add(lblName);
        inputPanel.add(tfName);
        inputPanel.add(lblBranch);
        inputPanel.add(cbBranch);
        inputPanel.add(lblYear);
        inputPanel.add(cbYear);
        inputPanel.add(lblCourses);
        inputPanel.add(new JPanel());
        inputPanel.add(cbMath);
        inputPanel.add(cbScience);
        inputPanel.add(cbHistory);
        inputPanel.add(cbProgramming);
        inputPanel.add(lblFeesPaid);
        inputPanel.add(tfFeesPaid);


        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnAddToTable);


        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAddToTable) {
            addToTable();
        }
    }

    private void addToTable() {
        String enrollment = tfEnrollment.getText();
        String name = tfName.getText();
        String branch = cbBranch.getSelectedItem().toString();
        String year = cbYear.getSelectedItem().toString();

        StringBuilder courses = new StringBuilder();
        if (cbMath.isSelected()) courses.append("Mathematics, ");
        if (cbScience.isSelected()) courses.append("Science, ");
        if (cbHistory.isSelected()) courses.append("History, ");
        if (cbProgramming.isSelected()) courses.append("Programming, ");

        String feesPaid = tfFeesPaid.getText();


        tableModel.addRow(new Object[]{enrollment, name, branch, year, courses.toString(), feesPaid});


        tfEnrollment.setText("");
        tfName.setText("");
        tfFeesPaid.setText("");


        cbMath.setSelected(false);
        cbScience.setSelected(false);
        cbHistory.setSelected(false);
        cbProgramming.setSelected(false);
    }

    public static void main(String[] args) {
        new Practical8();
    }
}
