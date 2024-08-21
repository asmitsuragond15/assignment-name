package demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Year;
import java.util.Scanner;

public class SimpleJDBCConnection {

    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/userdb";
        String jdbcUsername = "root";
        String jdbcPassword = "P7028460201p$";

        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);

            if (connection != null) {
                System.out.println("Connection to the database was successful!");
                Scanner scanner=new Scanner(System.in);
//                int a;
//                String s;
//                System.out.println("Enter the id of student");
//                a=scanner.nextInt();
//                scanner.nextLine();
//                System.out.println("Enter the name of student");
//                s=scanner.nextLine();
//                System.out.println(s);
                
                
//                createRecord(connection, a, s);
//                readRecord(connection);
//                updateRecord(connection, 15, "Asmit Suragond");
//                deleteRecord(connection, 15);
//                readRecord(connection);
                int i=1;
                do {
                int a,c,d;
                String s,s1;
                System.out.println("Enter 1 for create");
                System.out.println("Enter 2 for read");
                System.out.println("Enter 3 for update");
                System.out.println("Enter 4 for delete");
                System.out.println("Enter 5 for exit");
                
                int key=scanner.nextInt();
              
               
                	switch (key) {
    				case 1:
    					
    					System.out.println("Enter the id of employee");
    	                a=scanner.nextInt();
    	                scanner.nextLine();
    	                System.out.println("Enter the name of employee");
    	                s=scanner.nextLine();
    	          
    					createRecord(connection, a, s);
    					break;
    				case 2:
    					 readRecord(connection);
    					break;
    				case 3:
    				    System.out.println("Enter the employee number");
    	                c=scanner.nextInt();
    	                scanner.nextLine();
    	                System.out.println("Enter the changed name");
    	                 s1=scanner.nextLine();
    					 updateRecord(connection, c, s1);
    					break;
    				case 4:
    					System.out.println("Enter the employee number");
    	                 d=scanner.nextInt();
    					 deleteRecord(connection, d);
    					break;
    				case 5:
    					System.out.print("Exited the Program");
    					System.exit(0);
    				default:
    					System.out.println("Invalid Choice");
    				}
                	
                  
				}while (i>0 );
                
                
            }

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        } finally {
            // Close the connection
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (SQLException e) {
                System.out.println("Failed to close the connection.");
                e.printStackTrace();
            }
        }
    }

    private static void createRecord(Connection connection, int employeeNumber, String lastName) throws SQLException {
        String sql = "INSERT INTO employees (employeeNumber, lastName) VALUES (?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, employeeNumber);
            pstmt.setString(2, lastName);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Rows inserted: " + rowsAffected);
        }
    }

    private static void readRecord(Connection connection) throws SQLException {
        String sql = "SELECT * FROM employees";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int employeeNumber = rs.getInt("employeeNumber");
                String lastName = rs.getString("lastName");
                System.out.println("Employee Number: " + employeeNumber + ", Last Name: " + lastName);
            }
        }
    }

    private static void updateRecord(Connection connection, int employeeNumber, String newLastName) throws SQLException {
        String sql = "UPDATE employees SET lastName = ? WHERE employeeNumber = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, newLastName);
            pstmt.setInt(2, employeeNumber);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Rows updated: " + rowsAffected);
        }
    }

    private static void deleteRecord(Connection connection, int employeeNumber) throws SQLException {
        String sql = "DELETE FROM employees WHERE employeeNumber = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setInt(1, employeeNumber);
            int rowsAffected = pstmt.executeUpdate();
            System.out.println("Rows deleted: " + rowsAffected);
        }
    }
}
