package it.progetto.ingeneriaDelSoftware.java.SIVSE;

public class Elettore extends Utente{
	private String cf;
	private String codice_tessera_elettorale;
	private String circoscrizione_elettorale;
	private String id;

	public Elettore(){
		super();
		cf = "cf_di_prova";
		codice_tessera_elettorale = "codice_tessera_elettorale";
		circoscrizione_elettorale = "circoscrizione_default";
		id = "codice_id";
	}

	public Elettore(String nome,String cognome, int giorno_nascita, int mese_nascita, int anno_nascita, String cf, String codice_tessera_elettorale, String circoscrizione_elettorale, String id){
		super(nome,cognome,giorno_nascita,mese_nascita,anno_nascita);
		this.cf = cf;
		this.codice_tessera_elettorale = codice_tessera_elettorale;
		this.circoscrizione_elettorale = circoscrizione_elettorale;
		this.id = id;
	}

	public void vota(){}
}
