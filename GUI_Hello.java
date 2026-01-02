import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI_Hello extends JFrame {
    private JPanel panelMain;
    private JTextField txt_Name;
    private JButton btnClick;

    public GUI_Hello(){
        btnClick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btnClick, txt_Name.getText() + "Hello");
            }
        });
    }

    public static void main(String[] args) {
        GUI_Hello h = new GUI_Hello();

        h.setContentPane(h.panelMain);
       h.setSize(400,400);
       h.setVisible(true);
       h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
