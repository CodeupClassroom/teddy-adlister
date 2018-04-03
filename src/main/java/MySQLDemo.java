import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class MySQLDemo {

    private static Connection connection = null;

    public static void simpleExample() throws SQLException {
        // 2. Create statements
        Statement stmt = connection.createStatement();
        // 3. Save the results of the query in a Result set
        ResultSet rs = stmt.executeQuery("SELECT 1+1 as result");
        // 4. Move the cursor of the DB to the next (first) result
        rs.next();
        // 5. Print the value
        System.out.println("rs = " + rs.getInt(1));


        // More than 1 result at the time
        ResultSet users = stmt.executeQuery("SELECT * from users");
        // 5. Print the values
        while(users.next()){
            // while.next() Moves the cursor to the next result and tells you if there was a result; (true ,false)
            System.out.println("users.getString(\"name\") = " + users.getString("name"));
        }
    }

    /**
     * 1. Employees example
     */
    public static void main(String[] args) {

        // 1st step is to connect to the MySQL server
        try {
            DriverManager.registerDriver(new Driver());

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/employees?serverTimezone=UTC&useSSL=false",
                    "root",
                    "codeup"
            );

            System.out.println("\n--- simpleExample ---\n");

//            simpleExample();

            System.out.println("\n--- employeesExample ---\n");

            employeesExample();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    private static void employeesExample() throws SQLException {

        Statement stmt = connection.createStatement();
        System.out.println(stmt);

        ResultSet rs = stmt.executeQuery("SELECT * FROM employees LIMIT 10");
        System.out.println(rs);

        while( rs.next() ){
            
        }
    }
}
