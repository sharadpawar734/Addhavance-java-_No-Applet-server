//import java.sql.*;
//import java.sql.DriverManager;
//import java.sql.Statement;
//import java.sql.*;
//
//public class db_del {
//    public static void main(String[] args) {
////        deleteRecord();
//        insertdata();
//    }
//    public void connect(){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/student1","root","student");
//
//            Connection conn = DriverManager.getConnection(databaseUrl,userName,password);
//            System.out.println("Sucess");
//        }
//        catch (ClassNotFoundException ex){
//            ex.printStackTrace();
////        }
//        catch (Exception ex){
//            ex.printStackTrace();
//        }
//    }
//    public static  void insertdata(){
//
//        try {
//            Statement statement = getConnection().createStatement();
//            int result = statement.executeUpdate("insert into users(id, name, email, phone, address, passwoed) values(1, 'Diksha', 'dj@1234', 987634987512, 'Pimpalgoan baswant' 'dj1234'");
//            System.out.println(result);
//            if (result == 1){
//                System.out.println("insert data");
//            }
//            else {
//                System.out.println("some error");
//            }
//        }
//        catch (Exception e){
//            System.out.println("error"+e);
//        }
//    }
//
//    public static void deleteRecord(){
//        try {
//            Statement statement = getConnection().createStatement();
//            int result = statement.executeUpdate("delate from user where id = 4");
//            if (result == 1){
//                System.out.println("Record Deleted");
//            } else {
//                System.out.println("No recorded delating");
//            }
//        }catch (Exception e){
//            System.out.println("Some error in deleting record" +e);
//        }
//    }
//}
