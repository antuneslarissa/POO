package Prova1;
/**
 * @author Larissa Antunes
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ServicoTest {

	@Test
	void test() {
		Veiculo v1 = new Veiculo(1023, "João", "Rua X, 200.", "(47)99999-9999", "C","audi", 89002, 30, 7, "sim");
		
		Servico c1 = new Servico("Óleo motor", "L", 3, 24.2f);
		Servico c2 = new Servico("velas", "P", 4, 10.8f);
		Servico c3 = new Servico("filtro", "P", 1, 34.2f);
		Servico c4 = new Servico("óleo câmbio", "L", 3, 89.3f);
		Servico c5 = new Servico("Graxa", "Q", 2, 37.6f);
		
		v1.addServico(c1);
		v1.addServico(c2);
		v1.addServico(c3);
		v1.addServico(c4);
		v1.addServico(c5);		
		v1.getOrdemServico();
		
		assertEquals(493.10003662109375, v1.getValorProdutos());
		assertEquals(1, v1.getProQuilo());
		assertEquals(1218.672119140625, v1.getValorTotalServico());
		assertEquals("óleo câmbio", v1.getDescricaoMaiorValor()[0]);
		assertEquals("filtro", v1.getDescricaoMaiorValor()[1]);
		assertEquals(493.10004f, v1.getValorProdutos());
		assertEquals(595.00, v1.getMaodeObra());
		assertEquals(130.57200622558594, v1.getValorGuincho());
		
		
	}

}
