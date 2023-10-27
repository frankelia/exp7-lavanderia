package org.lessons.java.lavanderia.comandi;

import org.lessons.java.lavanderia.macchine.Macchina;

public class Arresta extends Comando {

	public Arresta(Macchina macchina) {
		super(macchina);
	}

	@Override
	public void esegui() {
		macchina.arresta();
	}

	@Override
	public String getMessaggioSuccesso() {
		return "La macchina " + macchina.getNumero() + " è stata arrestata";
	}

}
