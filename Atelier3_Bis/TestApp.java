package Atelier3_Bis;

public class TestApp {
	public static void main (String[]args) {
		Proprietaire P = new Proprietaire ("Toto", "Corte");
		System.out.println(P);
		
		Appartement App = new Appartement(P);
		System.out.println(App);
	

	}}
