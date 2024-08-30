package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Servlet implementation class Register
 */

//@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/userdb";
    private static final String JDBC_USERNAME = "root";  
    private static final String JDBC_PASSWORD = "P7028460201p$";  
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("first");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String dob = request.getParameter("date");
        String gender = request.getParameter("gender");

        response.setContentType("text/html");
        
        try (PrintWriter out = response.getWriter()) {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
                 PreparedStatement statement = conn.prepareStatement(
                         "INSERT INTO register (username, password, email, address, dob, gender) VALUES (?, ?, ?, ?, ?, ?)")) {

                
                
                statement.setString(1, username);
                statement.setString(2, password); 
                statement.setString(3, email);
                statement.setString(4, address);
                statement.setString(5, dob);
                statement.setString(6, gender);

                int rowsInserted = statement.executeUpdate();
                if (rowsInserted > 0) {
                    out.println("<h2>Registration successful!</h2>");
                } else {
                    out.println("<h2>Registration failed. Please try again.</h2>");
                }
            } catch (SQLException e) {
                e.printStackTrace();
                out.println("<h2>Error with database operation</h2>");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            response.getWriter().println("<h2>Error loading JDBC Driver</h2>");
        }
    }
	
	}

