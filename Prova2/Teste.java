package Correcao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		Cardapio c = new Cardapio("Cardápio de inverno", 1);
        c.add("Casillero del Diablo", 156, 2007, "Merlot");
        c.add("Coca-cola", 8, false); 
        c.add("Cerveja", 10, true); 
        c.add("Suco", 9, false); 
        c.add("Macarronada", 45, "Trigo, Molho de tomate.", true);
        c.add("Risoto", 30, "Arroz, filé mignon.", false);

        System.out.println(c.getListaProdutos());

        assertEquals(44.25, c.getMediaValor());
	}

}
