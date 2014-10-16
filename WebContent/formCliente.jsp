<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro Cliente</title>
</head>
<body>
<form action="salvarCliente?id=${cliente.id}" method="post">
<table>
	<tr><td>Nome</td><td><input type="text" name="txtNome" value="${cliente.nome}" /></td></tr>
	<tr><td>Telefone</td><td><input type="text" name="txtTelefone" value="${cliente.telefone}"/></td></tr>
	<tr><td>Email</td><td><input type="text" name="txtEmail" value="${cliente.email}"/></td></tr>
</table>
<input type="submit" value="Voltar" name="btnVoltar">&nbsp;
<input type="submit" value="Salvar" name="btnSalvar">
</form>
</body>
</html>