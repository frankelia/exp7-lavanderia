package org.lessons.java.lavanderia.programmi;

public abstract class Programma {
	protected int numero;
	
	protected String nome;
	
	protected int durata;
	
	protected int gettoni;

	public Programma(int numero, String nome, int durata, int gettoni) {
		this.numero = numero;
		this.nome = nome;
		this.durata = durata;
		this.gettoni = gettoni;
	}

	public int getNumero() {
		return numero;
	}

	public String getNome() {
		return nome;
	}

	public int getDurata() {
		return durata;
	}

	public int getGettoni() {
		return gettoni;
	}

	@Override
	public String toString() {
		return "Programma [numero=" + numero + ", nome=" + nome + ", durata=" + durata + ", gettoni=" + gettoni + "]";
	}
	
}
