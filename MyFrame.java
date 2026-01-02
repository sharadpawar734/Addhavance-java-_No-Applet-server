import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame  extends Frame {
    public MyFrame(String s) {
        super(s);
        setLayout(null);
        setVisible(true);
        setSize(500,300);

        Label one = new Label("Label 1");
        Label Two = new Label("Label 2");
        Label Three = new Label("Label 3");

        one.setBounds(50,50,100,100);
        Two.setBounds(150,50,100,100);
        Three.setBounds(250,50,100,100);

        add(one);
        add(Two);
        add(Three);

        Button button = new Button("Click me");
        button.setBackground(Color.orange);
        button.setBounds(20,180,80,30);   //x la jas number wadaval tas right kadun left la jail ani y la jas numner wadhaval tas to varun khali yeail
        add(button);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();  // ya sentence ch meaning asa ahe ki jevha aaplyala windows closing la action performed hoyla matahd karte

            }
        });
    }

    public static void main(String[] args) {

        MyFrame f = new MyFrame("Button and Label used Frame");
    }
}
