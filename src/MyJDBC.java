import java.sql.*;

public class MyJDBC {
    static String username = "root";
    static String password = "b36ygopy";
    static String dbUrl = "jdbc:mysql://localhost:3306/abo-speise";


    public Connection getConnection() throws SQLException {
        return (Connection) DriverManager.getConnection(dbUrl,username,password);
    }

    public void showError (SQLException exception){
        System.out.println("Error: "+exception.getMessage());
        System.out.println("Error Code: "+exception.getErrorCode());
    }

}