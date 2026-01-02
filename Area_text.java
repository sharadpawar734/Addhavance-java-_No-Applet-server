import java.awt.*;
public class Area_text extends Frame{

    public Area_text()  {

        Frame frame = new Frame("Hello Anudip_Foundation_Project.First GUI");

        TextArea textArea = new TextArea("");
        textArea.setBounds(250,40,200,200);

        TextField textField = new TextField();
        textField.setBackground(Color.MAGENTA);
        textField.setBounds(20,120,150,30);

        Label label = new Label("Hello Frainds");
        label.setBackground(Color.BLUE);
        label.setBounds(20,90,150,30);

        Button button = new Button("Click me");
        button.setBackground(Color.CYAN);
        button.setForeground(Color.white);

        frame.add(textArea);
        frame.add(textField);
        frame.add(button);


        frame.setSize(700,500);
       frame.setLayout(null);
       frame.setVisible(true);
    }

    public static void main(String[] args) {

        Area_text object1 = new Area_text();
    }
}
