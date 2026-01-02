import javax.swing.*;
import java.awt.*;


public class OldCar  extends Frame {

    public OldCar(String s) {
            super(s);
         Frame  frame = new Frame();

        Label one = new Label("Enter Your Full Name");
        Label Two = new Label("Enter Your Phone Number");
        Label Three = new Label("Your Car Brand Choose");
        Label Four = new Label("Enter the car model name");
        Label Fift = new Label("Selled! Selled! Your Old Car is Selled!");
        Label Six = new Label("Enter the your car selled Feedback!");

        one.setBounds(10,80,150,20);
        Two.setBounds(10,120,150,20);
        Three.setBounds(10,160,150,20);
        Four.setBounds(10,200,150,20);
        Fift.setBounds(180,35,300,20);
        Six.setBounds(10,240,189,20);

        TextField TF1 = new TextField();
        TextField TF2 = new TextField();
        TextField TF3 = new TextField();

        TF1.setBounds(180,80,250,20);
        TF2.setBounds(180,120,250,20);
       TF3.setBounds(180,200,250,20);

        Checkbox checkbox = new Checkbox("Maruti Suzuki");
        checkbox.setBounds(200,160,90,20);

        Checkbox checkbox1 = new Checkbox("Toyota");
        checkbox1.setBounds(320,160,60,20);

        Checkbox checkbox2 = new Checkbox("Hyundai");
        checkbox2.setBounds(420,160,60,20);

        Checkbox checkbox3 = new Checkbox("Mahindra");
        checkbox3.setBounds(500,160,60,20);

        Button button = new Button("Selled Car");
        button.setBackground(Color.red);
        button.setForeground(Color.white);
        button.setBounds(200,450,150,20);

        TextArea textArea = new TextArea();
        textArea.setBounds(220,250,250,180);
        textArea.setBackground(Color.ORANGE);
        textArea.setForeground(Color.BLACK);

          add(one);
          add(Two);
          add(Three);
          add(Four);
          add(Fift);
          add(Six);
          add(TF1);
          add(TF2);
          add(TF3);
          add(checkbox);
          add(checkbox1);
          add(checkbox2);
          add(checkbox3);
          add(button);
          add(textArea);


        setSize(600,500);
            setLayout(null);
            setVisible(true);
    }

    public static void main(String[] args) {

        OldCar object = new OldCar("Exchange your car");
    }
}
