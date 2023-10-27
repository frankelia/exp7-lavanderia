package org.lessons.java.lavanderia.macchine;

import org.lessons.java.lavanderia.exceptions.LavanderiaException;

public class Serbatoio {
	private int capacitaMassima;
	
	private int contenuto;

	public Serbatoio(int capacitaMassima, int contenuto) {
		this.capacitaMassima = capacitaMassima;
		this.contenuto = contenuto;
	}

	public int getCapacitaMassima() {
		return capacitaMassima;
	}

	public int getContenuto() {
		return contenuto;
	}

	public void ricarica(int contenuto) {
		if (contenuto + this.contenuto > capacitaMassima) {
			throw new LavanderiaException("Stai eccedendo la capacità massima che è " + capacitaMassima);
		}

		if (contenuto < 0) {
			throw new LavanderiaException("Puoi solo inserire numeri positivi");
		}
		this.contenuto += contenuto;
	}

	@Override
	public String toString() {
		return "Serbatoio [capacitaMassima=" + capacitaMassima + ", contenuto=" + contenuto + "]";
	}

}
