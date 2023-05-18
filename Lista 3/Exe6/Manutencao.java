package Exe6;

public class Manutencao {
	private int num;
	private double custo;
	private String descricao;
	private int tempoParado;
	
	public Manutencao(int num, double custo, String descricao, int tempoParado) {
		this.setNum(num);
		this.setCusto(custo);
		this.setDescricao(descricao);
		this.setTempoParado(tempoParado);
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getCusto() {
		return custo;
	}
	public void setCusto(double custo) {
		this.custo = custo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getTempoParado() {
		return tempoParado;
	}
	public void setTempoParado(int tempoParado) {
		this.tempoParado = tempoParado;
	}
	
	
}
