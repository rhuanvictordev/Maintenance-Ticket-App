package controller;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Chamado;
import model.ChamadoDAO;


@WebServlet({"/listarChamados"})
public class ControllerListar extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  Chamado chamado = new Chamado();
  
  ChamadoDAO chamadoDAO = new ChamadoDAO();
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getServletPath();
    System.out.println(action);
    if (action.equals("/listarChamados"))
      listarChamados(request, response); 
  }
  
  protected void listarChamados(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    ArrayList<Chamado> lista = this.chamadoDAO.listarChamados();
    request.setAttribute("chamados", lista);
    RequestDispatcher rd = request.getRequestDispatcher("chamados.jsp");
    rd.forward((ServletRequest)request, (ServletResponse)response);
  }
}
