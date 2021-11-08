package Atelier3_Bis;

public class TestAg {
	
	public static void main (String[]args) {
		Proprietaire P = new Proprietaire ("Toto", "Corte");
		System.out.println(P);
		Appartement App = new Studio (P);
	    MultiPieces MP = new MultiPieces(P,2);
		Agence AG = new Agence ("AGENCE ESPADONBLEU –");
		AG.ajoutAppartement(App);
		AG.ajoutAppartement(MP);
		Proprietaire P1 = new Proprietaire ("Titi", "Ajjac");
		MultiPieces MP1 = new MultiPieces(P1,3);
		AG.ajoutAppartement(MP1);
		AG.afficher ();
		

	}

}
