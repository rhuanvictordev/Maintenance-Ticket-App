<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "model.Chamado" %>
<%@ page import = "java.util.ArrayList"%>
<%
ArrayList<Chamado> lista = (ArrayList<Chamado>) request.getAttribute("chamados");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de Chamados</title>
</head>
<style>
body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    margin: 0;
    padding: 20px;
}

h1 {
    color: #333;
    text-align: center;
}

table {
    width: 100%;
    border-collapse: collapse;
    margin: 20px 0;
}

th, td {
    border: 1px solid #ddd;
    padding: 8px;
    text-align: center;
}

th {
    background-color: graytext;
    color: white;
}

tr:nth-child(even) {
    background-color: #f2f2f2;
}

tr:hover {
    background-color: #ddd;
}

a{
text-decoration: none;
}



</style>

<body>
	<h1>Lista de Chamados</h1>
	<a href="home.html">Tela inicial</a>
	
	
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Setor</th>
				<th>Descrição</th>
				<th>Data da Ocorrência</th>
				<th>Opções</th>
				
				
				
			</tr>
		</thead>
			<tbody>
				<% for(int i=0; i<lista.size(); i++) { %>
				<tr>
				<td><%=lista.get(i).getId() %></td>
				<td><%=lista.get(i).getSetor() %></td>
				<td><%=lista.get(i).getDescricao() %></td>
				<td><%=lista.get(i).getDataocorrencia() %></td>
				<td><a href="listarChamado?id=<%=lista.get(i).getId()%>" style="color: rgb(0, 30, 255);" >Editar</a>
					&nbsp; | &nbsp;
				<a href="excluirChamado?id=<%=lista.get(i).getId()%>" style="color: rgb(255, 0, 0);">Excluir</a></td>
				
				</tr>
				<% } %>
			</tbody>
	</table>
</body>
</html>