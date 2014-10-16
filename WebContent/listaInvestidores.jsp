<%@ page language="java" contentType="text/html charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html charset=ISO-8859-1">
<title>Listar Clientes</title>
</head>
<body>
	<form action="listarInvestidores" method="post">
	
	<table class="table table-striped"> <!-- width="800px" align="center"> -->
            <tbody>
            <thead>
				<tr>
					<th>Nome</th>
					<th>E-mail</th>
					<th>Telefone</th>
					<th>Endereco</th>
					<th>Acao</th>
					<th>Acao</th>
				</tr>
		<c:forEach items="${listarInvestidores}" var="c">
			<tr>
			<td>${c.nome}</td>
			<td>${c.email}</td>
			<td>${c.telefone}</td>
			<td>${c.endereco}</td>
			<td><a href="alterarInvestidores?id=${c.id}">Alterar</a></td>
			<td><a href="excluirInvestidores?id=${c.id}">Excluir</a></td>
			</tr>
		</c:forEach>
		<tr><td colspan="5">&nbsp</td></tr>
		<tr><td colspan="5"><a href="menuInvestidores.html">Voltar</a></td></tr>
		</thead>
		</tbody>
	</table>
		
		<input type="submit" value="Voltar" name="btnVoltar">&nbsp;
		<input type="submit" value="Listar" name="btnSalvar">
	</form>
</body>
</html>