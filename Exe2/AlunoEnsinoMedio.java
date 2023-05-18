package Exe2;

import java.time.LocalDate;

public class AlunoEnsinoMedio extends Aluno {
	public int ano;
	
	public AlunoEnsinoMedio(String nome, LocalDate dataNascimento, int ano) {
		super(nome, dataNascimento);
		this.setAno(ano);
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		if(ano > 0 || ano <= 3) {
			this.ano = ano;
		}else {
			throw new IllegalArgumentException("Ano inválido");
		}
	}

	public String mostra() {
		return this.getNome() + " está cursando o " + this.getAno() + " ano do ensino médio e tem "
                + this.getIdade()+" anos.";
	}
}
