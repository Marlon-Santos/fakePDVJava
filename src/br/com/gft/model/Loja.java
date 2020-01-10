package br.com.gft.model;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	String nome;
	String cnpj;
	double result = 0.0;
	List<Livro> livros = new ArrayList<>();
	List<VideoGame> videoGames = new ArrayList<>();

	public Loja() {
	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.setNome(nome);
		this.setCnpj(cnpj);
		this.setLivros(livros);
		this.setVideoGames(videoGames);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}

	public void listaLivros() {
		if (this.getLivros().isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque");
		} else {
			this.getLivros().forEach(livro -> System.out.println(livro.getNome()));
		}

	}

	public void listaVideoGames() {
		if (this.getVideoGames().isEmpty()) {
			System.out.println("A loja não tem video games no seu estoque");
		} else {
			this.getVideoGames().forEach(videoG -> System.out.println(videoG.getNome()));
		}
	}

	public double calculaPatrimonio() {

		this.getLivros().forEach(livro -> result += livro.getPreco());
		this.getVideoGames().forEach(videoG -> result += videoG.getPreco());
		return result;
	}
}
