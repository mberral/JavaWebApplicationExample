package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// send HTML page to client
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Libro de visitas</title>");
		out.println("<style>");
		out.println("html { background: rgb(2,0,36); background: linear-gradient(0deg, rgba(2,0,36,1) 0%, rgba(9,9,121,1) 35%, rgba(0,212,255,1) 100%); }");
		out.println("body { font-family: Arial; width: 600px; margin: 80px auto; }");
		out.println("header { text-align: center; color: white; }");
		out.println("div { border-radius: 15px; background-color: silver; padding: 20px; }");
		out.println("input { width: 100%; padding: 12px; margin: 8px 0; display: inline-block; border: 1px solid #ccc; border-radius: 4px; box-sizing: border-box; }");
		out.println("input[type=submit] { background-color: #00CC00; width: 100px; color: #fff; }");
		out.println("input[type=submit]:hover { background-color: #33CC00; border-color: #33CC33; color: #f4f6f7; }");
		out.println("input[type=reset] { background-color: #fff; border-color: #dadce0; color: #1a73e8; width: 100px; }");
		out.println("input[type=reset]:hover { background-color: #f6f9fe; border-color: #1a73e8; color: #174ea6; }");
		out.println("</style>");
		out.println("</head>");
		out.println("<body>");
		out.println("<header>");
		out.println("<h1>¡Bienvenido/a al libro de visitas!</h1>");
		out.println("<p>Deja tu visita registrada</p>");
		out.println("</header>");
		out.println("<br>");
		out.println("<br>");
		out.println("<div>");
		out.println("<form action=\"/myServlet2\">");
		out.println("<label for=\"fNombre\">Nombre:</label> <br>");
		out.println("<input type=\"text\" id=\"fNombre\" name=\"fNombre\">");
		out.println("<br>");
		out.println("<br>");
		out.println("<label for=\"fApellidos\">Apellidos:</label><br>");
		out.println("<input type=\"text\" id=\"fApellidos\" name=\"fApellidos\">");
		out.println("<br>");
		out.println("<br>");
		out.println("<input type=\"submit\" value=\"FIRMAR\"> <input type=\"reset\" value=\"BORRAR\">");
		out.println("</form>");
		out.println("</div>");
		out.println("</body>");
		out.println("</html>");
	}

}