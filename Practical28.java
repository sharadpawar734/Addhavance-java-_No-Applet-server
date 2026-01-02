import java.sql.*;

public class Practical28 {
    Connection con = null;
    Statement stmt = null;

    public void databaseOperation() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/collage",
                    "root", "student");
            stmt = con.createStatement();




            String deleteQuery = "DELETE FROM student WHERE idstudent = 2";


            int deleteResult = stmt.executeUpdate(deleteQuery);


            if (deleteResult == 1) {
                System.out.println("One record deleted from student table.");
            }

            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());

        }
    }

    public static void main(String[] args) {
        Practical28 ogrw = new Practical28();
        ogrw.databaseOperation();
    }
}


