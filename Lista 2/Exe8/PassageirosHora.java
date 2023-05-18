package Exe8;

public class PassageirosHora {
    private int[][][] passageirosHora;
    private int menorFluxo;
    private int maiorQuantidadeTransportada;
    private int[] momentoPico;

	public PassageirosHora() {
        passageirosHora = new int[12][30][24];
        menorFluxo = -1;
        maiorQuantidadeTransportada = -1;
        momentoPico = new int[3];
    }

    public void adiciona(int d, int m, int h) {
        passageirosHora[m-1][d-1][h]++;
        PicoTransporte(d, m, h);
    }

    public int quantosPassageiros(int d, int m) {
        int total = 0;
        for (int hora = 0; hora < 24; hora++) {
            total += passageirosHora[m-1][d-1][hora];
        }
        return total;
    }

    public int mesMenorFluxo() {
        if (menorFluxo == -1) {
        	MenorFluxo();
        }
        return menorFluxo + 1;
    }

    public int[] picoTransporte() {
        return momentoPico;
    }

    private void PicoTransporte(int d, int m, int h) {
        int quantidadeTransportada = passageirosHora[m-1][d-1][h];
        if (quantidadeTransportada > maiorQuantidadeTransportada) {
            maiorQuantidadeTransportada = quantidadeTransportada;
            momentoPico[0] = d;
            momentoPico[1] = m;
            momentoPico[2] = h;
        }
    }

    private void MenorFluxo() {
        int menorFluxo = Integer.MAX_VALUE;
        for (int mes = 0; mes < 12; mes++) {
            int fluxoMensal = 0;
            for (int dia = 0; dia < 30; dia++) {
                for (int hora = 0; hora < 24; hora++) {
                    fluxoMensal += passageirosHora[mes][dia][hora];
                }
            }
            if (fluxoMensal < menorFluxo) {
                menorFluxo = fluxoMensal;
                menorFluxo = mes;
            }
        }
    }
}