import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Swing_Checkbox extends JFrame {
    public JFrame jFrame = new JFrame();
   public JLabel jLabel;
   JCheckBox checkBoxone, checkBoxTwo, checkBoxThree;
    public Swing_Checkbox() {

        this.jFrame.setTitle("this is iframe tutorial");
        this.jLabel = new JLabel("Food billing");
        this.jLabel.setBounds(50,50,300,20);

        checkBoxone = new JCheckBox("Pizza 100");
        checkBoxone.setBounds(100,100,150,20);
        checkBoxTwo = new JCheckBox("Burger 200");
        checkBoxTwo. setBounds(100,150,150,20);
        checkBoxThree = new JCheckBox("Fricez 50");
        checkBoxThree.setBounds(100,200,150,20);

        JButton jButton = new JButton("Total");
        jButton.setBounds(100,250,80,30);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float amount = 0;
                String msg = " ";

                if(checkBoxone.isSelected()){
                    amount += 100;
                    msg+= "pizza 100\n";
                }if(checkBoxTwo.isSelected()){
                    amount += 200;
                    msg+= "Burger 200\n";

                }
           if(checkBoxThree.isSelected()){
               amount += 50;
               msg+= "Fricez 50\n";
             }
           JOptionPane.showMessageDialog(jFrame,msg+"Total "+amount);  // ya code mule applaya, button var click karun next page assigned hot manje nextpage msg shows karayala madat karto ha code
           }
        });

        jFrame.add(this.jLabel);
        jFrame.add(checkBoxone);
        jFrame.add(checkBoxTwo);
        jFrame.add(checkBoxThree);
        jFrame.add(jButton);


        jFrame.setLayout(null);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Swing_Checkbox object1 = new Swing_Checkbox();
    }

}
