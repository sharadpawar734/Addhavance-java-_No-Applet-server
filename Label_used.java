import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Label_used  extends Frame {

    public Label_used(String s)  {
     super(s);


        Label label = new Label("Hello Fraind");
        label.setBounds(50,50,100,100);
        add(label);

        setSize(300,350);
        setLayout(null);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();  // ya sentence ch meaning asa ahe ki jevha aaplyala windows closing la action performed hoyla matahd karte

            }
        });

    }

    public static void main(String[] args) {

        Frame frame = new Frame("Label");
    }
}
