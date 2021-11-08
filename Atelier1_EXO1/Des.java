package Atelier1_EXO1;
import java.util.*;

public class Des {
	
	protected String name;
	protected int nbFaces = 6;
	protected static int nbDe = 0;
	protected static Random rand = new Random();
	
	
	// Constructors 
	
	// Constructor with 2 param entered
	
	public Des (String name, int nbFaces) {
		this.name=name;
		if ( nbFaces >= 3 && nbFaces <= 120 ) {
			
			this.nbFaces = nbFaces;
		}
			else {
				System.err.println ("Error: number of face not valid for dice: \" + name + \". Please try again.");
				
				
			}
		nbDe++;
		
	}
	// Constructor when param name entered
	
	public Des (String name) throws NullPointerException{
		if (name == null && name == "") {
			throw new NullPointerException("erreur est ici");
		}
		
		this.name = name;
		nbDe++;
	
	}
	//Constructor's when parameter nbFace was entered
		public Des(int nbFaces)  {
			if (nbFaces >= 3 && nbFaces <= 120) {
				this.nbFaces = nbFaces;
			} else {
				 throw new IllegalArgumentException ("Error");
			}
			nbDe++;
			this.name = "Dé n°" + nbDe; //QST 5
		}

	//  METHOD
//Method to get the number of face of the dice
	public int getNbFace(){
		return nbFaces;
	}
	// Qst 4 sans parametres 
	public int lancer () {
		int nbRandom= rand.nextInt(nbFaces+1);
		return nbRandom;
		
	}
	//Method to throw nbLance times the dice 
	// Qst 6
	public int lancer(int nbLance) {
		
		int nbRandom;
		int nbRandomMax = 0;
		
		for (int i=0; i<=(nbLance-1);i++) {
			nbRandom = rand.nextInt(nbFaces+1);
			if(nbRandom > nbRandomMax){
				nbRandomMax = nbRandom;
			}
			System.out.println(" Random : "+i);
		}
		
		return nbRandomMax;
	}
	
	// Qst 7
	// Methodes ToString & Equals Heritee class ObJ
	public String toString() {
		String message = "Name of dice: " + name + "\n"
						+ "Number of face: " + nbFaces;
		return message;
	}
	
	public boolean equals(Object obj) {
	    if (this == obj)
	     return true;
	    if (obj == null)
	      return false;
	    if (getClass() != obj.getClass())
	      return false;
	    
	    Des other = (Des) obj;
	    if (name == null) {
		      if (other.name != null)
		        return false;
		    } else if (!name.equals(other.name)) 
		    	return false;
	    
	    if (nbFaces != other.nbFaces) return false;
	    
	    return true;
	}
	
	    
	}
