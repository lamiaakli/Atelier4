package Atelier3_Bis;

public abstract class Appartement  {
	
	private static int nbAppartement;
	private Proprietaire proprietaire;
	private String code;
	
	public Appartement (Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
		this.code= "APP"+ nbAppartement;
		nbAppartement++;
		
	}
	public abstract double loyer();

public String toString() {
	String message = code + " appartient a " + proprietaire;
					
	return message;
}


}


