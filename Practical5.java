import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practical5 extends Frame implements ActionListener {

    private Label lblPrincipal, lblRate, lblTime, lblInterestType, lblResult;
    private TextField tfPrincipal, tfRate, tfTime;
    private CheckboxGroup interestTypeGroup;
    private Checkbox cbSimple, cbCompound;
    private Button btnCalculate;

    public Practical5() {
        setTitle("Interest Calculator");
        setSize(400, 300);
        setLayout(new GridLayout(6, 2));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                System.exit(0);
            }
        });

        lblPrincipal = new Label("Principal:");
        lblRate = new Label("Rate of Interest:");
        lblTime = new Label("Time (in years):");
        lblInterestType = new Label("Interest Type:");
        lblResult = new Label("Result:");

        tfPrincipal = new TextField();
        tfRate = new TextField();
        tfTime = new TextField();

        interestTypeGroup = new CheckboxGroup();
        cbSimple = new Checkbox("Simple Interest", interestTypeGroup, false);
        cbCompound = new Checkbox("Compound Interest", interestTypeGroup, false);

        btnCalculate = new Button("Calculate");
        btnCalculate.addActionListener(this);


        add(lblPrincipal);
        add(tfPrincipal);
        add(lblRate);
        add(tfRate);
        add(lblTime);
        add(tfTime);
        add(lblInterestType);
        add(new Panel());
        add(cbSimple);
        add(cbCompound);
        add(lblResult);
        add(btnCalculate);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalculate) {
            calculateInterest();
        }
    }

    private void calculateInterest() {
        try {
            double principal = Double.parseDouble(tfPrincipal.getText());
            double rate = Double.parseDouble(tfRate.getText());
            double time = Double.parseDouble(tfTime.getText());

            if (cbSimple.getState()) {

                double simpleInterest = (principal * rate * time) / 100;
                lblResult.setText("Simple Interest: " + simpleInterest);
            } else if (cbCompound.getState()) {

                double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;
                lblResult.setText("Compound Interest: " + compoundInterest);
            }
        } catch (NumberFormatException ex) {
            lblResult.setText("Please enter valid numeric values for Principal, Rate, and Time.");
        }
    }

    public static void main(String[] args) {
        new Practical5();
    }
}
