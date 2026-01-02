import java.awt.*;

public class Create_Checkbox extends Frame {

    public Create_Checkbox()  {
        Frame frame = new Frame("Create the Check Box");

        Checkbox checkbox = new Checkbox("Java");
        checkbox.setBounds(20,120,50,30);

        Checkbox checkbox1 = new Checkbox("Advanced Java");
        checkbox1.setBounds(20,150,100,30);

        frame.add(checkbox1);
        frame.add(checkbox);

        frame.setSize(700,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
      Create_Checkbox object = new Create_Checkbox();
    }
}
