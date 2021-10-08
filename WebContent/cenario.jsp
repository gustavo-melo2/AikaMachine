<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Aika Machine</title>
    <link rel="stylesheet" href="./css/navbar.css">
    <link rel="stylesheet" href="./css/footer.css">
    <link rel="stylesheet" href="./css/cenario.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.11.2/css/all.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
        integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat+Alternates:wght@400;600&display=swap"
        rel="stylesheet">
</head>
<body>
	<section class="init">
        <%@ include file="header.jsp" %>

    </section>

    <section class="conteudo">

        <div class="container py-5">
            <div class="text-center">
                <!-- init Card -->
                <div>
                	<h2 style="margin: 0 auto;"><fmt:message key="cenario.linhaTempoEscolhida"/> ${cenario.nome }</h2>
                </div>
				<div>
					<p style="padding: 10px;"><fmt:message key="cenario.obs1"/> <i class="fas fa-caret-down icolor"></i> <fmt:message key="cenario.obs2"/></p>
				</div>          
                <!-- Fim Card -->
            </div>
		</div>
    </section>

    <div class="container-fluid">
        <div class="row">
            <div class="col-md-1"></div>
            <c:forEach items="${cenario.personagens }" var="p">
	            <div class="col-md-2">
	                <div class="card">
	                    <img src="${p.imagem }" class="img-fluid" alt="">
	                    <div class="card-body pb-3">
	                        <h4 class="card-title font-weight-bold">${p.nome }</h4>
	                        <div class="collapse-content">
	
	                            <div class="collapse" id="collapse-${p.id }">
	
	                                <h4><fmt:message key="cenario.descricao"/></h4>
	                                    <p>
		                                    <p class="descricao">${p.descricao }</p>
		                                    <a href="controller?acao=exibirPersonagem&idPersonagem1=${p.id }&idCenario=${cenario.id}"><fmt:message key="cenario.verMais"/></a>
										</p>
	                            </div>
	
	                            <hr class="">
	
	                            <a class="btn btn-flat red-text p-1 my-1 mr-0 mml-1 deep-purple-text collapsed"
                                data-toggle="collapse" href="#collapse-${p.id }" aria-expanded="false"
                                aria-controls="collapseExample"><i
                                class="fas fa-caret-down icolor"></i></a>
	
	                        </div>
	                    </div>
	                </div>
	            </div>
			</c:forEach>



            <div class="col-md-1"></div>
        </div>


    </div>
    <div class="container py-5"><hr></div>

    <div class="container-fluid bg-black">
        <h1 class="font-weight-bold text-center space"><fmt:message key="cenario.eventos"/></h2>
            <div class="row">
                <div class="background"></div>
            </div>
        </h1>    
    </div>
    <c:forEach items="${cenario.eventos }" var="e">
        <div class="evento text-center pt-5 m-0">
            <div class="card m-4 p-4 bg-dark">
                <h3 class="text-white">${e.nome } </h3>
                <p class="text-white">${e.descricao }</p>
            </div>

        </div>
    </c:forEach>
	
	<%@ include file="footer.jsp" %>

	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
    integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
    crossorigin="anonymous"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
    integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
    crossorigin="anonymous"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
    integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
    crossorigin="anonymous"></script>

</body>
</html>