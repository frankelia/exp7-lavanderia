package org.lessons.java.lavanderia.comandi;

import org.lessons.java.lavanderia.macchine.Lavatrice;
import org.lessons.java.lavanderia.macchine.Macchina;

public class InserisciDetersivo extends Comando {

	public InserisciDetersivo(Macchina macchina, Integer parametroAggiuntivo) {
		super(macchina, parametroAggiuntivo);
	}

	@Override
	public void esegui() {
		if (macchina instanceof Lavatrice) {
			Lavatrice l =(Lavatrice)macchina;
			l.getSerbatoioDetersivo().ricarica(parametroAggiuntivo);
		}
	
	}

}
