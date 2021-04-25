package test;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBUtil {
private static String url="jdbc:mysql://localhost:3306/test?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
public Connection getConnection() throws SQLException,Exception {
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn= DriverManager.getConnection(url,"root","123456");
    return conn;
}
}
