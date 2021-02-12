/**
 * 
 */
package ucreativa.com;

/**
 * @author micha
 *
 */
public class Carro {
	protected String marca ;
	String color ;
	public int modelo;
	
	/**
	 * 
	 */
	public Carro(String marca, String color, int modelo) {
		// TODO Auto-generated constructor stub
	this.marca=marca;
	this.color=color;
	this.modelo=modelo;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro car1 = new Carro("Nissan","negro",2010);
	}

}
