import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practical14 extends JFrame {
    private JRadioButton rbTriangle, rbRectangle;
    private JLabel lblBase, lblHeight, lblLength, lblWidth, lblResult;
    private JTextField tfBase, tfHeight, tfLength, tfWidth, tfResult;
    private JButton btnCalculate;

    public Practical14() {
        setTitle("Area Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(7, 2));


        rbTriangle = new JRadioButton("Triangle");
        rbRectangle = new JRadioButton("Rectangle");

        lblBase = new JLabel("Base:");
        lblHeight = new JLabel("Height:");
        lblLength = new JLabel("Length:");
        lblWidth = new JLabel("Width:");
        lblResult = new JLabel("Result:");

        tfBase = new JTextField();
        tfHeight = new JTextField();
        tfLength = new JTextField();
        tfWidth = new JTextField();
        tfResult = new JTextField();

        btnCalculate = new JButton("Calculate");


        ButtonGroup shapeGroup = new ButtonGroup();
        shapeGroup.add(rbTriangle);
        shapeGroup.add(rbRectangle);


        rbTriangle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                enableTriangleFields();
            }
        });

        rbRectangle.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                enableRectangleFields();
            }
        });


        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculateArea();
            }
        });


        add(rbTriangle);
        add(rbRectangle);
        add(lblBase);
        add(tfBase);
        add(lblHeight);
        add(tfHeight);
        add(lblLength);
        add(tfLength);
        add(lblWidth);
        add(tfWidth);
        add(new JLabel());
        add(btnCalculate);
        add(lblResult);
        add(tfResult);


        setVisible(true);
    }

    private void enableTriangleFields() {
        tfBase.setEnabled(true);
        tfHeight.setEnabled(true);
        tfLength.setEnabled(false);
        tfWidth.setEnabled(false);
    }

    private void enableRectangleFields() {
        tfBase.setEnabled(false);
        tfHeight.setEnabled(false);
        tfLength.setEnabled(true);
        tfWidth.setEnabled(true);
    }

    private void calculateArea() {
        try {
            if (rbTriangle.isSelected()) {

                double base = Double.parseDouble(tfBase.getText());
                double height = Double.parseDouble(tfHeight.getText());
                double area = 0.5 * base * height;
                tfResult.setText("Area of Triangle: " + area);
            } else if (rbRectangle.isSelected()) {

                double length = Double.parseDouble(tfLength.getText());
                double width = Double.parseDouble(tfWidth.getText());
                double area = length * width;
                tfResult.setText("Area of Rectangle: " + area);
            } else {
                tfResult.setText("Please select a shape.");
            }
        } catch (NumberFormatException ex) {
            tfResult.setText("Invalid input. Please enter valid numeric values.");
        }
    }

    public static void main(String[] args) {
        new Practical14();
    }
}
