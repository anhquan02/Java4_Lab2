import java.io.IOException;
import java.lang.reflect.Parameter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DangKyServlet")
public class DangKyServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/views/dang-ky/form.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		boolean gender = Boolean.parseBoolean(req.getParameter("gender"));
		boolean married =(req.getParameter("married")!=null);
		String country = req.getParameter("country");	
		req.setAttribute("param.username", username);
		req.setAttribute("param.password", password);
		req.setAttribute("param.gender", gender);
		req.setAttribute("param.married", married);
		req.setAttribute("param.country", country);
		
		req.getRequestDispatcher("/views/dang-ky/result.jsp").forward(req, resp);
	}
}
