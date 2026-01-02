

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practical_7 extends JFrame {
    JLabel jLabel,lbstoreName, lbMobileNo, lbAddress, lbProduct, lbPayment, lbLience;
    JTextField tfOwnerName,tfstoreName, tfMobileNo,tfLience;
    JTextArea taAddress;
    JList lstItems;
    JComboBox cbPayment;
    JScrollPane paneForAddress, paneForItems;
    JCheckBox chbCash, chbOnline, chbDebitcard;

    JButton btnOrder;

    public Practical_7  (String s) {
        super(s);
        JFrame jFrame = new JFrame();
        this.setSize(250,380);
        this.setTitle("Swing Components Demo");
        this.setLayout(new FlowLayout());

        jLabel = new JLabel("Owner name");
        this.jLabel.setBounds(30,20,300,20);
        jFrame.add(this.jLabel);

        this.tfOwnerName = new JTextField(10);
        this.add(this.tfOwnerName);

        this.lbstoreName = new JLabel("Store Name: ");
        this.add(this.lbstoreName);

        this.tfstoreName = new JTextField(15);
        this.add(this.tfstoreName);




        this.lbAddress = new JLabel("Address: ");
        this.add(this.lbAddress);

        this.taAddress = new JTextArea(4, 20);
        this.paneForAddress = new JScrollPane(this.taAddress);
        this.paneForAddress.setPreferredSize(new Dimension(140, 80));
        this.add(this.paneForAddress);


        this.lbMobileNo = new JLabel("Mobile No: ");
        this.add(this.lbMobileNo);

        this.tfMobileNo = new JTextField(10);
        this.add(this.tfMobileNo);


        this.lbProduct = new JLabel("Store Product: ");
        this.add(this.lbProduct);

        String items[] = {"jeans", "Shirt", "Shoes",
                "Hat", "Scrit", "Crop top", "Sweater", "T-Shirt",
                "Tie"};
        this.lstItems = new JList(items);
        this.paneForItems = new JScrollPane(this.lstItems);
        this.paneForItems.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        this.paneForItems.setPreferredSize(new Dimension(100, 70));
        this.add(this.paneForItems);

        this.lbPayment = new JLabel("Select Payment access: ");
        this.add(this.lbPayment);

        this.cbPayment = new JComboBox();

        chbCash = new JCheckBox ("Cash");
        add( chbCash);

        chbOnline = new JCheckBox ("Online");
        add( chbOnline);


        chbDebitcard = new JCheckBox ("Debitcard");
        add( chbDebitcard);


        this.lbLience= new JLabel(" Store Licence: ");
        this.add(this.lbLience);

        this.tfLience = new JTextField(15);
        this.add(this.tfLience);



        this.btnOrder = new JButton("Show Information");
        this.add(this.btnOrder);




        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        Practical_7 obj34 = new Practical_7("");
    }


}
