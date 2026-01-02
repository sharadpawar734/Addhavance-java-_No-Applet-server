import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practical6 extends Frame implements ActionListener {
    private Label lblNumber1, lblNumber2, lblResult;
    private TextField tfNumber1, tfNumber2;
    private Button btnAdd, btnSubtract, btnMultiply, btnDivide;

    public Practical6() {
        setTitle("Arithmetic Calculator");
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        lblNumber1 = new Label("Number 1:");
        lblNumber2 = new Label("Number 2:");
        lblResult = new Label("Result:");

        tfNumber1 = new TextField();
        tfNumber2 = new TextField();

        btnAdd = new Button("Add");
        btnSubtract = new Button("Subtract");
        btnMultiply = new Button("Multiply");
        btnDivide = new Button("Divide");

        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);


        add(lblNumber1);
        add(tfNumber1);
        add(lblNumber2);
        add(tfNumber2);
        add(btnAdd);
        add(btnSubtract);
        add(btnMultiply);
        add(btnDivide);
        add(lblResult);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(tfNumber1.getText());
            double num2 = Double.parseDouble(tfNumber2.getText());

            if (e.getSource() == btnAdd) {
                double result = num1 + num2;
                lblResult.setText("Result: " + result);
            } else if (e.getSource() == btnSubtract) {
                double result = num1 - num2;
                lblResult.setText("Result: " + result);
            } else if (e.getSource() == btnMultiply) {
                double result = num1 * num2;
                lblResult.setText("Result: " + result);
            } else if (e.getSource() == btnDivide) {
                if (num2 != 0) {
                    double result = num1 / num2;
                    lblResult.setText("Result: " + result);
                } else {
                    lblResult.setText("Error: Cannot divide by zero");
                }
            }
        } catch (NumberFormatException ex) {
            lblResult.setText("Error: Please enter valid numeric values for numbers.");
        }
    }

    public static void main(String[] args) {
        new Practical6();
    }
}
