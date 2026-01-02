import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Practical7 extends JFrame implements ActionListener {

    private JLabel lblBookId, lblTitle, lblAuthor, lblGenre, lblPublication, lblPrice, lblIsbn;
    private JTextField tfBookId, tfTitle, tfAuthor, tfGenre, tfPublication, tfPrice, tfIsbn;
    private JButton btnAddToTable;
    private JTable bookTable;
    private DefaultTableModel tableModel;

    public Practical7() {
        setTitle("Book Information Entry");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


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

        btnAddToTable = new JButton("Add to Table");
        btnAddToTable.addActionListener(this);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("Book ID");
        tableModel.addColumn("Title");
        tableModel.addColumn("Author");
        tableModel.addColumn("Genre");
        tableModel.addColumn("Publication");
        tableModel.addColumn("Price");
        tableModel.addColumn("ISBN");

        bookTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(bookTable);


        JPanel inputPanel = new JPanel(new GridLayout(7, 2));
        inputPanel.add(lblBookId);
        inputPanel.add(tfBookId);
        inputPanel.add(lblTitle);
        inputPanel.add(tfTitle);
        inputPanel.add(lblAuthor);
        inputPanel.add(tfAuthor);
        inputPanel.add(lblGenre);
        inputPanel.add(tfGenre);
        inputPanel.add(lblPublication);
        inputPanel.add(tfPublication);
        inputPanel.add(lblPrice);
        inputPanel.add(tfPrice);
        inputPanel.add(lblIsbn);
        inputPanel.add(tfIsbn);


        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnAddToTable);


        add(inputPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);


        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAddToTable) {
            addToTable();
        }
    }

    private void addToTable() {

        String bookId = tfBookId.getText();
        String title = tfTitle.getText();
        String author = tfAuthor.getText();
        String genre = tfGenre.getText();
        String publication = tfPublication.getText();
        String price = tfPrice.getText();
        String isbn = tfIsbn.getText();


        tableModel.addRow(new Object[]{bookId, title, author, genre, publication, price, isbn});


        tfBookId.setText("");
        tfTitle.setText("");
        tfAuthor.setText("");
        tfGenre.setText("");
        tfPublication.setText("");
        tfPrice.setText("");
        tfIsbn.setText("");
    }

    public static void main(String[] args) {
        new Practical7();
    }
}
