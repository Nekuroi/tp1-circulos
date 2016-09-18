package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	
	
	@Test
	public void crearUnCirculoConRadio2() {
		
		final Double esperado = 2.0;
		Circulo MiCirculo = new Circulo();
		
		MiCirculo.setRadio(esperado);
		assertEquals(esperado, MiCirculo.getRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		final Double esperado = 3.7;
		Circulo MiCirculo = new Circulo(esperado);
		
		//MiCirculo.setRadio(esperado);
		assertEquals(esperado, MiCirculo.getRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		final Double esperado = 5.0;
		Circulo MiCirculo = new Circulo();
		
		MiCirculo.setRadio(esperado);
		assertEquals(esperado, MiCirculo.getRadio(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		final Double esperado = 10.9;
		Circulo MiCirculo = new Circulo();
		
		MiCirculo.setRadio(esperado);
		assertEquals(esperado, MiCirculo.getRadio(), 0.01);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es61Punto57() {
		final Double esperado = 61.57;
		Circulo MiCirculo = new Circulo(9.8);
		
		assertEquals(esperado, MiCirculo.getPerimetro(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio16Punto6Es104Punto3() {
		final Double esperado = 104.3;
		Circulo MiCirculo = new Circulo(16.6);
		
		assertEquals(esperado, MiCirculo.getPerimetro(), 0.01);
	}
	
	/*
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente método se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 *
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	}*/
	
}
