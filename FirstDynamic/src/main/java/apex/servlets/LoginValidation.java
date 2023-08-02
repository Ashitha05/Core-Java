package apex.servlets;

import java.io.BufferedReader;
import javax.servlet.http.HttpSession;
import java.io.FileReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginValidation
 */
@WebServlet("/LoginValidation")
public class LoginValidation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (isUserExists(username)) {
        	  // Get the session object for the user
        	HttpSession session = request.getSession();
            
            // Set an attribute in the session to identify the user
            session.setAttribute("username", username);
        	request.getRequestDispatcher("/Homepage.html").forward(request, response);
        } 
        
        else {
        	response.getWriter().println("User doesnot exist");
        }

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
