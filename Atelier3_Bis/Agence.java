package Atelier3_Bis;

import java.util.ArrayList;

public class Agence {
private String name;
private int nbApp;
private static int nbApp_Total = 0;

private ArrayList <Appartement> appartements ;


public  Agence (String name) {
	this.name= name;
	nbApp = 0;
	appartements = new ArrayList <Appartement> ();
		
}
public void ajoutAppartement (Appartement a) {
	appartements.add(a);	
	nbApp ++;
	
}



private int totalLoyer() {
	int somme =0; 
			for (Appartement a:appartements) {
				somme +=a.loyer();
			}
			return somme;
}
static int getNbAppTotal() {
	return nbApp_Total;
	
}

public void afficher() {
	System.out.println(name+" " +nbApp + "appartements");
	for (Appartement a:appartements) {
		System.out.println(a);
	}
	System.out.println("Total du loyer" +totalLoyer() + "euros");

}
	
}
	