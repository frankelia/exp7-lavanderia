package org.lessons.java.lavanderia.comandi;

import org.lessons.java.lavanderia.macchine.Asciugatrice;
import org.lessons.java.lavanderia.macchine.Lavatrice;
import org.lessons.java.lavanderia.macchine.Macchina;

public class ListaProgrammi extends Comando {

	public ListaProgrammi(Macchina macchina) {
		super(macchina);
	}

	@Override
	public void esegui() {
		if (macchina instanceof Lavatrice) {
			Lavatrice l = (Lavatrice)macchina;
			
			l.getProgrammi().forEach(p -> {
				System.out.println(p);
			});
		} else if (macchina instanceof Asciugatrice) {
			Asciugatrice l = (Asciugatrice)macchina;

			l.getProgrammi().forEach(p -> {
				System.out.println(p);
			});
		} else {
			throw new UnsupportedOperationException("Il comando ListaProgrammi non è supportato per il tipo specificato"); 
		}
	}

}
