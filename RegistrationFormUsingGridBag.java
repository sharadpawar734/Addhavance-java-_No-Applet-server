import java.awt.*;
import java.awt.event.*;
class RegistrationFormUsingGridBag extends Frame {
    GridBagConstraints con;
    Label lbName, lbAge, lbAddress, lbMobile, lbEmail, lbDesignation;
    TextField tfName, tfAge, tfAddress, tfMobile, tfDesignation,tfEmail;
    Button btnSubmit;
    RegistrationFormUsingGridBag() {
        super();
        this.setTitle("Grid Bag Layout Demo");
        this.setLayout(new GridBagLayout());
        this.setSize(450,200);
        GridBagConstraints con = new GridBagConstraints();

        this.lbName=new Label("Name");
        setConstraints(con, 0,0,1,1);
        this.add(this.lbName, con);

        this.tfName=new TextField();
        setConstraints(con, 1,0,1,1);
        this.add(this.tfName, con);


        this.lbAge=new Label("Source");
        setConstraints(con, 0,1,1,1);
        this.add(this.lbAge,con);

        this.tfAge=new TextField(10);
        setConstraints(con, 1,1,1,1 );
        this.add(this.tfAge, con);

        this.lbAddress=new Label("Destination ");
        setConstraints(con, 2,1,1,1);
        this.add(this.lbAddress, con);

        this.tfAddress=new TextField(10);
        setConstraints(con, 3,1,1,1);
        this.add(this.tfAddress, con);

        this.lbMobile = new Label("Mobile No: ");
        setConstraints(con, 0, 2, 1, 1);
        this.add(this.lbMobile, con);

        this.tfMobile=new TextField(10);
        setConstraints(con, 1,2,1,1);
        this.add(this.tfMobile, con);

        this.lbEmail=new Label(" ");
        setConstraints(con, 2,2,1,1);
        this.add(this.lbEmail , con);

        this.tfEmail=new TextField(5);
        setConstraints(con, 3,2,3,1);
        this.add(this.tfEmail, con);

        this.btnSubmit=new Button("Submit");
        setConstraints(con,2,3,1,1);
        this.add(this.btnSubmit,con);

        this.lbDesignation=new Label("Designation");
        setConstraints(con,0,4,1,1 );
        this.add(this.lbDesignation, con);

        this.tfDesignation=new TextField();
        setConstraints(con, 1,4,1,1);
        this.add(this.tfDesignation, con);

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
                System.exit(0);
            } });
        this.setResizable(true);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        RegistrationFormUsingGridBag RFUG = new RegistrationFormUsingGridBag();
    }
    public void setConstraints(GridBagConstraints con,
                               int x, int y, int w, int h) {
        con.fill = GridBagConstraints.HORIZONTAL;
        con.gridx = x; con.gridy = y; con.gridwidth = w; con.gridheight = h; con.ipadx
                = 0;con.ipady = 0;
        con.weightx = 0; con.weighty = 0.5;
    } }
