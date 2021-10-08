package br.com.dvpf.entidades;

import java.io.Serializable;

public class Relacionamento implements Serializable{

	private int id;
    private String george;
    private String marty;
    private String lorraine;
    private String drEmmet;
    private String biff;
    
    
    
	public Relacionamento(int id, String george, String marty, String lorraine, String drEmmet, String biff) {
		super();
		this.id = id;
		this.george = george;
		this.marty = marty;
		this.lorraine = lorraine;
		this.drEmmet = drEmmet;
		this.biff = biff;
	}


	public Relacionamento(String george, String marty, String lorraine, String drEmmet, String biff) {
		super();
		this.george = george;
		this.marty = marty;
		this.lorraine = lorraine;
		this.drEmmet = drEmmet;
		this.biff = biff;
	}


	public Relacionamento() {
		super();
	}


	
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGeorge() {
		return george;
	}


	public void setGeorge(String george) {
		this.george = george;
	}


	public String getMarty() {
		return marty;
	}


	public void setMarty(String marty) {
		this.marty = marty;
	}


	public String getLorraine() {
		return lorraine;
	}


	public void setLorraine(String lorraine) {
		this.lorraine = lorraine;
	}


	public String getDrEmmet() {
		return drEmmet;
	}


	public void setDrEmmet(String drEmmet) {
		this.drEmmet = drEmmet;
	}


	public String getBiff() {
		return biff;
	}


	public void setBiff(String biff) {
		this.biff = biff;
	}
    
    
    
	
}
