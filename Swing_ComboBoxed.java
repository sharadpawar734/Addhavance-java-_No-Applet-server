import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_ComboBoxed extends JFrame {
    public Swing_ComboBoxed(String s) {
        super(s);
        JFrame jFrame = new JFrame();

        JButton jButton = new JButton("Click");
        jButton.setBounds(100,150,80,30);

        String cityname[] = {"Mumbai","Nashik","jalgoan","Chalisgoan"};
        JComboBox jComboBox = new JComboBox<>(cityname);
        jComboBox.setBounds(100,20,100,20);

        JLabel jLabel = new JLabel("");
        jLabel.setBounds(100,50,200,30);

        jFrame.add(jButton);
        jFrame.add(jComboBox);
        jFrame.add(jLabel);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("you selected City"+jComboBox.getItemAt(jComboBox.getSelectedIndex())); //ya code madhi aapana je comboboxed madhi selected karnar he code te khali yka label madhi tyach name yail tumhi he option selected kel ahe
                System.out.println("working");
            }
        });

        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Swing_ComboBoxed object = new Swing_ComboBoxed("Create Freame");
    }
}
