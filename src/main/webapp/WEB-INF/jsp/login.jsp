<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">

<title>App Achados e Perdidos</title>
<style>
html, body {
	height: 100%;
}

body {
	display: flex;
	align-items: center;
	padding-top: 40px;
	padding-bottom: 40px;
	background-color: #f5f5f5;
}

.form-signin {
	width: 100%;
	max-width: 330px;
	padding: 15px;
	margin: auto;
}

.form-signin .checkbox {
	font-weight: 400;
}

.form-signin .form-floating:focus-within {
	z-index: 2;
}

.form-signin input[type="email"] {
	margin-bottom: -1px;
	border-bottom-right-radius: 0;
	border-bottom-left-radius: 0;
}

.form-signin input[type="password"] {
	margin-bottom: 10px;
	border-top-left-radius: 0;
	border-top-right-radius: 0;
}
</style>
</head>

<body class="text-center">

	<main class="form-signin">
		<form action="/login" method="post">
			<h1 class="h3 mb-3 fw-normal">App Achados e Perdido</h1>

			<div class="form-floating">
				<input type="email" class="form-control" name="email"
					placeholder="name@example.com"> <label>Email</label>
			</div>
			<div class="form-floating">
				<input type="password" class="form-control" name="senha"
					placeholder="Password"> <label>Senha</label>
			</div>

			<div class="checkbox mb-3"></div>
			<button class="w-100 btn btn-lg btn-primary" type="submit">Entrar</button>

		</form>
		<c:if test="${not empty mensagem}">		
			<div class="alert alert-danger">
			  <strong>Atenção!</strong> ${mensagem}
			</div>		
		</c:if>
	</main>


</body>

</html>