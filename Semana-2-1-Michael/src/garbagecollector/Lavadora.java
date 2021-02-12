package garbagecollector;

/**
 * 
 */


/**
 * @author micha
 *
 */
public class Lavadora {
	protected String marca ;
	String color ;
	public int libras;
	
	/**
	 * 
	 */
	public Lavadora(String marca, String color, int libras) {
		// TODO Auto-generated constructor stub
	this.marca=marca;
	this.color=color;
	this.libras=libras;
	}
	
	

	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public int getLibras() {
		return libras;
	}



	public void setLibras(int libras) {
		this.libras = libras;
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lavadora lav1= new Lavadora("atlas","blanca",27);
	}

}
