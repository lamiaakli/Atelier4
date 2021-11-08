package Atelier1_EXO1;

public class DesPipe extends Des {
           private int borneMin;
           
	public DesPipe(String name, int nbFaces, int borneMin) {
		super(name, nbFaces);
		// TODO Auto-generated constructor stub
		if (borneMin >= 3 && borneMin <= 120 && borneMin < nbFaces) {
			this.borneMin = borneMin;
			
		} else {
			System.err.println ("Error: number of face not valid for dice: \" + name + \". Please try again.");
		} nbDe++;
	}
	// Method to throw the dice
	  public int lancer () {
		  int nbRandom = borneMin + rand.nextInt((nbFaces+1)-borneMin);
			return nbRandom;
			
			
		}
	}

	
	

