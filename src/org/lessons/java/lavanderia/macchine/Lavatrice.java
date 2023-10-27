package org.lessons.java.lavanderia.macchine;

import java.util.ArrayList;
import java.util.List;

import org.lessons.java.lavanderia.exceptions.LavanderiaException;
import org.lessons.java.lavanderia.programmi.ProgrammaLavatrice;

public class Lavatrice extends Macchina {
	private Serbatoio serbatoioAmmorbidente = new Serbatoio(500, 0);
	
	private Serbatoio serbatoioDetersivo = new Serbatoio(1000, 0);
	
	private List<ProgrammaLavatrice> programmi = new ArrayList<>();
	
	public Lavatrice(int numero) {
		super(numero);
		programmi.add(new ProgrammaLavatrice(1, "Rinfrescante", 20, 5, 25, 20));
		programmi.add(new ProgrammaLavatrice(2, "Rinnovante", 40, 10, 50, 40));
		programmi.add(new ProgrammaLavatrice(3, "Sgrassante", 60, 15, 100, 60));
	}
	
	public List<ProgrammaLavatrice> getProgrammi() {
		return new ArrayList<>(programmi);
	}
	
	public Serbatoio getSerbatoioAmmorbidente() {
		return serbatoioAmmorbidente;
	}
	
	public Serbatoio getSerbatoioDetersivo() {
		return serbatoioDetersivo;
	}

	@Override
	public void avvia() {
		int programmaSelezionato = getProgrammaSelezionato();
		ProgrammaLavatrice programmaLavatrice = getProgrammi().get(programmaSelezionato - 1);
		
		if (programmaLavatrice.getConsumoDetersivo() > getSerbatoioDetersivo().getContenuto()) {
			throw new LavanderiaException("Detersivo insufficiente");
		}
		
		if (programmaLavatrice.getConsumoAmmorbidente() > getSerbatoioAmmorbidente().getContenuto()) {
			throw new LavanderiaException("Ammorbidente insufficiente");
		}
		
		super.avvia();
	}
	
	@Override
	public String toString() {
		return "Lavatrice [serbatoioAmmorbidente=" + serbatoioAmmorbidente + ", serbatoioDetersivo="
				+ serbatoioDetersivo + ", programmi=" + programmi + "]";
	}
	
}

