import java.sql.*;

public class Practical27 {
    Connection con = null;
    Statement stmt = null;

    public void databaseOperation() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3307/collage",
                    "root", "student");
            stmt = con.createStatement();


            String updateQuery = "UPDATE student SET " +
                    "enroll_no = 1000 " +
                    "WHERE idstudent = 1";

            String deleteQuery = "DELETE FROM student WHERE idstudent = 1";

            int updateResult = stmt.executeUpdate(updateQuery);


            if (updateResult == 1) {
                System.out.println("One record updated in the student table.");
            }


            stmt.close();
            con.close();
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());

        }
    }

    public static void main(String[] args) {
        Practical27 ogrw = new Practical27();
        ogrw.databaseOperation();
    }
}


