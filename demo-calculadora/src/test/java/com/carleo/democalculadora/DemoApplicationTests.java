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
		calculadora.setNumero2(0);
		Integer resultadoEsperado = 20;
		Integer resultado = calculadora.dividir();
		assertThat(resultado.equals(resultadoEsperado));
	}
	

}
