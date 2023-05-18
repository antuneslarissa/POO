package Exe8;

public class PassageirosHora2 {
	private int [][][] passageirosHora;

	public PassageirosHora2() {
		this.passageirosHora = new int[12][30][24];
	}

	public int[][][] getPassageirosHora() {
		return passageirosHora;
	}

	public void setPassageirosHora(int[][][] passageirosHora) {
		this.passageirosHora = passageirosHora;
	}
	
	public void adiciona(int dia, int mes, int hora) {
		this.passageirosHora[mes -1][dia - 1][hora]+=1;
	}
	
	public int quantosPassageiros(int dia, int mes) {
		int qtdPassageiros = 0;
		for(int i = 0; i < 24; i++) {
			qtdPassageiros += this.passageirosHora[mes - 1][dia - 1][i];
		}
		return qtdPassageiros;
	}
	
	public int mesMenorFluxo(){
		int menorFluxo = passageirosHora[0][0][0];
		int mesMenorFluxo = 1;
		
		for(int mes = 0; mes < 12; mes++) {
			int totalFluxoMes = 0;
			for(int dia = 0; dia < 30; dia++) {
				for(int hora = 0; hora < 24; hora++) {
					totalFluxoMes +=passageirosHora[mes][dia][hora];
				}
			}
			if(totalFluxoMes < menorFluxo) {
				menorFluxo = totalFluxoMes;
				mesMenorFluxo = mes + 1;
			}
		}
		return mesMenorFluxo;
	}

}

