package apex.servlets;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrderHistory
 */
@WebServlet("/OrderHistory")
public class OrderHistory extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public OrderHistory() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
String filePath = "/Users/tcs/Documents/orders.txt"; // Replace with the actual file path
        
        // Read the contents of the file
        String fileContents = readOrdersFile(filePath);
        
        // Set the file contents as an attribute in the request
        request.setAttribute("fileContents", fileContents);
        
        // Forward the request to the order-history.jsp page
        request.getRequestDispatcher("orderhistory.html").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private String readOrdersFile(String filePath) throws IOException {
        StringBuilder fileContents = new StringBuilder();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContents.append(line);
                fileContents.append("\n");
            }
        }
        
        return fileContents.toString();
    }

}
