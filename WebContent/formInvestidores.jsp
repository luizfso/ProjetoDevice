<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro Investidores</title>
</head>
<body>
<form action="salvarInvestidores?id=${investidores.id}" method="post">
<table>
	<tr><td>Nome</td><td><input type="text" name="txtNome" value="${investidores.nome}" /></td></tr>
	<tr><td>Telefone</td><td><input type="text" name="txtTelefone" value="${investidores.telefone}"/></td></tr>
	<tr><td>Email</td><td><input type="text" name="txtEmail" value="${investidores.email}"/></td></tr>
	<tr><td>Endereco</td><td><input type="text" name="txtEndereco" value="${investidores.endereco}"/></td></tr>
</table>
<input type="submit" value="Voltar" name="btnVoltar">&nbsp;
<input type="submit" value="Salvar" name="btnSalvar">
</form>
</body>
</html>