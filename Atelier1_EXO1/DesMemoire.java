package Atelier1_EXO1;

public class DesMemoire extends Des{
 
	//Attribut
	private static int LancePre = 0;
	//constructor 
	
	public DesMemoire(String name, int nbFaces) {
		super(name, nbFaces);
	
	}
	
	// Method to throw the dice
	  public int lancer (int NbLance) {
		   int nbRandom = 0;
		   System.out.println("lance precedent :" +LancePre);
		   for (int i=0; i<=(NbLance-1);i++) {
			   do {
				   nbRandom = rand.nextInt(nbFaces+1);
				   System.out.println("Le lancé a fait: " + nbRandom + 
						   " et le lancé précédent était: " + LancePre);
			    
			   } while (LancePre == nbRandom);
				   
				   LancePre = nbRandom;
			}
			return nbRandom;
		}

	}


