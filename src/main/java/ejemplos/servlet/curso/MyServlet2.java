package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String fNombre = request.getParameter("fNombre");
		String fApellidos = request.getParameter("fApellidos");

		// send HTML page to client
		out.println("<html>");
		out.println("<head>");
		out.println("<title>¡Gracias por tu visita!</title>");
		out.println("<style>");
		out.println("html { background: rgb(2,0,36); background: linear-gradient(0deg, rgba(2,0,36,1) 0%, rgba(9,9,121,1) 35%, rgba(0,212,255,1) 100%); }");
		out.println("body { font-family: Arial; width: 600px; margin: 80px auto; color: #fff }");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Tu visita se ha registrado " + fNombre + " " + fApellidos + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}

}