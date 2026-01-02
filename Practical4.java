import java.awt.*;
import java.awt.event.*;

public class Practical4  extends Frame implements ActionListener {

    private Label lblEmployeeId, lblName, lblQualification, lblDesignation, lblDepartment, lblEmail, lblMobile;
    private TextField tfEmployeeId, tfName, tfQualification, tfDesignation, tfDepartment, tfEmail, tfMobile;
    private Button btnSave;

    public Practical4() {
        setTitle("Employee Information Entry");
        setSize(400, 300);
        setLayout(new GridLayout(8, 2));
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });


        lblEmployeeId = new Label("Employee ID:");
        lblName = new Label("Name:");
        lblQualification = new Label("Qualification:");
        lblDesignation = new Label("Designation:");
        lblDepartment = new Label("Department:");
        lblEmail = new Label("Email:");
        lblMobile = new Label("Mobile:");

        tfEmployeeId = new TextField();
        tfName = new TextField();
        tfQualification = new TextField();
        tfDesignation = new TextField();
        tfDepartment = new TextField();
        tfEmail = new TextField();
        tfMobile = new TextField();

        btnSave = new Button("Save");
        btnSave.addActionListener(this);


        add(lblEmployeeId);
        add(tfEmployeeId);
        add(lblName);
        add(tfName);
        add(lblQualification);
        add(tfQualification);
        add(lblDesignation);
        add(tfDesignation);
        add(lblDepartment);
        add(tfDepartment);
        add(lblEmail);
        add(tfEmail);
        add(lblMobile);
        add(tfMobile);
        add(new Label());
        add(btnSave);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSave) {
            saveEmployeeInformation();
        }
    }

    private void saveEmployeeInformation() {

        String employeeId = tfEmployeeId.getText();
        String name = tfName.getText();
        String qualification = tfQualification.getText();
        String designation = tfDesignation.getText();
        String department = tfDepartment.getText();
        String email = tfEmail.getText();
        String mobile = tfMobile.getText();


        System.out.println("Employee Information Saved:");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Qualification: " + qualification);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
        System.out.println("Email: " + email);
        System.out.println("Mobile: " + mobile);
    }

    public static void main(String[] args) {
        new Practical4();
    }
}
