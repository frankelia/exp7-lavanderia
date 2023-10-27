package org.lessons.java.lavanderia.macchine;

import org.lessons.java.lavanderia.exceptions.LavanderiaException;

public abstract class Macchina {
	protected int numero;
	
	protected boolean aperta = true;
	
	protected int gettoni = 0;
	
	protected int programmaSelezionato = 0;
	
	protected boolean inFunzione = false;
	
	public Macchina(int numero, boolean aperta) {
		this.numero = numero;
		this.aperta = aperta;
	}
	
	public Macchina(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void chiudi() {
		this.aperta = false;
	}
	
	public void apri() {
		this.aperta = true;
	}
	
	public boolean isAperta() {
		return aperta;
	}
	
	public int getGettoni() {
		return gettoni;
	}
	
	public void addGettoni(int gettoni) {
		// TODO
//		if (gettoni <= 0) {
//			
//		}
		this.gettoni += gettoni;
	}
	
	public int getProgrammaSelezionato() {
		return programmaSelezionato;
	}
	
	public void setProgrammaSelezionato(int programmaSelezionato) {
		this.programmaSelezionato = programmaSelezionato;
	}
	
	public boolean isInFunzione() {
		return inFunzione;
	}
	
	public void avvia() {
		this.inFunzione = true;
	}
	
	public void arresta() {
		if (!inFunzione) {
			throw new LavanderiaException("La macchina non è in funzione");
		}
		this.inFunzione = false;
	}
}
