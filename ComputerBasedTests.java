
import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

class ComputerBasedTests extends JFrame implements ActionListener {
    JLabel l;
    JRadioButton rbutton[] = new JRadioButton[5];
    JButton b1, b2;
    ButtonGroup bg;
    int count = 0, current = 0, x = 1, y = 1, now = 0;
    int m[] = new int[10];

    ComputerBasedTests (String s) {
        super(s);
        l = new JLabel();
        add(l);
        bg = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            rbutton[i] = new JRadioButton();
            add(rbutton[i]);
            bg.add(rbutton[i]);
        }
        b1 = new JButton("Next");
        b2 = new JButton("remaining Question");
        b1.addActionListener(this);
        b2.addActionListener(this);
        add(b1);
        add(b2);
        set();
        l.setBounds(30, 40, 700, 20);
        rbutton[0].setBounds(50, 80, 200, 20);
        rbutton[1].setBounds(50, 110, 200, 20);
        rbutton[2].setBounds(50, 140, 200, 20);
        rbutton[3].setBounds(50, 170, 200, 20);
        b1.setBounds(100, 240, 100, 30);
        b2.setBounds(270, 240, 200, 30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250, 100);
        setVisible(true);
        setSize(900, 350);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            if (check())
                count = count + 1;
            current++;
            set();
            if (current == 9) {
                b1.setEnabled(false);
                b2.setText("Result");
            }
        }
        if (e.getActionCommand().equals("remaining Question")) {
            JButton bk = new JButton("remaining Question" + x);
            bk.setBounds(480, 20 + 30 * x, 200, 30);
            add(bk);
            bk.addActionListener(this);
            m[x] = current;
            x++;
            current++;
            set();
            if (current == 9)
                b2.setText("Result");
            setVisible(false);
            setVisible(true);
        }
        for (int i = 0, y = 1; i < x; i++, y++) {
            if (e.getActionCommand().equals("remaining Question" + y)) {
                if (check())
                    count = count + 1;
                now = current;
                current = m[y];
                set();
                ((JButton) e.getSource()).setEnabled(false);
                current = now;
            }
        }

        if (e.getActionCommand().equals("Result")) {
            if (check())
                count = count + 1;
            current++;
            //System.out.println("correct ans="+count);
            JOptionPane.showMessageDialog(this, "correct ans=" + count);
            System.exit(0);
        }
    }

    void set() {
        rbutton[4].setSelected(true);
        if (current == 0) {
            l.setText("Que1:To which of the following states, Article 370 if the Indian constitution is related:?");
            rbutton[0].setText(" Arunachal Pradesh");
            rbutton[1].setText("PUNJAB");
            rbutton[2].setText("JAMMU & KASMIR");
            rbutton[3].setText("West Bengal");
        }
        if (current == 1) {
            l.setText("Que2: Article 370 is drafted in the part………of the Indian Constitution.?");
            rbutton[0].setText("XXI");
            rbutton[1].setText("XIX");
            rbutton[2].setText("XII");
            rbutton[3].setText(" IXX");
        }
        if (current == 2) {
            l.setText("Que3: Who is the national president of congress?");
            rbutton[0].setText("RAHUL GANDHI ");
            rbutton[1].setText("PRIYANKA GANDHI");
            rbutton[2].setText("SONIA GANDHI");
            rbutton[3].setText("MANMOHAN SINGH");
        }
        if (current == 3) {
            l.setText("Que4: WHO was working president of BJP?");
            rbutton[0].setText("NARENDRA MODI");
            rbutton[1].setText("AMIT SHAH");
            rbutton[2].setText("J P NADDA");
            rbutton[3].setText("SHIVRAJ SINGH CHOHAN");
        }
        if (current == 4) {
            l.setText("Que5: Which group in JECRC Releted to Blood Donation?");
            rbutton[0].setText("Zarurat");
            rbutton[1].setText("Soch");
            rbutton[2].setText("Aashayien");
            rbutton[3].setText("none of these");
        }
        if (current == 5) {
            l.setText("Que6: The concept of Goods and Services Tax (GST) is originated in………..?");
            rbutton[0].setText("CANADA");
            rbutton[1].setText("JAPAN");
            rbutton[2].setText("CHAINA");
            rbutton[3].setText("RUSIA");
        }
        if (current == 6) {
            l.setText("Que7: Who was the nationl Spokeperson of BJP ");
            rbutton[0].setText("Dr.Sambit Patra");
            rbutton[1].setText("GOURAV Valabh");
            rbutton[2].setText("ABHISHEK MANU");
            rbutton[3].setText("NONE of these");
        }
        if (current == 7) {
            l.setText("Que8: who was the Governer  of Rajasthan");
            rbutton[0].setText("Satyapal Malik");
            rbutton[1].setText("Kalyan Singh");
            rbutton[2].setText("Aanndi Ben");
            rbutton[3].setText("Kalraj Mishra");
        }
        if (current == 8) {
            l.setText("Que9:Who was the foreign minister of india?");
            rbutton[0].setText("Shushama Swaraj");
            rbutton[1].setText("ARUN JETAILY");
            rbutton[2].setText("RAJANATH SINGH");
            rbutton[3].setText("S.JAYASHANKAR");
        }
        if (current == 9) {
            l.setText("Que10: Which  Inheritance java not support ?");
            rbutton[0].setText("single");
            rbutton[1].setText("multilevel");
            rbutton[2].setText("Multiple");
            rbutton[3].setText("Inheritancel");
        }
        l.setBounds(30, 40, 450, 20);
        for (int i = 0, j = 0; i <= 90; i += 30, j++)
            rbutton[j].setBounds(50, 80 + i, 200, 20);
    }

    boolean check() {
        if (current == 0)
            return (rbutton[2].isSelected());
        if (current == 1)
            return (rbutton[0].isSelected());
        if (current == 2)
            return (rbutton[2].isSelected());
        if (current == 3)
            return (rbutton[2].isSelected());
        if (current == 4)
            return (rbutton[2].isSelected());
        if (current == 5)
            return (rbutton[0].isSelected());
        if (current == 6)
            return (rbutton[0].isSelected());
        if (current == 7)
            return (rbutton[3].isSelected());
        if (current == 8)
            return (rbutton[3].isSelected());
        if (current == 9)
            return (rbutton[2].isSelected());
        return false;
    }

    public static void main(String args[]) {
//        new ComputerBasedTests("Online Test made by Pushpendra Singh ");
    }
}
