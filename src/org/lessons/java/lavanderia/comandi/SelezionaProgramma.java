package org.lessons.java.lavanderia.comandi;

import org.lessons.java.lavanderia.macchine.Macchina;

public class SelezionaProgramma extends Comando {

	public SelezionaProgramma(Macchina macchina, Integer parametroAggiuntivo) {
		super(macchina, parametroAggiuntivo);
	}

	@Override
	public void esegui() {
		macchina.setProgrammaSelezionato(parametroAggiuntivo);
	
	}

}
