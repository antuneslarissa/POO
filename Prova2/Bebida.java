package Correcao;

public class Bebida extends Produto {
    
    private boolean alcoolico;

    public Bebida(String nomeProduto, double valor, boolean alcoolico){
        super(nomeProduto, valor);
        this.alcoolico = alcoolico;
    }

    public boolean isAlcoolico() {
        return alcoolico;
    }

    private String getAlcoolicoValue(){
        return alcoolico ? "Sim" : "Não";
    }

    @Override
    public String toString() {
        return super.toString() + " Possui álcool: " + getAlcoolicoValue();
    }
}