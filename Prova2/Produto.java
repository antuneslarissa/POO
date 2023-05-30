package Correcao;

public abstract class Produto {
	  private String nomeProduto;
	    private double valor;
	     
	    public Produto(String nomeProduto, double valor){
	        setNomeProduto(nomeProduto);
	        setValor(valor);
	    }

	    public void setNomeProduto(String nomeProduto) {
	        this.nomeProduto = nomeProduto;
	    }

	    public void setValor(double valor) {
	        if (valor <= 0){
	            throw new IllegalArgumentException("Valor deve ser positivo");
	        }
	        this.valor = valor;
	    }

	    public String getNomeProduto() {
	        return nomeProduto;
	    }

	    public double getValor() {
	        return valor;
	    }

	    @Override
	    public String toString() {
	        return getNomeProduto() + ". Valor: R$ " + getValor() + ".";
	    }
}
