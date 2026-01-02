import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Formed_name extends Frame{

    public Formed_name(String s)  {
       super(s);
        setLayout(null);
        setVisible(true);
        setSize(500,300);

        Label Name = new Label("Enter your Name");
        Name.setBackground(Color.cyan);
        Name.setBounds(10,40,120,30);
        add(Name);

        TextField TF = new TextField();
        TF.setBackground(Color.red);
        TF.setBounds(190,40,200,20);
        add(TF);


        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {

        Formed_name Fn = new Formed_name("Formed ch name ani textfild");
    }
}
