import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Practical25 {
    public static void main(String[] args) {
        insertdata();
    }

    public static Connection getConnection(){
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String databaseUrl = "jdbc:mysql://localhost:3307/collage";
            String userName = "root";
            String password = "student";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(databaseUrl,userName,password);
            System.out.println("Database connected");
            return conn;
        }
        catch (Exception e){
            System.out.println("some error"+e);
        }
        return  null;
    }
    public static  void insertdata(){
        try {
            Statement statement = getConnection().createStatement();
            int result = statement.executeUpdate("insert into student (idstudent,enroll_no,sname,mobile_no,email) values(3,2966,'Shital',87778,'shital@45.Com')");
            System.out.println(result);
            if (result == 1){
                System.out.println("insert data");
            }
            else {
                System.out.println("some error");
            }
        }
        catch (Exception e){
            System.out.println("error"+e);
        }
    }

}
