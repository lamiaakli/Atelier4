package Atelier2_QST1;




public class TestQst1 {

	public static void main (String[]args) {
		Personne Per1 = new Personne("Akli","Lamia", 1, 1, 1980, 20, "Jefferson Street", "20250", "Corte");
		System.out.println(Per1);
		Personne Per2 = new Personne("Belkacem","Yanis", 8, 10, 1994, 5, "Lieu-dit Campucciu", "20213", "Penta-di-Casinca");
		System.out.println(Per2);
		
		Personne Per4 = new Personne("Akli","Lynda", 4, 10, 2000, 11, "Ponte Leccia", "20218", "Morosaglia");
		System.out.println(Per4);
		
System.out.println("Il y a actuellement " + Personne.getNbPersonne() + " personnes");
System.out.println("Est-ce que la personne 1 est plus agé que la personne 2 ? \n"
+ Personne.plusAgee(Per1.getDateNaissance(), Per2.getDateNaissance()));

System.out.println("Est-ce que la personne 2 est plus agé que la personne 1 ?\n" 
		+ Personne.plusAgeeQue(Per1.getDateNaissance(),  Per2.getDateNaissance()));
System.out.println("Est-ce que la personne n°2 est identique à la personne n°4 ?\n" 
		+ Per2.equals(Per4));

System.out.println("Création de l'employé : " + Per1.getNom() + "\n");
//Employe.createEmploye(pers1.getDateNaissance());
//System.out.println("L'employé : " +  + "vient d'être créé\n");
}
		
}

