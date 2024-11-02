package controller;

import java.io.IOException;

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


@WebServlet({"/listarChamado", "/editarChamado"})
public class ControllerEditar extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  Chamado chamado = new Chamado();
  
  ChamadoDAO chamadoDAO = new ChamadoDAO();
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getServletPath();
    System.out.println(action);
    if (action.equals("/listarChamado")) {
      listarChamado(request, response);
    } else if (action.equals("/editarChamado")) {
      editarChamado(request, response);
    } 
  }
  
  protected void listarChamado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String id = request.getParameter("id");
    this.chamado.setId(id);
    this.chamadoDAO.selecionarChamado(this.chamado);
    request.setAttribute("id", this.chamado.getId());
    request.setAttribute("setor", this.chamado.getSetor());
    request.setAttribute("equipamento", this.chamado.getEquipamento());
    request.setAttribute("motivo", this.chamado.getMotivo());
    request.setAttribute("tipo", this.chamado.getTipo());
    request.setAttribute("causa", this.chamado.getCausa());
    request.setAttribute("descricao", this.chamado.getDescricao());
    request.setAttribute("evitado", this.chamado.getEvitado());
    request.setAttribute("observacao", this.chamado.getObservacao());
    request.setAttribute("dataocorrencia", this.chamado.getDataocorrencia());
    request.setAttribute("horaocorrencia", this.chamado.getHoraocorrencia());
    request.setAttribute("datainicio", this.chamado.getDatainicio());
    request.setAttribute("horainicio", this.chamado.getHorainicio());
    request.setAttribute("datatermino", this.chamado.getDatatermino());
    request.setAttribute("horatermino", this.chamado.getHoratermino());
    request.setAttribute("operador", this.chamado.getOperador());
    request.setAttribute("tecnico", this.chamado.getTecnico());
    RequestDispatcher rd = request.getRequestDispatcher("editar.jsp");
    rd.forward((ServletRequest)request, (ServletResponse)response);
  }
  
  protected void editarChamado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    this.chamado.setId(request.getParameter("id"));
    this.chamado.setSetor(request.getParameter("setor"));
    this.chamado.setEquipamento(request.getParameter("equipamento"));
    this.chamado.setMotivo(request.getParameter("motivo"));
    this.chamado.setTipo(request.getParameter("tipo"));
    this.chamado.setCausa(request.getParameter("causa"));
    this.chamado.setDescricao(request.getParameter("descricao"));
    this.chamado.setEvitado(request.getParameter("evitado"));
    this.chamado.setObservacao(request.getParameter("observacao"));
    this.chamado.setDataocorrencia(request.getParameter("dataocorrencia"));
    this.chamado.setHoraocorrencia(request.getParameter("horaocorrencia"));
    this.chamado.setDatainicio(request.getParameter("datainicio"));
    this.chamado.setHorainicio(request.getParameter("horainicio"));
    this.chamado.setDatatermino(request.getParameter("datatermino"));
    this.chamado.setHoratermino(request.getParameter("horatermino"));
    this.chamado.setOperador(request.getParameter("operador"));
    this.chamado.setTecnico(request.getParameter("tecnico"));
    this.chamadoDAO.alterarChamado(this.chamado);
    response.sendRedirect("listarChamados");
  }
}
