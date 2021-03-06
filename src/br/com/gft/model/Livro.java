package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
	private String autor;
	private String tema;
	private int qtdPag;

	public Livro() {
		super();
	}

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super();
		this.setAutor(autor);
		this.setTema(tema);
		this.setQtdPag(qtdPag);
		this.setNome(nome);
		this.setPreco(preco);
		this.setQtd(qtd);
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	public double calculaImposto() {
		if (this.getTema().trim() == "educativo") {
			return 0;
		} else {
			return this.getPreco() * 0.1;
		}
	}
}
