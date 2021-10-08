package br.com.dvpf.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;

import br.com.dvpf.bo.CenarioBO;
import br.com.dvpf.bo.PersonagemBO;
import br.com.dvpf.entidades.Cenario;
import br.com.dvpf.entidades.Personagem;


@WebServlet("/controller")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String retorno = "";
	CenarioBO cenarioBo = new CenarioBO();
	PersonagemBO personagemBo = new PersonagemBO();
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String acao = request.getParameter("acao");
		
		switch (acao) {
		case "exibirCenario":
			try {
				exibirCenario(request);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			break;
		case "exibirPersonagem":
			try {
				exibirPersonagem(request);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "relacionarPersonagens":
			try {
				relacionarPersonagens(request);
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case "trocarLinguagem":
			try {
				trocarLinguagem(request);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		default:
			break;
		}
	
		request.getRequestDispatcher(retorno).forward(request, response);
		retorno = "";
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	
	
	
	
	public void exibirCenario(HttpServletRequest request) throws Exception{
		
		int idCenario = Integer.parseInt(request.getParameter("idCenario"));
		
		
		Cenario cenario = cenarioBo.buscarEventosCenario(idCenario);
		ArrayList<Personagem> personagens = personagemBo.buscarPersonagensCenario(idCenario);
		
		cenario.setPersonagens(personagens);
		
		request.setAttribute("cenario", cenario);
		
		retorno = "cenario.jsp";
	}
	public void exibirPersonagem(HttpServletRequest request) throws Exception{
		int idCenario = Integer.parseInt(request.getParameter("idCenario"));
		int idPersonagem1 = Integer.parseInt(request.getParameter("idPersonagem1"));
		
		Personagem personagem1 = personagemBo.buscarPersonagemPorId(idPersonagem1);
		ArrayList<Personagem> personagens = personagemBo.buscarPersonagensCenario(idCenario);
		
		String voltar = "";
		switch (idCenario) {
		case 1:
			voltar = "controller?acao=exibirCenario&idCenario=1";
			break;
		case 2:
			voltar = "controller?acao=exibirCenario&idCenario=2";
			break;
		case 3:
			voltar = "controller?acao=exibirCenario&idCenario=3";
			break;

		default:
			voltar = "controller?acao=exibirCenario&idCenario=4";
			break;
		}
		
		request.setAttribute("voltar", voltar);
		request.setAttribute("personagem1", personagem1);
		request.setAttribute("personagens", personagens);
		request.setAttribute("idCenario", idCenario);
		retorno = "personagem.jsp";
		
	}
	public void relacionarPersonagens(HttpServletRequest request) throws Exception{
		exibirPersonagem(request);
		
		int idPersonagem2 = Integer.parseInt(request.getParameter("idPersonagem2"));
		int idPersonagem1 = Integer.parseInt(request.getParameter("idPersonagem1"));
		
		Personagem personagem1 = personagemBo.buscarPersonagemPorId(idPersonagem1);
		Personagem personagem2 = personagemBo.buscarPersonagemPorId(idPersonagem2);
		
		String descRelacionamento = "";
		switch (personagem2.getNome()) {
		case "Marty":
			descRelacionamento = personagem1.getRelacionamento().getMarty();
			break;
		case "George":
			descRelacionamento = personagem1.getRelacionamento().getGeorge();
			break;	
		case "Lorraine":
			descRelacionamento = personagem1.getRelacionamento().getLorraine();
			break;
		case "Dr Emmet":
			descRelacionamento = personagem1.getRelacionamento().getDrEmmet();
			break;
		case "Biff":
			descRelacionamento = personagem1.getRelacionamento().getBiff();
			break;
		default:
			break;
		}
		
		if(personagem1.getNome().equals(personagem2.getNome())) {
			descRelacionamento = "Os dois personagens são iguais. Por favor escolha outro.";
		}else {
			request.setAttribute("personagem2", personagem2);
		}
		
		
		request.setAttribute("descRelacionamento", descRelacionamento);
	}
	
	public void trocarLinguagem(HttpServletRequest request) throws Exception{
		
		String language = request.getParameter("lingua");
		
		Locale locale = new Locale(language);
			
		Config.set(request.getSession(), Config.FMT_LOCALE, locale);
		Config.set(request.getSession(), Config.FMT_FALLBACK_LOCALE, locale);
		
		if(language.equals("en")) {
			request.setAttribute("margin", "margin-left: 24.5%;" );
		}
		
				
		retorno = "index.jsp";
		
	}
	
	
}
