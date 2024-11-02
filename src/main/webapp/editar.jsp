<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Ordem de Serviços</title>
<link rel="stylesheet" href="index.css">
</head>

<style>

body {
	font-size: 16px;
	font-family: Helvetica;
	font-weight: bold;
	background-color: #e9ecef;
}

h2 {
	color: rgb(131, 136, 88);
}

#title {
	text-align: center;
}

#form {
	
	text-align: center;
}

input{

	border-radius: 4px;
}

input:hover{
	background-color:  #feffc1;
}

#form input {
	font-size: 16px;
	width: 100
}

input:focus {
  outline: none;
}

#form textarea {
	resize: vertical;
	font-size: 16px;
	width: 1134px;
	height: 40px;
}

textarea:hover{
	background-color:  #feffc1;
}

#ocorrencia-box {
	text-align: center;
}

#ocorrencia-section {
	text-align: center;
}

button {
	width: 100px;
	height: 24px;
	border: none;
	background-color: white;
	color: black;
	font-weight: bold;
	border: 1px solid black;
}

button:hover {
	transition: 0.3s;
	background-color: black;
	color: white;
}

#op{
	margin-top: -70px;
	margin-right: -1716px;
	text-align: center;
	
}
</style>



<body>
	<div id="title">
		<h2>
			Ordem de Serviço nº
			<%
		out.print(request.getAttribute("id"));
		%>
		</h2>
<br>
	</div>
	<div id="form">

		<form action="editarChamado">
			<input type="text" name="id" readonly="readonly"
				value="<%out.print(request.getAttribute("id"));%>"
				style="width: 30px; background-color: rgb(255, 255, 255); border-radius: 40px; border: none; display: none">



			Setor:<input type="text" name="setor" readonly="readonly"
				value="<%out.print(request.getAttribute("setor"));%>"
				style="border: none; margin-right: 904px;"> <br> <br>
			Equipamento:<input type="text" name="equipamento"
				style="border: none; border-bottom: 1px solid black;"
				value="<%out.print(request.getAttribute("equipamento"));%>">

			Motivo:<input type="text" name="motivo"
				style="border: none; border-bottom: 1px solid black;"
				value="<%out.print(request.getAttribute("motivo"));%>"> Tipo
			de serviço:<input type="text" name="tipo"
				style="border: none; border-bottom: 1px solid black;"
				value="<%out.print(request.getAttribute("tipo"));%>"> Causa:<input
				type="text" name="causa"
				style="border: none; border-bottom: 1px solid black;"
				value="<%out.print(request.getAttribute("causa"));%>">



			<h4 style="text-align: center; margin-left: -1066px;">Descrição:</h4>
			<textarea name="descricao"><%=request.getAttribute("descricao")%></textarea>



			<h4 style="text-align: center; margin-left: -1012px;">Formas de
				evitar:</h4>
			<textarea name="evitado"><%=request.getAttribute("evitado")%></textarea>



			<h4 style="text-align: center; margin-left: -1046px;">Observação:</h4>
			<textarea name="observacao"><%=request.getAttribute("observacao")%></textarea>



			<div id="ocorrencia-box">
				<div id="ocorrencia-inicio" style="margin-right: 346px;">

					<h4 style="margin-right: 394px;">
						Abertura do chamado: <input type="text" name="dataocorrencia"
							readonly="readonly"
							value="<%out.print(request.getAttribute("dataocorrencia"));%>"
							style="border: none; width: 80px; font-size: 16px;"> às <input
							type="time" name="horaocorrencia" readonly="readonly"
							value="<%out.print(request.getAttribute("horaocorrencia"));%>"
							style="border: none; font-size: 16px;">
					</h4>

				</div>
				<div id="ocorrencia-section"
					style="display: flex; justify-content: center; align-items: center;">
					<h4 style="margin-right: 854px; margin-top: -12px;">Início:
					<input type="date" name="datainicio"value="<%out.print(request.getAttribute("datainicio"));%>">
					<input type="time" name="horainicio"value="<%out.print(request.getAttribute("horainicio"));%>"></h4>
				</div>
					<h4 style="margin-right: 854px; margin-top: -12px;">Fim: &nbsp&nbsp
					<input type="date" name="datatermino"value="<%out.print(request.getAttribute("datatermino"));%>">
					<input type="time" name="horatermino"value="<%out.print(request.getAttribute("horatermino"));%>">
				<br><br>
				
				<div id="op">
					Operador: <input type="text" name="operador" placeholder="Operador" value="<%out.print(request.getAttribute("operador"));%>"><br>
					Técnico:<input type="text" name="tecnico" placeholder="Técnico" value="<%out.print(request.getAttribute("tecnico"));%>" style="margin-left: 16px;">
				</div>
			</div>
			
		

			<button type="submit">Salvar</button>

		</form>
	</div>
</body>
</html>