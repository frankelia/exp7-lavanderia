package org.lessons.java.lavanderia.comandi;

import org.lessons.java.lavanderia.macchine.Macchina;

public abstract class Comando {
	protected Macchina macchina;
	
	protected Integer parametroAggiuntivo;
	
	public Comando(Macchina macchina) {
		this.macchina = macchina;
	}
	
	public Comando(Macchina macchina, Integer parametroAggiuntivo) {
		this.macchina = macchina;
		this.parametroAggiuntivo = parametroAggiuntivo;
	}
	
	public String getMessaggioSuccesso() {
		return "Il comando è stato eseguito correttamente";
	}
	
	public abstract void esegui();
}
