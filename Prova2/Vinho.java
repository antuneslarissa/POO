package Correcao;

public class Vinho extends Produto {
	 
    private int safra;
    private String tipo;

    public Vinho(String nomeProduto, double valor, int safra, String tipo){
        super(nomeProduto, valor);
        setTipo(tipo);
        setSafra(safra);
    }

    public int getSafra() {
        return safra;
    }

    public String getTipo() {
        return tipo;
    }

    public void setSafra(int safra) {
        if (safra <= 1900){
            throw new IllegalArgumentException("Safra deve ser maior que 1900");
        }
        this.safra = safra;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + " Safra de " + getSafra() + ", " + getTipo();
    }
}