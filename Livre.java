package pack2;

public class Livre {
	private String titre, auteur;
	private float nbPages;
	private double prix;
	private boolean prixfixe;
	
	public Livre () {
		this.auteur="";
		this.titre="";
		nbPages=0;
		prixfixe=false;
	}
	public Livre (String auteur,String titre) {
		this.auteur = auteur;
		this.titre = titre;
	}
	public Livre (String titre,float nbPages)
	{
		this.titre=titre;
		this.nbPages=nbPages;
		
	}
	public Livre(String titre,String auteur,float nbPages) {
		this(titre,nbPages);
		this.auteur=auteur;
	}
	public Livre(String titre,String auteur,float nbPages,double prix) {
		this(titre,auteur,nbPages);
		this.prix=prix;
		this.prixfixe=true;
	}
	public double getprix()
	{
		return this.prix;
	}
	public void setprix(double prix)
	{
		if(this.prixfixe==false)
			{this.prix=prix;
			this.prixfixe=true;}
		else
		{
			System.out.println("Le prix est déjà fixé\n");
		}
	}
	public String getAuteur() {
		return this.auteur;
	}
	public void setNbPages (float nb) {
		if(nb>20)
			{this.nbPages = nb;}
		else
			{System.out.println("Le nombre de pages est faible");}
	}
	public String getitre() {
		return this.titre;
	}
	public float getnbpage() {
		return this.nbPages;
	}
	public void setauteur(String ch) {
		this.auteur=ch;
	}
	public void setitre(String ch) {
		this.titre=ch;
	}
	public String toString() {
		return "Livre intitulé l'"+this.titre+" de "+this.auteur+", contenant "+this.nbPages+" pages et de prix:"+this.prix;
	}
	public void decrire() {
		String k=this.toString();
		System.out.println(k);
	}
	public boolean testPrix() {
		return this.prix!=0;
		
	}

	
	
}
