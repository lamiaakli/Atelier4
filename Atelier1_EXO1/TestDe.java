package Atelier1_EXO1;

public class TestDe {
	public static void main (String [] args) {
		Des d1 = new Des ("Strong", 8);
		Des d2 = new Des ("Normal dice");
		Des d3 = new Des ("0");
		Des d4 = new Des ("Normal dice");
		//de.setNbFace(2);
				System.out.println("Le dé 2 à fait: " + d2.lancer());
				System.out.println("Le dé 2 à fait: " + d2.lancer(10));
				
				System.out.println(d1);
				System.out.println(d2);
				System.out.println(d3);
				

				System.out.println(d2 == d3);
				System.out.println(d2.equals(d3));
				System.out.println(d2.equals(d4));
				
				DesPipe dePipe = new DesPipe("Cheated dice", 8, 6);
				System.out.println(dePipe);
				System.out.println("Le dé pipé à fait: " + dePipe.lancer());
				
				DesMemoire deMemoire = new DesMemoire ("Memory dice", 10);
				System.out.println(deMemoire);
				System.out.println("Le dé pipé à fait :" + deMemoire.lancer(5));
				
				
		
		
	}
	
	}


