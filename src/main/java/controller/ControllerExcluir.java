package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Chamado;
import model.ChamadoDAO;

import java.io.IOException;


@WebServlet({"/ControllerExcluir", "/excluirChamado"})
public class ControllerExcluir extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	 Chamado chamado = new Chamado();
	 ChamadoDAO chamadoDAO = new ChamadoDAO();
    
    

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
	    System.out.println(action);
	    if (action.equals("/excluirChamado")) {
	    	excluirChamado(request, response);
	    } else {
	    	response.sendRedirect("home.html");
	    }
		

	}
	
	public void excluirChamado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		chamado.setId(id);
		chamadoDAO.excluirChamado(chamado);
		response.sendRedirect("listarChamados");
	}
	
}
