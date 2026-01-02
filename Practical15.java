import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practical15 extends JFrame {

    private JTextArea textArea;

    public Practical15() {

        setTitle("Color Changer");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        textArea = new JTextArea("Sample Text Area");
        textArea.setEditable(false);
        add(textArea, BorderLayout.CENTER);


        JMenuBar menuBar = new JMenuBar();


        JMenu colorMenu = new JMenu("Color");


        JMenuItem redItem = createColorMenuItem("Red", Color.RED);
        JMenuItem yellowItem = createColorMenuItem("Yellow", Color.YELLOW);
        JMenuItem blackItem = createColorMenuItem("Black", Color.BLACK);
        JMenuItem whiteItem = createColorMenuItem("White", Color.WHITE);
        JMenuItem blueItem = createColorMenuItem("Blue", Color.BLUE);


        whiteItem.setEnabled(false);


        colorMenu.add(redItem);
        colorMenu.add(yellowItem);
        colorMenu.add(blackItem);
        colorMenu.addSeparator();
        colorMenu.add(whiteItem);
        colorMenu.add(blueItem);


        menuBar.add(colorMenu);


        setJMenuBar(menuBar);


        setVisible(true);
    }

    private JMenuItem createColorMenuItem(String label, Color color) {
        JMenuItem menuItem = new JMenuItem(label);
        menuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                textArea.setBackground(color);


                textArea.setForeground(color);
            }
        });
        return menuItem;
    }

    public static void main(String[] args) {
        new Practical15();
    }
}
