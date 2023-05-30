package Correcao;

import java.time.LocalDate;

public class Prato extends Produto {

    private String ingredientes;
    private boolean vegetariano;
 
    public Prato(String nomeProduto, double valor, String ingredientes, boolean vegetariano){
        super(nomeProduto, valor);
        setVegetariano(vegetariano);
        setIngredientes(ingredientes);   
    }

    public void setIngredientes(String ingredientes) {
        if (ingredientes.length() <= 2){
            throw new IllegalArgumentException("Ingredientes deve ser maior que 2 caracteres");
        }
        this.ingredientes = ingredientes;
    }

    public void setVegetariano(boolean vegetariano) {
        this.vegetariano = vegetariano;
    }

    public boolean isVegetariano() {
        return vegetariano;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    @Override
    public double getValor() {
        double retorno = super.getValor();
        if (LocalDate.now().getMonthValue() == 5){
            retorno = retorno*1.1;
        }
        return retorno;
    }

    @Override
    public String toString() {
        return super.toString() + " Ingredientes: " + getIngredientes();
    }
}