
public class Produto {
	 private String nome;
	 private String descricao;
	 private float precoUnitario;
	 private int desconto;
	 
	public Produto(String nome, String descricao, float precoUnitario, int desconto) {
		super();
		this.setNome(nome);
		this.setDescricao(descricao);
		this.setPrecoUnitario(precoUnitario);
		this.setDesconto(desconto);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(float precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public int getDesconto() {
		return desconto;
	}

	public void setDesconto(int desconto) {
		this.desconto = desconto;
	}

	
	 
}
