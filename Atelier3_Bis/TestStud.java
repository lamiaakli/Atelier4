package Atelier3_Bis;

public class TestStud {
	public static void main (String[]args) {
		Proprietaire P = new Proprietaire ("Toto", "Corte");
		System.out.println(P);
		
		Appartement App = new Studio (P);
		System.out.println(App);
	   System.out.println(" Le loyer est de " + App.loyer() + "euros");
	
}
}