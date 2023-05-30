package Correcao;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
	 private String nome;
	    private int versao;

	    private List<Produto> produtos = new ArrayList<>();

	    public void add(String nomeProduto, double valor, boolean alcoolico) {
	        try {
	            Bebida bebida = new Bebida(nomeProduto, valor, alcoolico);
	            produtos.add(bebida); 
	        } catch (Exception e) {
	            System.out.println("Ocorreu um erro ao adicionar uma bebida: " + e.getMessage());
	        }
	    }

	    public void add(String nomeProduto, double valor, int safra, String tipo) {
	        try {
	            Vinho vinho = new Vinho(nomeProduto, valor, safra, tipo);
	            produtos.add(vinho); 
	        } catch (Exception e) {
	            System.out.println("Ocorreu um erro ao adicionar um vinho: " + e.getMessage());
	        }
	    }

	    public void add(String nomeProduto, double valor, String ingredientes, boolean vegetariano) {
	        try {
	            Prato prato = new Prato(nomeProduto, valor, ingredientes, vegetariano);
	            produtos.add(prato); 
	        } catch (Exception e) {
	            System.out.println("Ocorreu um erro ao adicionar um prato: " + e.getMessage());
	        }
	    }

	    public double getMediaValor(){
	        double total = 0;
	        for (Produto produto : produtos) {
	            total+=produto.getValor();
	        }
	        return total / produtos.size();
	    }

	    public String getListaProdutos(){
	        String retorno = "";
	        for (Produto produto : produtos) {
	            retorno += produto + "\n";
	        }
	        return retorno;
	    }
	    

	    public Cardapio(String nome, int versao){
	        this.nome = nome;
	        this.versao = versao;
	    }

	    public String getNome() {
	        return nome;
	    }
	    
	    public int getVersao() {
	        return versao;
	    }
}
