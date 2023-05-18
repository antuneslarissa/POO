package Prova1;
/**
 * @author Larissa Antunes
 */
public class Servico {
	private String descricao;
	private String uniMedida;
	private int qtProduto;
	private float valorUni;
	
	public Servico( String descricao, String uniMedida, int qtProduto, float valorUni) {

		this.setDescricao(descricao);
		this.setUniMedida(uniMedida);
		this.setQtProduto(qtProduto);
		this.setValorUni(valorUni);
	}


	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getUniMedida() {
		return uniMedida;
	}

	public void setUniMedida(String uniMedida) {
		if(uniMedida == "L" || uniMedida == "P" || uniMedida == "Q") {
			this.uniMedida = uniMedida;
		}else {
			throw new IllegalArgumentException("Unidade de Medida inválida");
		}	
	}

	public int getQtProduto() {
		return qtProduto;
	}

	public void setQtProduto(int qtProduto) {
		this.qtProduto = qtProduto;
	}

	public float getValorUni() {
		return valorUni;
	}

	public void setValorUni(float valorUni) {
		this.valorUni = valorUni;
	}
	
	
}
