import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class DB_Student2 {
    public static void main(String[] args) {
        insertdata();
    }

    public static Connection getConnection(){
        try {
            String driver = "com.mysql.cj.jdbc.Driver";
            String databaseUrl = "jdbc:mysql://localhost:3307/quiz";
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
            int result = statement.executeUpdate("insert into student(id, student_name, branch, Subject, TYCO) values(2,'Shital', 'CO', 'C', 'FYCO')");
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

