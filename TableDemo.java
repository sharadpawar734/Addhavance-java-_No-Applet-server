import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
public class TableDemo extends JFrame implements ActionListener{
    JLabel lbName, lbRoll, lbSubject, lbMarks, lbBranch;
    JTextField tfName, tfRoll, tfSubject, tfMarks, tfBranch;
    JTable tbStud;
    DefaultTableModel table;
    JButton btnAdd;
    JScrollPane paneStud;
    public TableDemo(){
        setLayout(new FlowLayout());
        setSize(650,400);
        setTitle("Student Data");
        lbName=new JLabel("Student Name");
        add(lbName);
        tfName=new JTextField(10);
        add(tfName);
        lbRoll=new JLabel("Roll No");
        add(lbRoll);
        tfRoll=new JTextField(10);
        add(tfRoll);
        lbSubject=new JLabel("Subject");
        add(lbSubject);
        tfSubject=new JTextField(10);
        add(tfSubject);
        lbMarks=new JLabel("Marks");
        add(lbMarks);
        tfMarks=new JTextField(10);
        add(tfMarks);
        lbBranch=new JLabel("Standard");
        add(lbBranch);
        tfBranch=new JTextField(13);
        add(tfBranch);
        btnAdd=new JButton("Add Data");
        btnAdd.addActionListener(this);
        add(btnAdd);
        this.table = new DefaultTableModel();
        table.addColumn("Name");
        table.addColumn("Roll No");
        table.addColumn("Subject");
        table.addColumn("Marks ");
        table.addColumn("Standard");
        tbStud = new JTable();
        tbStud.setFont(new Font("Verdana", Font.PLAIN, 12));
        tbStud.setRowHeight(25);
        tbStud.setModel(table);
        table.addRow(new Object[]{ "Tejas","23","Math-I","70","9th"});
                this.paneStud = new JScrollPane();
        this.paneStud.setViewportView(this.tbStud);
        this.paneStud.setPreferredSize(new Dimension(600, 230));
        this.add(this.paneStud);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setVisible(true);
}
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Object data[] = new Object[5];
                data[0] = this.tfName.getText();
                data[1] = this.tfRoll.getText();
                data[2] = this.tfSubject.getText();
                data[3] = this.tfMarks.getText();
                data[4] = this.tfBranch.getText();
                this.table.addRow(data);
                JOptionPane.showMessageDialog(this, "Data Added to Table",
                        "Message", JOptionPane.INFORMATION_MESSAGE);
            } catch(Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
        public static void main(String[] args) {
            new TableDemo();
        }
    }
