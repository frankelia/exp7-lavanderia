package org.lessons.java.lavanderia.comandi;

import org.lessons.java.lavanderia.exceptions.LavanderiaException;
import org.lessons.java.lavanderia.macchine.Lavatrice;
import org.lessons.java.lavanderia.macchine.Macchina;
import org.lessons.java.lavanderia.programmi.ProgrammaLavatrice;

public class CreatoreComandi {
	private CreatoreComandi() {
	}
	
	public static Comando crea(String nomeComando, Macchina macchina, Integer parametroAggiuntivo) {
		if (nomeComando.equalsIgnoreCase("apri")) {
			return new ApriSportello(macchina);
		} else if (nomeComando.equalsIgnoreCase("chiudi")) {
			return new ChiudiSportello(macchina);
		} else if (nomeComando.equalsIgnoreCase("gettoni")) {
			return new InserisciGettoni(macchina, parametroAggiuntivo);
		} else if (nomeComando.equalsIgnoreCase("lista")) {
			return new ListaProgrammi(macchina);
		} else if (nomeComando.equalsIgnoreCase("programma")) {
			return new SelezionaProgramma(macchina, parametroAggiuntivo);
		} else if (nomeComando.equalsIgnoreCase("avvia")) {
			return new Avvia(macchina);
		} else if (nomeComando.equalsIgnoreCase("ferma")) {
			return new Arresta(macchina);
		} else if (nomeComando.equalsIgnoreCase("detersivo")) {
			return new InserisciDetersivo(macchina, parametroAggiuntivo);
		} else if (nomeComando.equalsIgnoreCase("ammorbidente")) {
			return new InserisciAmmorbidente(macchina, parametroAggiuntivo);
		} else {
			throw new UnsupportedOperationException("Il comando specificato non è supportato");
		}
		
		
	}
}
