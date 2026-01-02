import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practical1 extends Frame {
    public Practical1() {
        Frame frame = new Frame("Prarcal 1");

        Label l1 = new Label("Book id");
        l1.setBounds(20,40,70,30);
        frame.add(l1);

        TextField T1 = new TextField();
        T1.setBounds(130,40,150,30);
        frame.add(T1);

        Label l2 = new Label("Title");
        l2.setBounds( 20,70,70,30);
        frame.add(l2);

        TextField T2 = new TextField();
        T2.setBounds(130,70,150,30);
        frame.add(T2);

        Label l3 = new Label("author");
        l3.setBounds(20,100,70,30);
        frame.add(l3);

        TextField T3 = new TextField();
        T3.setBounds(130,100,150,30);
        frame.add(T3);

        Label l4 = new Label("gener");
        l4.setBounds(20,130,70,30);
        frame.add(l4);

        TextField T4 = new TextField();
        T4.setBounds(130,130,150,30);
        frame.add(T4);

        Label l5 = new Label("publication");
        l5.setBounds(20,160,70,30);
        frame.add(l5);

        TextField T5 = new TextField();
        T5.setBounds(130,160,150,30);
        frame.add(T5);

        Label l6 = new Label("price");
        l6.setBounds(20,200,70,30);
        frame.add(l6);

        TextField T6 = new TextField();
        T6.setBounds(130,200,150,30);
        frame.add(T6);

        Label l7 = new Label("ISBN NO");
        l7.setBounds(20,230,70,30);
        frame.add(l7);

        TextField T7 = new TextField();
        T7.setBounds(130,230,150,30);
        frame.add(T7);


        Button b1 = new Button("Save");
        b1.setBounds(130,270,150,30);
        frame.add(b1);

     b1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             if (e.getSource() == b1) {
                 new Practical1();
             }
         }
     });


        frame.setSize(700,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Practical1 P1 = new Practical1();
    }
}
