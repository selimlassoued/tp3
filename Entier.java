package pack1;

public class Entier {

	private int n ; 
	public Entier (int e) {
	n=e ; }
	
	public void incrementer (int dn) {
	n += dn ;
	}
	public void afficher () {
	System.out.println (n);
	}
	
	public int getN() {
		return this.n;
	}
}
