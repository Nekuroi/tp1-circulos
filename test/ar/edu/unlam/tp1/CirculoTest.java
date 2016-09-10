package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	
	
	@Test
	public void crearUnCirculoConRadio2() {
		Circulo Circulo2 = new Circulo();
		Circulo2.setPerimetro(2.0);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo Circulo37 = new Circulo();
		Circulo37.setPerimetro(3.7);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo Circulo5 = new Circulo();
		Circulo5.setPerimetro(5.0);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo Circulo109 = new Circulo();
		Circulo109.setPerimetro(10.9);
	}
	
	@Test
	public void queElAreaDeUnCirculoConRadio9Punto8Es615Punto73() {
		Circulo Circulo61573 = new Circulo();
		Circulo61573.setPerimetro(615.73);
	}
	
	@Test
	public void crearUnCirculoConRadio16Punto6Es865Punto67() {
		Circulo Circulo166 = new Circulo();
		Circulo166.setPerimetro(16.6);
	}
	
	@Test
	public void CirculoT(){
		Circulo CirculoNuevo = new Circulo();
		CirculoNuevo.setPerimetro(16.6);
		System.out.print(CirculoNuevo.getPerimetro());
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
