package com.carleo.democalculadora;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
	
	private Calculadora calculadora;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	void test() {
		calculadora = new Calculadora();
		calculadora.setNumero1(10);
		calculadora.setNumero2(10);
		Integer resultadoEsperado = 1;
		Integer resultado;
		try {
			resultado = calculadora.dividir();
			assertThat(resultado.equals(resultadoEsperado));
		} catch (Excepcion e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	

}
