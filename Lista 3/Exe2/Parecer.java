package Exe2;

import java.time.LocalDate;

public class Parecer {
	private String parecerista;
	private LocalDate data;
	private String conteudo;
	
	public Parecer(String parecerista, LocalDate data, String conteudo) {
		this.setParecerista(parecerista);
		this.setData(data);
		this.setConteudo(conteudo);
	}

	public String getParecerista() {
		return parecerista;
	}

	public void setParecerista(String parecerista) {
		this.parecerista = parecerista;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		if(data.isBefore(LocalDate.now())) {
			System.out.println("Data inválida");
		}else {
			this.data = data;
		}
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	
	
}
