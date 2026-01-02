import java.awt.*;
import java.awt.event.*;

public class ActionEventDemo extends Frame implements ActionListener {
    private Label lbNumber, lbResult;
    private TextField tfNumber;
    private Button btnCalcSqr;

    public ActionEventDemo() {
        super();
        this.setTitle("Square Calculation");
        this.setSize(280, 130);
        this.setLayout(new FlowLayout());

        this.lbNumber = new Label("Enter Number: ");
        this.add(this.lbNumber);

        this.tfNumber = new TextField(15);
        this.add(this.tfNumber);

        this.btnCalcSqr = new Button("Calculate Square");
        this.btnCalcSqr.addActionListener(this);
        this.add(this.btnCalcSqr);

        this.lbResult = new Label("Here result or error will be displayed.");
        this.lbResult.setAlignment(Label.CENTER);
        this.add(this.lbResult);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new ActionEventDemo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int number = Integer.parseInt(this.tfNumber.getText());
            this.lbResult.setText("Square = " + (number * number));
        } catch (NumberFormatException nfe) {
            this.lbResult.setText("Error: Input Number is missing.");
        }
    }
}