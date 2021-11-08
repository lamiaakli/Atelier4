package Atelier3_Bis;

public class MultiPieces extends Appartement {
	
	private static final int LOYERPRICE = 200;
	private int nbPieces;
	
	public double loyer() {
		return LOYERPRICE*nbPieces;
		
	}
	public MultiPieces (Proprietaire proprietaire, int nbPieces ) {
		super(proprietaire);
		this.nbPieces = nbPieces;
		
		
	}
	public String toString() {
		String message = nbPieces + " Pieces " + super.toString(); 
		return message;
		
	}
	
	
	

}
