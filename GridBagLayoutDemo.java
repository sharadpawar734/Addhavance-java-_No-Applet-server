import java.awt.*;
import java.awt.event.*;
class GridBagLayoutDemo extends Frame {
    GridBagConstraints con;
    Label lbName, lbEmail, lbMobileNo, lbAddress;
    TextField tfName, tfEmail, tfMobileNo;
    TextArea taAddress;
    Button btnSubmit;
    int width = 450, height = 200;
    GridBagLayoutDemo() {
        super();
        this.setTitle("Grid Bag Layout Demo");
        this.setLayout(new GridBagLayout());
        GridBagConstraints con = new GridBagConstraints();
        this.lbName = new Label("Students Name: ");
        setConstraints(con, 0, 0, 1, 1);
        this.add(this.lbName, con);
        this.tfName = new TextField(20);
        setConstraints(con, 1, 0, 3, 1);
        this.add(this.tfName, con);
        this.lbEmail = new Label("Email: ");
        setConstraints(con, 0, 1, 1, 1);
        this.add(this.lbEmail, con);
        this.tfEmail = new TextField(10);
        setConstraints(con, 1, 1, 1, 1);
        this.add(this.tfEmail, con);
        this.lbMobileNo = new Label("Mobile No: ");
        setConstraints(con, 2, 1, 1, 1);
        this.add(this.lbMobileNo, con);
        this.tfMobileNo = new TextField(10);
        setConstraints(con, 3, 1, 1, 1);
        this.add(this.tfMobileNo, con);
        this.lbAddress = new Label("Address: ");
        setConstraints(con, 0, 2, 1, 1);
        this.add(this.lbAddress, con);

        this.taAddress = new TextArea(2, 20);
        setConstraints(con, 1, 2, 3, 1);
        this.add(this.taAddress, con);
        this.btnSubmit = new Button("Submit Information");
        setConstraints(con, 1, 3, 1, 1);
        this.add(this.btnSubmit, con);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            }
        });
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int)(screenSize.width - this.width)/2;
        int y = (int)(screenSize.height - this.height)/2;
        this.setLocation(x, y);
        this.setSize(this.width, this.height);
        this.setResizable(false);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new GridBagLayoutDemo();
    }
    public void setConstraints(GridBagConstraints con,

                               int x, int y, int w, int h) {

        con.fill = GridBagConstraints.HORIZONTAL;
        con.gridx = x;
        con.gridy = y;
        con.gridwidth = w;
        con.gridheight = h;
        con.ipadx = 0;
        con.ipady = 0;
        con.weightx = 0;
        con.weighty = 0.5;
    }
}