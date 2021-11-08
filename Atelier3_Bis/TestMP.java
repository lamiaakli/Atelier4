package Atelier3_Bis;

public class TestMP {
	public static void main (String[]args) {
		Proprietaire P = new Proprietaire ("Toto", "Corte");
		System.out.println(P);
		
		Appartement App = new MultiPieces(P,2);
		System.out.println(App);
		System.out.println(" Le loyer est de " + App.loyer() + "euros");
		

}}
