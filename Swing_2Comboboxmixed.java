import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_2Comboboxmixed extends JFrame {
    public Swing_2Comboboxmixed() {
        JFrame jFrame = new JFrame();

        JLabel jLabel = new JLabel();
        jLabel.setBounds(100,20,250,30);

        JButton jButton = new JButton("Click me");
        jButton.setBounds(100,50,150,30);


        DefaultListModel<String> l1 = new DefaultListModel<String>();
         l1.addElement("Sharad");
         l1.addElement("Shital");
        l1.addElement("Diksha");
        l1.addElement("Prem");



        DefaultListModel<String> l2 = new DefaultListModel<String>();
        l2.addElement("pawar");
        l2.addElement("Pawar");
        l2.addElement("Jadhav");
        l2.addElement("Nikam");


        JList name = new JList(l1);
         name.setBounds(100,100,75,75);

        JList surname = new JList(l2);
        surname.setBounds(100,200,75,75);


        jFrame.add(jLabel);
        jFrame.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String data = "Your name is:   "+name.getSelectedValue() +" surname:" +surname.getSelectedValue();
                 // ya warchya code madhi do combox che string add keli ahe te don combobox madhi yek,yek choose karun aapan te select karel ani buuton var click karun te varti label la show hoil konte option choose kel ahe.
                jLabel.setText(data); // yachyat aaplya pura string data add hot ani te yeka label var dista jevha button click karyo tevha

            }
        });



        jFrame.add(name);
        jFrame.add(surname);


        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Swing_2Comboboxmixed object = new Swing_2Comboboxmixed();
    }
}
