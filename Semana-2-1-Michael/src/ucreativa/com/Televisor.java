package ucreativa.com;

public class Televisor {
	
	protected String marca ;
	int tamaño ;
	public int modelo;
	
	/**
	 * 
	 */
	public Televisor(String marca, int tamaño, int modelo) {
		// TODO Auto-generated constructor stub
	this.marca=marca;
	this.tamaño=tamaño;
	this.modelo=modelo;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Televisor tv1 = new Televisor("Sony",55,55437);
		
		
	}

}
