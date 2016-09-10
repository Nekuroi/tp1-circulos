package ar.edu.unlam.tp1;

public class Circulo {
	
	private Double radio;
	
	public void setPerimetro (Double radio){
		this.radio = radio;
	}
	
	public Double getRadio(){
		return radio;
	}
	
	public Double getPerimetro(){
		return 2 * Math.PI * radio;
	}

}
