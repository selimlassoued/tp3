package pack2;

public class UtiliserLivre {

	public static void main(String[] args) {
		Livre L1=new Livre("jebran","khalil jebran");
		Livre L2=new Livre("taha","husain");
		if(L1.getAuteur().equals(L2.getAuteur()))
		{
			System.out.println("Les deux auteurs sont les mêmes");
		}
		else
		{
			System.out.println("les deux auteurs sont différents");
		}
		Livre[] tab=new Livre[10];
		tab[0]=new Livre("L'alchimiste","Coelho",225,23.5);
		tab[1]=new Livre("La Tunisie",508);
		tab[2]=new Livre("JK Rowling","Harry Potter");
		tab[3]=new Livre("sel","aaa",2222);
		for(int i=0;i<4;i++)
		{
			if(tab[i].testPrix()==true)
				{System.out.println(i+1+":Titre="+tab[i].getitre()+" Auteur="+tab[i].getAuteur()+" Nombre de pages="+tab[i].getnbpage()+" Prix="+tab[i].getprix());}
			else
			{System.out.println(i+1+":Titre="+tab[i].getitre()+" Auteur="+tab[i].getAuteur()+" Nombre de pages="+tab[i].getnbpage()+" Prix n'est pas fixé");}

		}
		tab[1].setauteur("Paulo Coelho");
		tab[2].setNbPages(461);
		tab[0].setprix(5);
		tab[1].setprix(10);
		for(int i=0;i<4;i++)
		{
			tab[i].decrire();
		}	

	}

}
