package apex.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MathsServlet
 */
@WebServlet("/MathsServlet")
public class MathsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<h2> This is the new servlet</h2> ");
		String param1=request.getParameter("val1");
		Integer arg1=Integer.parseInt(param1);
		response.getWriter().append("The square is :"+ arg1*arg1);
	}

}
