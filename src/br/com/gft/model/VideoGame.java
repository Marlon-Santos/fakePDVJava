package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto{
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	public VideoGame() {
		super();
	}
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super();
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setUsado(isUsado);
		this.setNome(nome);
		this.setPreco(preco);
		this.setQtd(qtd);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	public double calculaImposto() {
		if (this.isUsado()) {
			return this.getPreco() * 0.25;
		} else {
			return this.getPreco() * 0.45;
		}
	}
}
