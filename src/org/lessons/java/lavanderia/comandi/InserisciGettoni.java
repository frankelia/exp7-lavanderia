package org.lessons.java.lavanderia.comandi;

import org.lessons.java.lavanderia.macchine.Macchina;

public class InserisciGettoni extends Comando {

	public InserisciGettoni(Macchina macchina, Integer parametroAggiuntivo) {
		super(macchina, parametroAggiuntivo);
	}

	@Override
	public void esegui() {
		macchina.addGettoni(parametroAggiuntivo);
	}

}
