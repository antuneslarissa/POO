package Exe4;
/*
 * @author Larissa Antunes e Julia Andreatta
 */
import java.time.LocalDate;

public class ShowMusical extends Evento {
	private String nomeBanda;
	private String estiloMusical;

	public ShowMusical(String titulo, float valor, LocalDate data, String nomeBanda, String estiloMusical, Avaliacao avaliacao) {
		super(titulo, valor, data, avaliacao);
		this.setNomeBanda(nomeBanda);
		this.setEstiloMusical(estiloMusical);
	}

	public String getNomeBanda() {
		return nomeBanda;
	}

	public void setNomeBanda(String nomeBanda) {
		this.nomeBanda = nomeBanda;
	}

	public String getEstiloMusical() {
		return estiloMusical;
	}

	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}

	public String exibir() {
		String str = "Show Musical " + this.getTitulo() + " de " + this.getEstiloMusical() + " de "
				+ this.getNomeBanda() + " com ingressos a R$" + this.getValor();
		if (avaliacao.getQtdPagantes() == 0 && avaliacao.getOpiniaoGeral()== null) {
			str += ", dia " + this.getData() + ". Ainda não avaliado.";
		} else {
			str += ", contou com " + getAvaliacao().getQtdPagantes() 
					+ " pagantes no dia " + this.getData() + ". Opinião: "
					+ getAvaliacao().getOpiniaoGeral();
		}
		return str;
	}
	
}
