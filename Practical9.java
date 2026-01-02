import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Practical9 extends JFrame implements ActionListener {

    private JLabel lblBookId, lblTitle, lblAuthor, lblGenre, lblPublication, lblPrice, lblIsbn;
    private JTextField tfBookId, tfTitle, tfAuthor, tfGenre, tfPublication, tfPrice, tfIsbn;
    private JButton btnSave;



    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/book_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "student";

    public Practical9() {
        setTitle("Book Information Entry");
        setSize(400, 300);
        setLayout(new GridLayout(8, 2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        lblBookId = new JLabel("Book ID:");
        lblTitle = new JLabel("Title:");
        lblAuthor = new JLabel("Author:");
        lblGenre = new JLabel("Genre:");
        lblPublication = new JLabel("Publication:");
        lblPrice = new JLabel("Price:");
        lblIsbn = new JLabel("ISBN:");

        tfBookId = new JTextField();
        tfTitle = new JTextField();
        tfAuthor = new JTextField();
        tfGenre = new JTextField();
        tfPublication = new JTextField();
        tfPrice = new JTextField();
        tfIsbn = new JTextField();

        btnSave = new JButton("Save");
        btnSave.addActionListener(this);


        add(lblBookId);
        add(tfBookId);
        add(lblTitle);
        add(tfTitle);
        add(lblAuthor);
        add(tfAuthor);
        add(lblGenre);
        add(tfGenre);
        add(lblPublication);
        add(tfPublication);
        add(lblPrice);
        add(tfPrice);
        add(lblIsbn);
        add(tfIsbn);
        add(new JLabel());
        add(btnSave);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnSave) {
            saveBookInformation();
        }
    }

    private void saveBookInformation() {
        try {
            String bookId = tfBookId.getText();
            String title = tfTitle.getText();
            String author = tfAuthor.getText();
            String genre = tfGenre.getText();
            String publication = tfPublication.getText();
            String price = tfPrice.getText();
            String isbn = tfIsbn.getText();


            try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
                String query = "INSERT INTO books (bookid, title, author, genre, publication, price, isbn) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setString(1, bookId);
                    preparedStatement.setString(2, title);
                    preparedStatement.setString(3, author);
                    preparedStatement.setString(4, genre);
                    preparedStatement.setString(5, publication);
                    preparedStatement.setString(6, price);
                    preparedStatement.setString(7, isbn);


                    int rowsAffected = preparedStatement.executeUpdate();

                    if (rowsAffected > 0) {
                        JOptionPane.showMessageDialog(this, "Book information saved to the database!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Error: Unable to save book information to the database.");
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Unable to connect to the database.");
        }
    }

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: Unable to load JDBC driver.");
            System.exit(1);
        }

        new Practical9();

    }
}
