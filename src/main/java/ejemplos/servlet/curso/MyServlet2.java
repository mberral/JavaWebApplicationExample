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

		// Obtenemos los parámetros del formulario
		String nombre = request.getParameter("fNombre");
		String apellidos = request.getParameter("fApellidos");

		// Añadimos los parámetros como atributos en la solicitud
		request.setAttribute("fNombre", nombre);
		request.setAttribute("fApellidos", apellidos);

		// Redireccionar a resultado.jsp
		request.getRequestDispatcher("/registered.jsp").forward(request, response);
	}

}