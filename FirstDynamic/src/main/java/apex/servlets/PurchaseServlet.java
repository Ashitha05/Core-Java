package apex.servlets;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class PurchaseServlet
 */
@WebServlet("/PurchaseServlet")
public class PurchaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PurchaseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
        String username = (String) session.getAttribute("username");
        String orders = request.getParameter("orders");

        // Save the username and orders to the orders.txt file
        saveToOrdersFile(username, orders);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	private void saveToOrdersFile(String username, String orders) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/tcs/Documents/orders.txt", true))) {
            writer.write("Username: " + username + "\n");
            writer.write("Orders: " + orders + "\n");
            writer.write("-----------------------------\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
