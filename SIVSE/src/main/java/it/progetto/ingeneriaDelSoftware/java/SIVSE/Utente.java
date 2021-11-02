package it.progetto.ingeneriaDelSoftware.java.SIVSE;

public class Utente {
	private String nome;
	private String cognome;
	private int giorno_nascita;
	private int mese_nascita;
	private int anno_nascita;


	public Utente(){
		nome = "Utente";
		cognome = "Di test";
		giorno_nascita = 17;
		mese_nascita = 03;
		anno_nascita = 1861;
	}

	public Utente(String nome,String cognome, int giorno_nascita, int mese_nascita, int anno_nascita){
	this.nome =  nome;
	this.cognome = cognome;
	this.giorno_nascita = giorno_nascita;
	this.anno_nascita = anno_nascita;
	}
}
