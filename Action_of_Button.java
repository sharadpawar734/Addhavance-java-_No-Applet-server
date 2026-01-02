import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Action_of_Button extends Frame {
    Frame frame = new Frame("Hello Anudip_Foundation_Project.First GUI");
    public Action_of_Button() {
        Label label = new Label("Hello Frainds");
        label.setBackground(Color.BLUE);
        label.setBounds(20,90,150,30);
        frame.add(label);

        Button button = new Button("Click me");
        button.setBackground(Color.orange);
        button.setForeground(Color.white);
        button.setBounds(20,180,80,30);
        frame.add(button);

        button.addActionListener(new ActionListener() {  // ya code madhi aapan button clicked zalayvar action
            @Override                                   // prformed honaya sati addactionlistnera waparala ahe
            public void actionPerformed(ActionEvent e) { //je kahi action performed karaych ahe te lelel madhi
                label.setText("Zavde Frainds");   // set text madhi type karaych
            }
        });



        frame.setSize(700,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
       Action_of_Button AOB = new Action_of_Button();
    }
}
