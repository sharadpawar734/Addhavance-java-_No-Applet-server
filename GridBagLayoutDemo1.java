import java.awt.*;
import java.awt.event.*;

public class GridBagLayoutDemo1 extends Frame {
    Label lbName, lbEmail, lbYear, lbAddress;
    Label lbCourse, lbMobileNo, lbLabReg;
    TextField tfName, tfEmail, tfMobileNo;
    TextArea taAddress;
    Checkbox rbFY, rbSY, rbTY, cbLabReg;
    CheckboxGroup cbgYear;
    List lstCourses;
    Button btnSubmitInfo;

    public GridBagLayoutDemo1() {
        this.setTitle("Student Info");
        this.setSize(450, 260);
        this.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        this.lbName = new Label("Name: ");
        this.setConstraints(gbc, 0, 0);
        this.add(this.lbName, gbc);

        this.tfName = new TextField(15);
        this.setConstraints(gbc, 1, 0);
        this.add(this.tfName, gbc);

        this.lbEmail = new Label("Email: ");
        this.setConstraints(gbc, 2, 0);
        this.add(this.lbEmail, gbc);

        this.tfEmail = new TextField(15);
        this.setConstraints(gbc, 3, 0);
        this.add(this.tfEmail, gbc);

        this.lbYear = new Label("Year: ");
        this.setConstraints(gbc, 0, 1);
        this.add(this.lbYear, gbc);

        this.cbgYear = new CheckboxGroup();

        this.rbFY = new Checkbox("FY", true, this.cbgYear);
        this.setConstraints(gbc, 1, 1);
        this.add(this.rbFY, gbc);
        this.rbSY = new Checkbox("SY", false, this.cbgYear);
        this.setConstraints(gbc, 2, 1);
        this.add(this.rbSY, gbc);
        this.rbTY = new Checkbox("TY", false, this.cbgYear);
        this.setConstraints(gbc, 3, 1);
        this.add(this.rbTY, gbc);

        this.lbAddress = new Label("Address: ");
        this.setConstraints(gbc, 0, 2);
        this.add(this.lbAddress, gbc);

        this.taAddress = new TextArea(3, 15);
        this.setConstraints(gbc, 1, 2);
        this.add(this.taAddress, gbc);

        this.lbCourse = new Label("Course: ");
        this.setConstraints(gbc, 2, 2);
        this.add(this.lbCourse, gbc);

        this.lstCourses = new List(4, false);
        this.lstCourses.add("CE");
        this.lstCourses.add("CO");
        this.lstCourses.add("EE");
        this.lstCourses.add("IF");
        this.lstCourses.add("ME");
        this.setConstraints(gbc, 3, 2);
        this.add(this.lstCourses, gbc);

        this.lbMobileNo = new Label("Mobile No: ");
        this.setConstraints(gbc, 0, 3);
        this.add(this.lbMobileNo, gbc);

        this.tfMobileNo = new TextField(15);
        this.setConstraints(gbc, 1, 3);
        this.add(this.tfMobileNo, gbc);

        this.lbLabReg = new Label("Lab. Reg.: ");
        this.setConstraints(gbc, 2, 3);
        this.add(this.lbLabReg, gbc);

        this.cbLabReg = new Checkbox("Register for Lab.", true);
        this.setConstraints(gbc, 3, 3);
        this.add(this.cbLabReg, gbc);

        this.btnSubmitInfo = new Button("Submit Infroamtion");
        this.setConstraints(gbc, 3, 4);
        this.add(this.btnSubmitInfo, gbc);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setResizable(false);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new GridBagLayoutDemo1();
    }

    private void setConstraints(GridBagConstraints gbc, int x, int y) {
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.ipadx = 0;
        gbc.ipady = 0;
        gbc.weightx = 0;
        gbc.weighty = 0.5;
    }
}