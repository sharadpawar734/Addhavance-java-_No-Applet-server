//ya porgram madhi main method ch madhi code kela ahe
// J Frame Creater code

import javax.swing.*;
import java.awt.*;

public class Swing_extendsframe2 extends JFrame {

    public Swing_extendsframe2() {

    }

    public static void main(String[] args) {
        Swing_extendsframe2 object = new Swing_extendsframe2();

        object.setTitle("J Frame Create");
       object. setLayout(null);
        object.setSize(400,400);
        object.setVisible(true);
        object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // last code ni aaplaya la jFrame cha side la
                                                           // cross or cancale button var click karun exit hoil
    }
}
