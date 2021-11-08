package Atelier3_Bis;

public class Studio extends Appartement {
	
	private static final int LOYERSTUDIO = 300;
	
	
	public Studio (Proprietaire proprietaire) {
		super(proprietaire);
	}
	public double loyer() {
		return LOYERSTUDIO;
	}
	public String toString() {
		String message = " Studio " + super.toString();
		return message;
	}
}
