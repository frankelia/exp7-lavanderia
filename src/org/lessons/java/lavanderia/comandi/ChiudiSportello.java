package org.lessons.java.lavanderia.comandi;

import org.lessons.java.lavanderia.macchine.Macchina;

public class ChiudiSportello extends Comando {

	public ChiudiSportello(Macchina macchina) {
		super(macchina);
	}

	@Override
	public void esegui() {
		macchina.chiudi();
	}

}
