package Exe2;

public class ContaFrase {
	private String frase;
	
	public ContaFrase(String frase) {
		super();
		this.frase = frase;
	}

	public String getFrase() {
		return frase;
	}

	public void setFrase(String frase) {
		this.frase = frase;
	}
	
	public String palavra() {	
	String[]palavras = frase.split("\\s+");
	String result = "";
	 int tam;
		for(int i = 0; i < palavras.length; i++) {
			tam = palavras[i].length();
			result += palavras[i] + " | " + tam + "\n";
		}
		return result;
	}
}
