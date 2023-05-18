package Exe6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Veiculo {
	public List<Manutencao>lista = new ArrayList<>();
	private String placa;
	private String modelo;
	private LocalDate dataAquisicao;
	
	public Veiculo(String placa, String modelo, LocalDate dataAquisicao) {
		this.setPlaca(placa);
		this.setModelo(modelo);
		this.setDataAquisicao(dataAquisicao);
	}
	
	public void addManutencao(Manutencao manutencao) {
		lista.add(manutencao);
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public LocalDate getDataAquisicao() {
		return dataAquisicao;
	}
	public void setDataAquisicao(LocalDate dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	public int getQtServico() {
		return 0;
	}

	public float getIndiceSucateamento(Manutencao manutencao) {
		float indice = 0;
		if(manutencao.getTempoParado() >= 0 && manutencao.getTempoParado() <= 20) {
			indice = 0;
		}
		if(manutencao.getTempoParado() >= 21 && manutencao.getTempoParado() <= 50) {
			indice = 0.5f;
		}
		if(manutencao.getTempoParado() >= 51 && manutencao.getTempoParado() <= 80) {
			indice = 1;
		}
		if(manutencao.getTempoParado() >= 81 && manutencao.getTempoParado() <= 120) {
			indice = 1.5f;
		}
		if(manutencao.getTempoParado() >= 120) {
			indice = 2;
		}
		return indice;
	}
	
	public float getCustoMedioDiario() {
		return 0;
	}
	
	public float customedio() {
		return 0;
	}
}
