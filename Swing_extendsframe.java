//ya porgram madhi Constructors ch madhi code kela ahe
// J Frame Creater code
import javax.swing.*;
import java.awt.*;

public class Swing_extendsframe  extends JFrame {

    public Swing_extendsframe() {
        setTitle("Swing Extends Frame program");

        setLayout(null);
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // last code ni aaplaya la jFrame cha side la
                                                         // cross or cancale button var click karun exit hoil
    }

    public static void main(String[] args) {

        Swing_extendsframe Object = new Swing_extendsframe();
    }
}
