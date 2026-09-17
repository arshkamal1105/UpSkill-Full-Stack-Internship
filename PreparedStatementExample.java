import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
        PreparedStatement pstmt = con.prepareStatement("SELECT * FROM students WHERE id = ?");
        pstmt.setInt(1, 1);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) System.out.println(rs.getInt("id") + " " + rs.getString("name"));
        rs.close(); pstmt.close(); con.close();
    }
}
