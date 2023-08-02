package apex.servlets;
import java.io.FileWriter;
import java.io.BufferedWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
     // Validate inputs
        boolean isValid = true;
        if (email.isEmpty() || !email.matches("[\\w\\.-]+@[\\w\\.-]+\\.[\\w]+")) {
            isValid = false;
        }
        if (phone.isEmpty() || !phone.matches("\\d{10}")) {
            isValid = false;
        }
        if (username.isEmpty() || password.isEmpty()) {
            isValid = false;
        }
        
     // Verify if user exists
        if (isUserExists(username)) {
            response.getWriter().println("Username already exists. Please choose a different username.");
            return;
        }
        
        if (isValid) {
            // Save the information in a text file
        	try {
        	    FileWriter writer = new FileWriter("/Users/tcs/Documents/registration.txt", true);
        	    BufferedWriter out = new BufferedWriter(writer);
        	    out.write("Email: " + email);
        	    out.write("Phone: " + phone);
        	    out.write("Username: " + username);
        	    out.write("Password: " + password);
        	    out.close();
        	} catch (IOException e) {
        	    e.printStackTrace();
        	}
            response.getWriter().println("Registration successful!");
        } else {
            response.getWriter().println("Invalid input! Please fill all the fields correctly.");
        }
        
        
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private boolean isUserExists(String username) {
        try (BufferedReader reader = new BufferedReader(new FileReader("/Users/tcs/Documents/registration.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
            	if (line.contains(username)) {
                    return true; // Username exists in the file
                }
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

}
