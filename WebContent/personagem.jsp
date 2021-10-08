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
    <link rel="stylesheet" href="./css/personagem.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
        integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat+Alternates:wght@400;600&display=swap"
        rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
        integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA=="
        crossorigin="anonymous" />
</head>
<body>
	<section class="init">
        <%@ include file="header.jsp" %>

    </section>
    <a href="${voltar }"><i class="fas fa-angle-double-left btnVoltar"></i></a>
     <section class="principal">
        <div class="personagens-container">
            <div class="personagem1-container text-center">
                <div class="personagem1">
                    <div class="container-img1">
                    	<img class="img-fluid" src="${personagem1.imagem }" alt="">
                    </div>
                </div>
                <h3 class="nome">${personagem1.nome }</h3>
                <p>${personagem1.descricao }</p>
            </div>
            <div class="relacionamento-container">
                <p>${descRelacionamento }</p>
                <form action="">
                    <div>
                        <label for="personagem"><fmt:message key="personagem.escolha"/></label> <br>
						<input type="hidden" name="idPersonagem1" value="${personagem1.id }">
						<input type="hidden" name="idCenario" value="${idCenario }">
						<input type="hidden" name="acao" value="relacionarPersonagens">
						
                        <select name="idPersonagem2" id="personagem">
                        	<c:forEach items="${personagens }" var="p">
                            	<option value="${p.id }">${p.nome }</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div>
                        <button class="btnRelacionar" type="submit"><fmt:message key="personagem.btnRelacionar"/></button>
                    </div>

                </form>
            </div>
            <div class="personagem2-container text-center">
                <div class="personagem1">
                    <div class="container-img1">
                    	<c:if test="${personagem2 == null }">
                    		<img class="img-fluid" src="./img/martyPassado.jpg" alt="">
                    	</c:if>
                    	<c:if test="${personagem2 != null }">
                    		<img class="img-fluid" src="${personagem2.imagem }" alt="">
                    	</c:if>
                    </div>
                </div>
                <h3 class="nome">${personagem2.nome }</h3>
                <p>${personagem2.descricao }</p>

            </div>


        </div>

    </section>
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