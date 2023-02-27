<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>

<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<meta charset="ISO-8859-1">
<title>App Achados e Perdidos - Cadastro</title>
</head>

<body>
	<c:import url="/WEB-INF/jsp/menu.jsp" />
	<div class="container">

		<h3>Listagem de Usuários</h3>

		<a href="/usuario">Novo</a>

		<c:if test="${not empty mensagem}">
			<div class="alert alert-success">
				<strong>Atenção!</strong> ${mensagem}
			</div>
		</c:if>

		<c:if test="${empty usuarios}">
			<h5>Não existem usuários cadastrados!!!</h5>
		</c:if>

<c:if test="${not empty usuarios}">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Senha</th>
					<th>E-mail</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="u" items="${usuarios}">
				<tr>
					  <td>${u.id}</td>
				      <td>${u.nome}</td>
				      <td>${u.senha}</td>
				      <td>${u.email}</td>
					<td><a href="/usuario/${u.id}/excluir">excluir</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		
		</c:if>
	</div>

</body>

</html>