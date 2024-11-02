package model;

public class Chamado {

	
	 private String id;
	  
	  private String setor;
	  
	  private String equipamento;
	  
	  private String motivo;
	  
	  private String tipo;
	  
	  private String causa;
	  
	  private String descricao;
	  
	  private String evitado;
	  
	  private String observacao;
	  
	  private String dataocorrencia;
	  
	  private String horaocorrencia;
	  
	  private String datainicio;
	  
	  private String horainicio;
	  
	  private String datatermino;
	  
	  private String horatermino;
	  
	  private String operador;
	  
	  private String tecnico;
	  
	  public Chamado() {}
	  
	  public Chamado(String id, String setor, String equipamento, String motivo, String tipo, String causa, String descricao, String evitado, String observacao, String dataocorrencia, String horaocorrencia, String datainicio, String horainicio, String datatermino, String horatermino, String operador, String tecnico) {
	    this.id = id;
	    this.setor = setor;
	    this.equipamento = equipamento;
	    this.motivo = motivo;
	    this.tipo = tipo;
	    this.causa = causa;
	    this.descricao = descricao;
	    this.evitado = evitado;
	    this.observacao = observacao;
	    this.dataocorrencia = dataocorrencia;
	    this.horaocorrencia = horaocorrencia;
	    this.datainicio = datainicio;
	    this.horainicio = horainicio;
	    this.datatermino = datatermino;
	    this.horatermino = horatermino;
	    this.operador = operador;
	    this.tecnico = tecnico;
	  }
	  
	  public String getId() {
	    return this.id;
	  }
	  
	  public void setId(String id) {
	    this.id = id;
	  }
	  
	  public String getSetor() {
	    return this.setor;
	  }
	  
	  public void setSetor(String setor) {
	    this.setor = setor;
	  }
	  
	  public String getEquipamento() {
	    return this.equipamento;
	  }
	  
	  public void setEquipamento(String equipamento) {
	    this.equipamento = equipamento;
	  }
	  
	  public String getMotivo() {
	    return this.motivo;
	  }
	  
	  public void setMotivo(String motivo) {
	    this.motivo = motivo;
	  }
	  
	  public String getTipo() {
	    return this.tipo;
	  }
	  
	  public void setTipo(String tipo) {
	    this.tipo = tipo;
	  }
	  
	  public String getCausa() {
	    return this.causa;
	  }
	  
	  public void setCausa(String causa) {
	    this.causa = causa;
	  }
	  
	  public String getDescricao() {
	    return this.descricao;
	  }
	  
	  public void setDescricao(String descricao) {
	    this.descricao = descricao;
	  }
	  
	  public String getEvitado() {
	    return this.evitado;
	  }
	  
	  public void setEvitado(String evitado) {
	    this.evitado = evitado;
	  }
	  
	  public String getObservacao() {
	    return this.observacao;
	  }
	  
	  public void setObservacao(String observacao) {
	    this.observacao = observacao;
	  }
	  
	  public String getDataocorrencia() {
	    return this.dataocorrencia;
	  }
	  
	  public void setDataocorrencia(String dataocorrencia) {
	    this.dataocorrencia = dataocorrencia;
	  }
	  
	  public String getHoraocorrencia() {
	    return this.horaocorrencia;
	  }
	  
	  public void setHoraocorrencia(String horaocorrencia) {
	    this.horaocorrencia = horaocorrencia;
	  }
	  
	  public String getDatainicio() {
	    return this.datainicio;
	  }
	  
	  public void setDatainicio(String datainicio) {
	    this.datainicio = datainicio;
	  }
	  
	  public String getHorainicio() {
	    return this.horainicio;
	  }
	  
	  public void setHorainicio(String horainicio) {
	    this.horainicio = horainicio;
	  }
	  
	  public String getDatatermino() {
	    return this.datatermino;
	  }
	  
	  public void setDatatermino(String datatermino) {
	    this.datatermino = datatermino;
	  }
	  
	  public String getHoratermino() {
	    return this.horatermino;
	  }
	  
	  public void setHoratermino(String horatermino) {
	    this.horatermino = horatermino;
	  }
	  
	  public String getOperador() {
	    return this.operador;
	  }
	  
	  public void setOperador(String operador) {
	    this.operador = operador;
	  }
	  
	  public String getTecnico() {
	    return this.tecnico;
	  }
	  
	  public void setTecnico(String tecnico) {
	    this.tecnico = tecnico;
	  }
	  
	  public String toString() {
	    return "Chamado [id=" + this.id + ", setor=" + this.setor + ", equipamento=" + this.equipamento + ", motivo=" + this.motivo + ", tipo=" + 
	      this.tipo + ", causa=" + this.causa + ", descricao=" + this.descricao + ", evitado=" + this.evitado + ", observacao=" + 
	      this.observacao + ", dataocorrencia=" + this.dataocorrencia + ", horaocorrencia=" + 
	      this.horaocorrencia + ", datainicio=" + this.datainicio + ", horainicio=" + this.horainicio + ", datatermino=" + 
	      this.datatermino + ", horatermino=" + this.horatermino + ", operador=" + this.operador + ", tecnico=" + this.tecnico + "]";
	  }
	}


