// Main method madhi code kasa karayach or windows kashi design karaychi

// yalach aapan GUI appllication Devloped pn bolu Shakto
// ya program madhe fkt aaplyala thik thik thikani frame ha word add karaych ahe


import java.awt.*;

public class Code_in_main extends Frame {

    public Code_in_main()  {
    }

    public static void main(String[] args) {
      Frame  frame = new Frame("Hello Anudip_Foundation_Project.First GUI");   //frame name ch object create kela ahe

        Label Name = new Label("Enter your Name");
        Name.setBackground(Color.cyan);
        Name.setBounds(10,40,120,30);
        frame. add( Name );                               //object mule label add hoto re

        TextField Tf = new TextField();
        Tf.setBackground(Color.red);
        Tf.setBounds(190,40,200,20);
        frame. add(Tf);                                    // object mule Textfiled add hote

        frame.setSize(400,300);             // ya three line madhi object add kela ahe karan vrti je
        frame.setLayout(null);                         // label ani textfiled ghetali ahe na ti frame or windows
        frame.setVisible(true);                        // show wahyala help karte
    }
}
