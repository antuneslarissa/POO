package Exe2;

import java.util.HashMap;


public class Obra {
	private HashMap<String, Parecer> map = new HashMap<>();
	
	private String titulo;
	private String autor;
	
	public Obra(String titulo, String autor) {
		this.setTitulo(titulo);
		this.setAutor(autor);
	}

	public void addParecer(Parecer parecer) {
		if(map.size()>3) {
			map.put(autor, parecer);
		}
		System.out.println("Problemas com o parecer");
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getQtParecer() {
		return map.size();
	}
	
	public Parecer getParecer() {
		return map.get(autor);
	}
	
	public Parecer consultarObra() {
		if(map.containsKey(titulo)) {
			return map.get(autor);
		}
		return new Parecer("null", null, "null");
	}
}
	
