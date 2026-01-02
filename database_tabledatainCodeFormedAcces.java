import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class database_tabledatainCodeFormedAcces {
    public static void main(String[] args) {
        insertdata();
    }

    public static Connection getConnection(){
        try {
          String driver = "com.mysql.cj.jdbc.Driver";
          String databaseUrl = "jdbc:mysql://localhost:3307/java_ct";
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
            int result = statement.executeUpdate("insert into frinds (id,Frinds_listcol,Phone_no) values(3,'Diksha',8765235680)");
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

