public class Cidade {
	public String nome;
	public char uf;
	public int pupulacaoMasc;
	public int populacaoFem;
	public boolean calculado;
	
	public Cidade(String nome, char uf, int pupulacaoMasc, int populacaoFem, boolean calculado) {
		super();
		this.setNome(nome);
		this.setUf(uf);
		this.setPupulacaoMasc(pupulacaoMasc);
		this.setPopulacaoFem(populacaoFem);
		this.setCalculado(calculado);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getUf() {
		return uf;
	}

	public void setUf(char uf) {
		this.uf = uf;
	}

	public int getPupulacaoMasc() {
		return pupulacaoMasc;
	}

	public void setPupulacaoMasc(int pupulacaoMasc) {
		this.pupulacaoMasc = pupulacaoMasc;
	}

	public int getPopulacaoFem() {
		return populacaoFem;
	}

	public void setPopulacaoFem(int populacaoFem) {
		this.populacaoFem = populacaoFem;
	}

	public boolean isCalculado() {
		return calculado;
	}

	public void setCalculado(boolean calculado) {
		this.calculado = calculado;
	}
	
	
}
