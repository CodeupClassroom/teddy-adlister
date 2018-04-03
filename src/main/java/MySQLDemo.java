import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
     * 1. Employees query example
     * 2. Employee Model
     * 3. instead of sout, create a List of Employees
     * 4. Hide passwords
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

            // call this pass the results to jsp
            // in the jsp loop through and create html
            for(Employee emp : employeesExample()) {
                System.out.printf("emp_no: %s - name: %s, %s\n", emp.getEmpNo(), emp.getLastName(), emp.getFirstName());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    private static List<Employee> employeesExample() throws SQLException {
        // 1. Create an empty list
        List<Employee> employees = new ArrayList<>();

        // 2. Run a query
        Statement stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM employees LIMIT 10");

        // 3. loop through the query results
        //    queryresult -> employee object
        while( rs.next() ){
            // 4. Create an employee object and add it to the list
            Employee employee = new Employee();
            employee.setEmpNo(rs.getString("emp_no"));
            employee.setFirstName(rs.getString("first_name"));
            employee.setLastName(rs.getString("last_name"));
            // 5. Set the properties based on the query results
            employees.add(employee);
        }

        return employees;
    }
}
