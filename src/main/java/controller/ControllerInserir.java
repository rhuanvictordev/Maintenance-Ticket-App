package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Chamado;
import model.ChamadoDAO;


@WebServlet({"/novoChamado"})
public class ControllerInserir extends HttpServlet {
  private static final long serialVersionUID = 1L;
  
  Chamado chamado = new Chamado();
  
  ChamadoDAO chamadoDAO = new ChamadoDAO();
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String action = request.getServletPath();
    System.out.println(action);
    if (action.equals("/novoChamado"))
      novoChamado(request, response); 
  }
  
  protected void novoChamado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    LocalDate dataAtual = LocalDate.now();
    DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String dataFormatada = dataAtual.format(formatoData);
    LocalTime horaAtual = LocalTime.now();
    DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
    String horaFormatada = horaAtual.format(formatoHora);
    this.chamado.setSetor(request.getParameter("setor"));
    this.chamado.setEquipamento("");
    this.chamado.setMotivo("");
    this.chamado.setTipo("");
    this.chamado.setCausa("");
    this.chamado.setDescricao(request.getParameter("descricao"));
    this.chamado.setEvitado("");
    this.chamado.setObservacao("");
    this.chamado.setDataocorrencia(dataFormatada);
    this.chamado.setHoraocorrencia(horaFormatada);
    this.chamado.setDatainicio("");
    this.chamado.setHorainicio("");
    this.chamado.setDatatermino("");
    this.chamado.setHoratermino("");
    this.chamado.setOperador("");
    this.chamado.setTecnico("");
    this.chamadoDAO.inserirChamado(this.chamado);
    response.sendRedirect("home.html");
  }
}