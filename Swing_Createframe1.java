// Ya program madhe aapan main method madhi swing frame kashi create hoti
// Simple method ne aapan frame banvali ahe ajun illa extend nahi keli ahe
import javax.swing.*;
public class Swing_Createframe1 {

    public Swing_Createframe1() {

    }

    public static void main(String[] args) {
        Swing_Createframe1 Object = new Swing_Createframe1();
        JFrame jFrame = new JFrame("create Swing Frame");

        jFrame.setLayout(null);
        jFrame.setSize(400,400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // last code ni aaplaya la jFrame cha side la
                                                          // cross or cancale button var click karun exit hoil
    }
}
