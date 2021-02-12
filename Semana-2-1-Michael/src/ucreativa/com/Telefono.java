package ucreativa.com;

public class Telefono {
	protected String marca ;
	String color ;
	public int modelo;
	
	/**
	 * 
	 */
	public Telefono(String marca, String color, int modelo) {
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
		Telefono tel1 = new Telefono("Samsung","gris",2021);
	}

}
