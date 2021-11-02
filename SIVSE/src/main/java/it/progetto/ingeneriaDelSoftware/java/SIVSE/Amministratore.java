package it.progetto.ingeneriaDelSoftware.java.SIVSE;

public class Amministratore extends Utente{
	private String email;
	private String psw;

	public Amministratore(){
		super();
		email = "nome.cognome@dominio.net";
		psw= "*********";
	}

	public Amministratore(String nome,String cognome, int giorno_nascita, int mese_nascita, int anno_nascita, String email, String psw){
		super(nome,cognome,giorno_nascita,mese_nascita,anno_nascita);
		this.email = email;
		this.psw = psw;
	}
	
	public void creaSessioneVoto(){}
	public void modificaSessioneVoto(){}
	public void avviaVotazioneModTest(){}
	public void avviaVotazione(){}
	public void avviaScrutinio(){}
	
}
