package garbagecollector;

public class Computadora {
	protected String marca ;
	String estilo ;
	public int tamaño;
	
	/**
	 * 
	 */
	public Computadora(String marca, String estilo, int tamaño) {
		// TODO Auto-generated constructor stub
	this.marca=marca;
	this.estilo=estilo;
	this.tamaño=tamaño;
	}
	
	

	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getestilo() {
		return estilo;
	}



	public void setestilo(String estilo) {
		this.estilo = estilo;
	}



	public int getModelo() {
		return getModelo();
	}



	public void settamaño(int tamaño) {
		this.tamaño = tamaño;
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computadora  com1 = new Computadora ("Apple","laptop",2021);
	}

}

