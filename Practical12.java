import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practical12 extends Frame implements ActionListener {

    private Label lblRadius, lblResult;
    private TextField tfRadius, tfResult;
    private Button btnCalculate;

    public Practical12() {
        setTitle("Circle Calculator");
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));
        setVisible(true);


        lblRadius = new Label("Enter Radius:");
        lblResult = new Label("Result:");

        tfRadius = new TextField();
        tfResult = new TextField();

        btnCalculate = new Button("Calculate");
        btnCalculate.addActionListener(this);


        add(lblRadius);
        add(tfRadius);
        add(new Label());
        add(btnCalculate);
        add(lblResult);
        add(tfResult);


        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalculate) {
            calculateCircle();
        }
    }

    private void calculateCircle() {
        try {
            double radius = Double.parseDouble(tfRadius.getText());

            double area = Math.PI * Math.pow(radius, 2);
            double circumference = 2 * Math.PI * radius;


            tfResult.setText("Area: " + area + "\nCircumference: " + circumference);
        } catch (NumberFormatException ex) {
            tfResult.setText("Invalid input. Please enter a valid number for the radius.");
        }
    }

    public static void main(String[] args) {
        new Practical12();
    }
}
