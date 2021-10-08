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
    <link rel="stylesheet" href="./css/index.css">
    <link rel="stylesheet" href="./css/navbar.css">
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

        <div class="container cardTimeline">
            <div class="row card-style">
                <div class="linhaTemporal">
                    <h1 class="text-center"><fmt:message key="index.linhaDoTempo"/></h1>
                    <p class="text-center"><fmt:message key="index.obsLinhaDoTempo"/></p>
                    <div class="vertical">
                        <div class="div1955">
                            <p>1955</p>
                            <div class="traço"></div>
                        </div>
                        <div class="div1955-duasSemanas" style="
                        margin-left: 21.5%; ${margin}">
                    
                            <p><fmt:message key="index.linhaDoTempoTraço"/></p>
                            <div class="traço"></div>
                        </div>
                        <div class="div1985">
                            <div class="traço"></div>
                            <p>1985</p>
                        </div>
                    </div>
                    <div class="horizontal">
                        <a href="controller?acao=exibirCenario&idCenario=2">
                            <div class="passado"></div>
                        </a>
                        <div class="espassamento1"></div>
                        <a href="controller?acao=exibirCenario&idCenario=1">
                            <div class="presente"></div>
                        </a>

                        <!-- <div class="futuro"></div> -->
                    </div>
                    <div class="vertical-2">
                        <div class="div1955-duasSemanas">
                            <div class="traço"></div>
                            <p><fmt:message key="index.linhaDoTempoTraço"/></p>
                        </div>
                        <div class="div1985">
                            <p>1985</p>
                            <div class="traço"></div>
                        </div>
                    </div>
                    <div class="horizontal-2">
                        <a href="controller?acao=exibirCenario&idCenario=3">
                            <div class="passado-alterado"></div>
                        </a>
                        <div class="espassamento"></div>
                        <a href="controller?acao=exibirCenario&idCenario=4" style="width: 0;">
                            <div class="presente presente-alterado"></div>
                        </a>

                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="timeLine w-100">

    </section>



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