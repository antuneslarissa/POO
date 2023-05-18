package Prova1;
/**
 * @author Larissa Antunes
 */
import java.util.ArrayList;
import java.util.List;


public class Veiculo {
	public List<Servico>lista = new ArrayList<>();
	
	private int numId;
	private String nomeCliente;
	private String endereco;
	private String telefone;
	private String tipo;
	private String marca;
	private double kmHodometro;
	private int qtEixo;
	private int horas;
	private String guincho;
	
	public Veiculo(int numId, String nomeCliente, String endereco, String telefone, String tipo, String marca,
			double kmHodometro, int qtEixo, int horas, String guincho) {
		this.setNumId(numId);
		this.setNomeCliente(nomeCliente);
		this.setEndereco(endereco);
		this.setTelefone(telefone);
		this.setTipo(tipo);
		this.setMarca(marca);
		this.setKmHodometro(kmHodometro);
		this.setHoras(horas);
		this.setQtEixo(qtEixo);
		this.setGuincho(guincho);
	}

	public void addServico(Servico servico) {
		lista.add(servico);
	}
	
	public int getNumId() {
		return numId;
	}

	public void setNumId(int numId) {
		this.numId = numId;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		if(nomeCliente.length() >= 2) {
			this.nomeCliente = nomeCliente;
		}else {
			throw new IllegalArgumentException("Nome Inválido");
		}
		
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if(tipo == "C" || tipo == "D" || tipo == "E") {
			this.tipo = tipo;
		}else {
			throw new IllegalArgumentException("Tipo Inválido");
		}	
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getKmHodometro() {
		return kmHodometro;
	}

	public void setKmHodometro(double kmHodometro) {
		if(kmHodometro > 0) {
			this.kmHodometro = kmHodometro;
		}else {
			throw new IllegalArgumentException("Quilometragem Inválida");
		}
	}

	public int getQtEixo() {
		return qtEixo;
	}

	public void setQtEixo(int qtEixo) {
		this.qtEixo = qtEixo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getGuincho() {
		
		return guincho;
	}

	public void setGuincho(String guincho) {
		this.guincho = guincho;
	}
	
	public float getMaodeObra() {
		float maoObra = 85 * getHoras();
		return maoObra;
		
	}

	public float getValorProdutos() {
		float valor = 0;
		for(Servico s: lista) {
			valor += (s.getQtProduto()*s.getValorUni());
		}
		return valor;
	}
	
	public int getProQuilo() {
		int qtdQuilo = 0;
		for(Servico s: lista) {
			if(s.getUniMedida() == "Q") {
				qtdQuilo ++;
			}
		}
		return qtdQuilo;
	}
	
	public float getValorGuincho() {
		float valorTotal = 0;
		valorTotal = getValorProdutos() + getMaodeObra();
		
		return valorTotal * 0.12f;
	}
	
	public float getValorTotalServico() {
		float valorTotal = 0;
		valorTotal = getValorProdutos() + getMaodeObra();
		
		if(getGuincho() == "sim") {
			valorTotal += valorTotal * 0.12f;
		}
		return valorTotal;
	}
	
	public String[] getDescricaoMaiorValor() {
		String[] vetor = new String[2];
		float total = 0;
		String maiorD = "";
		String menorD = "";
		float maior = Integer.MIN_VALUE;
		float menor = Integer.MAX_VALUE;
		for (Servico s : lista) {
			total = s.getQtProduto() * s.getValorUni();
			if (total > maior) {
				maior = total;
				maiorD = s.getDescricao();
			}
			if (total < menor) {
				menor = total;
				menorD = s.getDescricao();
			}
			if (s.getQtProduto() == 0) {
				return null;
			}
		}
		vetor[0] = maiorD;
		vetor[1] = menorD; 
		return vetor;
	}
	
	public String getMaiorValor() {
		float total = 0;
		String maiorD = "";
		float maior = Integer.MIN_VALUE;
		for (Servico s : lista) {
			total = s.getQtProduto() * s.getValorUni();
			if (total > maior) {
				maior = total;
				maiorD = s.getDescricao();
			}
		}
		
		return maiorD;
	}
	
	public void getOrdemServico() {
		System.out.println("O cliente " + getNomeCliente() + " possui um veiculo do tipo " + getTipo()
		+ " deixou seu veículo para revisão, com o número de telefone de contato " + getTelefone() +
		" gerando a ordem de serviço de número " + getNumId() + " que totalizou um valor de " + getValorTotalServico() +
		" sendo que o produto com maior valor é o " + getMaiorValor() + ".");
	}
	
}
