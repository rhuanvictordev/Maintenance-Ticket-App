package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ChamadoDAO {
	
	private String driver = "com.mysql.cj.jdbc.Driver";
	  
	  private String url = "jdbc:mysql://127.0.0.1:3306/manutencao?useTimezone=true&serverTimezone=UTC";
	  
	  private String user = "root";
	  
	  private String password = "root";
	  
	  private Connection conectar() {
	    Connection con = null;
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      con = DriverManager.getConnection(this.url, this.user, this.password);
	      return con;
	    } catch (Exception e) {
	      System.out.println(e);
	      return null;
	    } 
	  }
	  
	  public void inserirChamado(Chamado chamado) {
	    String create = "insert into chamados (setor, equipamento, motivo, tipo, causa, descricao, evitado, observacao, dataocorrencia, horaocorrencia, datainicio, horainicio, datatermino, horatermino, operador, tecnico) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	    try {
	      Connection con = conectar();
	      PreparedStatement pst = con.prepareStatement(create);
	      pst.setString(1, chamado.getSetor());
	      pst.setString(2, chamado.getEquipamento());
	      pst.setString(3, chamado.getMotivo());
	      pst.setString(4, chamado.getTipo());
	      pst.setString(5, chamado.getCausa());
	      pst.setString(6, chamado.getDescricao());
	      pst.setString(7, chamado.getEvitado());
	      pst.setString(8, chamado.getObservacao());
	      pst.setString(9, chamado.getDataocorrencia());
	      pst.setString(10, chamado.getHoraocorrencia());
	      pst.setString(11, chamado.getDatainicio());
	      pst.setString(12, chamado.getHorainicio());
	      pst.setString(13, chamado.getDatatermino());
	      pst.setString(14, chamado.getHoratermino());
	      pst.setString(15, chamado.getOperador());
	      pst.setString(16, chamado.getTecnico());
	      pst.executeUpdate();
	      con.close();
	    } catch (Exception e) {
	      System.out.println(e);
	    } 
	  }
	  
	  public ArrayList<Chamado> listarChamados() {
	    ArrayList<Chamado> chamados = new ArrayList<>();
	    String read = "select * from chamados order by id";
	    try {
	      Connection con = conectar();
	      PreparedStatement pst = con.prepareStatement(read);
	      ResultSet rs = pst.executeQuery();
	      while (rs.next()) {
	        String id = rs.getString(1);
	        String setor = rs.getString(2);
	        String equipamento = rs.getString(3);
	        String motivo = rs.getString(4);
	        String tipo = rs.getString(5);
	        String causa = rs.getString(6);
	        String descricao = rs.getString(7);
	        String evitado = rs.getString(8);
	        String observacao = rs.getString(9);
	        String dataocorrencia = rs.getString(10);
	        String horaocorrencia = rs.getString(11);
	        String datainicio = rs.getString(12);
	        String horainicio = rs.getString(13);
	        String datatermino = rs.getString(14);
	        String horatermino = rs.getString(15);
	        String operador = rs.getString(16);
	        String tecnico = rs.getString(17);
	        chamados.add(new Chamado(id, setor, equipamento, motivo, tipo, causa, descricao, evitado, observacao, 
	              dataocorrencia, horaocorrencia, datainicio, horainicio, datatermino, horatermino, operador, 
	              tecnico));
	      } 
	      con.close();
	      return chamados;
	    } catch (Exception e) {
	      System.out.println(e);
	      return null;
	    } 
	  }
	  
	  public void selecionarChamado(Chamado chamado) {
	    String read2 = "select * from chamados where id=?";
	    try {
	      Connection con = conectar();
	      PreparedStatement pst = con.prepareStatement(read2);
	      pst.setString(1, chamado.getId());
	      ResultSet rs = pst.executeQuery();
	      while (rs.next()) {
	        chamado.setId(rs.getString(1));
	        chamado.setSetor(rs.getString(2));
	        chamado.setEquipamento(rs.getString(3));
	        chamado.setMotivo(rs.getString(4));
	        chamado.setTipo(rs.getString(5));
	        chamado.setCausa(rs.getString(6));
	        chamado.setDescricao(rs.getString(7));
	        chamado.setEvitado(rs.getString(8));
	        chamado.setObservacao(rs.getString(9));
	        chamado.setDataocorrencia(rs.getString(10));
	        chamado.setHoraocorrencia(rs.getString(11));
	        chamado.setDatainicio(rs.getString(12));
	        chamado.setHorainicio(rs.getString(13));
	        chamado.setDatatermino(rs.getString(14));
	        chamado.setHoratermino(rs.getString(15));
	        chamado.setOperador(rs.getString(16));
	        chamado.setTecnico(rs.getString(17));
	      } 
	      con.close();
	    } catch (Exception e) {
	      System.out.println(e);
	    } 
	  }
	  
	  public void alterarChamado(Chamado chamado) {
	    String update = "update chamados set setor=?, equipamento=?, motivo=?, tipo=?, causa=?, descricao=?, evitado=?, observacao=?, dataocorrencia=?, horaocorrencia=?, datainicio=?, horainicio=?, datatermino=?, horatermino=?, operador=?, tecnico=? where id = ?";
	    try {
	      Connection con = conectar();
	      PreparedStatement pst = con.prepareStatement(update);
	      pst.setString(1, chamado.getSetor());
	      pst.setString(2, chamado.getEquipamento());
	      pst.setString(3, chamado.getMotivo());
	      pst.setString(4, chamado.getTipo());
	      pst.setString(5, chamado.getCausa());
	      pst.setString(6, chamado.getDescricao());
	      pst.setString(7, chamado.getEvitado());
	      pst.setString(8, chamado.getObservacao());
	      pst.setString(9, chamado.getDataocorrencia());
	      pst.setString(10, chamado.getHoraocorrencia());
	      pst.setString(11, chamado.getDatainicio());
	      pst.setString(12, chamado.getHorainicio());
	      pst.setString(13, chamado.getDatatermino());
	      pst.setString(14, chamado.getHoratermino());
	      pst.setString(15, chamado.getOperador());
	      pst.setString(16, chamado.getTecnico());
	      pst.setString(17, chamado.getId());
	      pst.executeUpdate();
	      con.close();
	    } catch (Exception e) {
	      System.out.println(e);
	    } 
	  }
	  
	  public void excluirChamado(Chamado chamado) {
		  String delete = "DELETE FROM chamados WHERE id = ?";
		  try {
			
			  Connection con = conectar();
			  PreparedStatement pst = con.prepareStatement(delete);
			  
			  int number = Integer.parseInt(chamado.getId());
			  pst.setInt(1, number);
			 
			  pst.executeUpdate();
			  con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	  }
	}


