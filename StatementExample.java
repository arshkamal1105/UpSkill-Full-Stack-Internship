import java.sql.*;

public class StatementExample {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM students");
        while (rs.next()) System.out.println(rs.getInt("id") + " " + rs.getString("name"));
        rs.close(); stmt.close(); con.close();
    }
}
