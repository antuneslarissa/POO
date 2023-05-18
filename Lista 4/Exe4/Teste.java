package Exe4;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Teste {

	@Test
	void test() {
		List<Evento> lista = new ArrayList<Evento>();
		
		Evento evento = new Evento("Teatro às 18h",20.00f,LocalDate.of(2019, 9, 10), new Avaliacao(1500,"Bom nível"));
		lista.add(evento);
		
		evento = new ShowMusical("Novos ouvintes",65.00f , LocalDate.of(2019, 11, 15), "Skank", " pop rock", new Avaliacao(0,null));
		lista.add(evento);

		evento = new Evento("Palestra com Tadeo Berkji", 60.00f,LocalDate.of(2019, 8, 5), new Avaliacao(54,"Com informações esclarecedoras sobre as artes plásticas contemporâneas"));
		lista.add(evento);		
		
		evento = new ShowMusical("Tempo passado",15.00f , LocalDate.of(2019, 9, 15), "Grupo GFD", "rock progressivo", new Avaliacao(265,"Muito Louco"));
		lista.add(evento);
		
		evento.exibir();
	}

}
