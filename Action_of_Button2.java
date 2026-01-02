//Action listner ch first program madhi aapan action listner construction madhi hota
//ya program madhi action listner ha construction cha baher asal
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action_of_Button2  implements ActionListener {
    Frame frame = new Frame("Hello Anudip_Foundation_Project.First GUI");
    Label label;
    public Action_of_Button2()  {
        label = new Label("Hello Frainds");
        label.setBackground(Color.BLUE);
        label.setBounds(20,90,150,30);
        frame.add(label);

        Button button = new Button("Click me");
        button.setBackground(Color.orange);
        button.setForeground(Color.white);
        button.setBounds(20,180,80,30);
        frame.add(button);


     button.addActionListener(this);       //hi method used karachi construction cha baher Actionlistner used karayach asal tar
                                              //ani action listner types karun zalayvar this takaych ani alt ani entered he don keypress karun secound number ch option choosed karach
        frame.setSize(700,500);     // ani te option main method madhi asal ani te main method ch var copy paste karaych
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    label.setText("Button clicked Successfully");   // ya constructor cha baher lebel chalat nahi tamule starting la ch constructor ch var label dyacha
    }


    public static void main(String[] args) {
    Action_of_Button2 object = new Action_of_Button2();
    }

}
