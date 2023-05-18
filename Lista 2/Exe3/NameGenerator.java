package Exe3;

/**
 * 
 * @author antun
 *
 */
public class NameGenerator {
	
	
	public static String generateStarWarsName(String[] entrada) {
		String nome = entrada[0];
		String[] nomes = nome.split(""); 
		String sobrenome = nomes[nomes.length-1];
		String a = sobrenome.substring(0, 3);
		String b = nome.substring(0, 2);
		
		String Mae = entrada [1];
		String c = Mae.substring(0, 2);
		
		String cidade = entrada[2];
		String d = cidade.substring(0, 3);
		
		return a + b + " " + c + d;
	}

}
