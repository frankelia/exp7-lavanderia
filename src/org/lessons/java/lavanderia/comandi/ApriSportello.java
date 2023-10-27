package org.lessons.java.lavanderia.comandi;

import org.lessons.java.lavanderia.exceptions.LavanderiaException;
import org.lessons.java.lavanderia.macchine.Macchina;

public class ApriSportello extends Comando {

	public ApriSportello(Macchina macchina) {
		super(macchina);
	}

	@Override
	public void esegui() {
		if (macchina.isAperta()) {
			throw new LavanderiaException("La macchina è già aperta");
		}
		macchina.apri();
	}

	@Override
	public String getMessaggioSuccesso() {
		return "Lo sportello della macchina " + macchina.getNumero() + " è stato aperto";
	}

}
