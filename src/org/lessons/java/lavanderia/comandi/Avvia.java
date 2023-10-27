package org.lessons.java.lavanderia.comandi;

import org.lessons.java.lavanderia.exceptions.LavanderiaException;
import org.lessons.java.lavanderia.macchine.Lavatrice;
import org.lessons.java.lavanderia.macchine.Macchina;
import org.lessons.java.lavanderia.programmi.ProgrammaLavatrice;

public class Avvia extends Comando {

	public Avvia(Macchina macchina) {
		super(macchina);
	}

	@Override
	public void esegui() {
		macchina.avvia();
	}

}
