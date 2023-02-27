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
		<main>
			<div class="row g-5">

				<div class="col-md-7 col-lg-8">
					<h4 class="mb-3">Novo cadastro</h4>
					<form action="usuario" method="post" class="needs-validation"
						novalidate="">
						<div class="row g-3">
							<div class="col-sm-12">
								<label for="nome" class="form-label">Nome</label> <input
									type="text" class="form-control" name="nome"
									value="Carlos Adriano" required="">
							</div>

							<div class="col-12">
								<label for="email" class="form-label">Email</label> <input
									type="email" class="form-control" name="email"
									value="casdorio@gmail.com">
							</div>

							<div class="col-12">
								<label for="password" class="form-label">Senha</label> <input
									type="password" class="form-control" name="senha" required="">
							</div>

						</div>

						<hr class="my-4">

						<button class="w-100 btn btn-primary btn-lg" type="submit">Cadastrar</button>
					</form>
				</div>
			</div>
		</main>
</body>

</html>