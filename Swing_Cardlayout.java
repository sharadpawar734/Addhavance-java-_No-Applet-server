import javax.swing.*;
import java.awt.*;

public class Swing_Cardlayout extends JFrame {
    public Swing_Cardlayout(){
        JFrame jFrame = new JFrame();

        Container container = jFrame.getContentPane();

        CardLayout cardLayout = new CardLayout();
        container.setLayout(cardLayout);

        JButton b1 = new JButton("Apple");
        JButton b2 = new JButton("Paynapal");
        JButton b3 = new JButton("Stobarry");
        JButton b4 = new JButton("Mangoes");

        container.add(b1,"1");
        container.add(b2,"2");
        container.add(b3,"3");
        container.add(b4,"4");

        cardLayout.next(container);
        cardLayout.previous(container);
        cardLayout.first(container);
        cardLayout.last(container);
        cardLayout.show(container,"3");






        jFrame.setVisible(true);
        jFrame.setSize(400,400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
    Swing_Cardlayout obje234 = new Swing_Cardlayout();
    }
}
