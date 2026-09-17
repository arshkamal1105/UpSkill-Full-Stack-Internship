import java.sql.*;

public class CallableStatementExample {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "password");
        CallableStatement cstmt = con.prepareCall("{call get_students()}");
        cstmt.execute();
        cstmt.close(); con.close();
    }
}
