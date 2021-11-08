package Atelier2_QST1;

import java.util.*;

public class Personne {


    private static final Adresse ADRESSE_INCONNUE = null;
    private String nom;
    private String prenom;
    private  static int NbP = 0;
    private static String NomDernierePCree;
    public static final int Age = 18 ;
    private final GregorianCalendar dateNaissance;
    private Adresse adresse=ADRESSE_INCONNUE;
	
	/**
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param laDate la date de naissance de la personne
	 * @param lAdresse l'adresse de la personne
	 */
	public Personne(String leNom,String lePrenom, GregorianCalendar laDate, Adresse lAdresse){
		nom = leNom.toUpperCase();
		prenom=lePrenom;
		dateNaissance=laDate;
		adresse=lAdresse;
		NbP ++;
		NomDernierePCree = nom;
		
	}
	
	/** 
	 * Constructeur de Personne
	 * @param leNom le nom de la personne
	 * @param lePrenom le prénom de la personne
	 * @param j le jour de naissance
	 * @param m le mois de naissance
	 * @param a l'année de naissance
	 * @param numero le n° de la rue
	 * @param rue la rue
	 * @param code_postal le code postal de l'adresse
	 * @param ville la ville ou la personne habite
	 */
	public Personne(String leNom,String lePrenom, int j, int m, int a, int numero, String rue, String code_postal, String ville){
		this(leNom, lePrenom, new GregorianCalendar(a,m,j),new Adresse(numero,rue,code_postal,ville));
	}

	/**
	 * Accesseur
	 * @return retourne le nom
	 */
	public String getNom(){
		return nom;
	}
	/**
	 * Accesseur
	 * @return retourne le prénom
	 */
	public String getPrenom(){
		return prenom;
	}
	/**
	 * Accesseur
	 * @return retourne la date de naissance	 
	 */
	public GregorianCalendar getDateNaissance() {
		return dateNaissance;
	}
	/**
	 * Accesseur
	 * @return retourne l'adresse	 
	 */
	public Adresse getAdresse() {
		return adresse;
	}
	/**
	 * Modificateur
	 * @param retourne l'adresse	 
	 */
	public void setAdresse(Adresse a) {
		adresse=a;
	}
		
	public static int getNbPersonne() {
		return NbP;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		String result="\nNom : "+nom+"\n"
		+"Prénom : "+prenom+"\n"+
		"Né(e) le : "+dateNaissance.get(Calendar.DAY_OF_MONTH)+
		"-"+dateNaissance.get(Calendar.MONTH)+
		"-"+dateNaissance.get(Calendar.YEAR)+"\n"+
		"Adresse : "+
		adresse.toString();
		return result;
	}
	
	public static boolean plusAgee(GregorianCalendar dateNaissancePer1, GregorianCalendar dateNaissancePer2)
 {
		
		int anneePer1 = dateNaissancePer1.get(Calendar.YEAR);
		int anneePer2 = dateNaissancePer2.get(Calendar.YEAR);
		int moisPer1 = dateNaissancePer1.get(Calendar.MONTH);
		int moisPer2 = dateNaissancePer2.get(Calendar.MONTH);
		int joursPer1 = dateNaissancePer1.get(Calendar.DAY_OF_MONTH);
		int joursPer2 = dateNaissancePer2.get(Calendar.DAY_OF_MONTH);
		
		boolean result = false;
		if(anneePer1 < anneePer2) {
			result = true;
		}
		
		if(anneePer1 == anneePer2) {
			
			if(moisPer1 == moisPer2) {
				
				if(joursPer1 > joursPer2) {
					result = true;
				}
				
			}
			
			if(moisPer1 > moisPer2) {
				result = true;
			}
					
				}
				return result;
	}
	public static boolean plusAgeeQue(GregorianCalendar dateNaissancePer1,GregorianCalendar dateNaissancePer2 )
	 {

		int anneePer1 = dateNaissancePer1.get(Calendar.YEAR);
		int anneePer2 = dateNaissancePer2.get(Calendar.YEAR);
		int moisPer1 = dateNaissancePer1.get(Calendar.MONTH);
		int moisPer2 = dateNaissancePer2.get(Calendar.MONTH);
		int joursPer1 = dateNaissancePer1.get(Calendar.DAY_OF_MONTH);
		int joursPer2 = dateNaissancePer2.get(Calendar.DAY_OF_MONTH);
		
			
			boolean result = false;
			
			
			if(anneePer1 < anneePer2) {
				result = false;
			}
			if(anneePer1 == anneePer2) {
				
				if(moisPer1 == moisPer2) {
					
					if(joursPer1 > joursPer2) {
						result = true;
					}
					
				}
				
				if(moisPer1 > moisPer2) {
					result = true;
				}
			}
		
			
			return result;
			}
	public boolean equals(Object obj) {
	    if (this == obj)
	     return true;
	    if (obj == null)
	      return false;
	    if (getClass() != obj.getClass())
	      return false;
	    
	    Personne other = (Personne) obj;
	    
	    if (nom == null) {
		      if (other.nom != null)
		        return false;
		    } else if (!nom.equals(other.nom)) 
		    	return false;
	    
	    if (prenom == null) {
		      if (other.prenom != null)
		        return false;
		    } else if (!prenom.equals(other.prenom)) 
		    	return false;
	    
	    if (dateNaissance == null) {
		      if (other.dateNaissance != null)
		        return false;
		    } else if (!dateNaissance.equals(other.dateNaissance)) 
		    	return false;
	    
	    return true;
	  }
	
}
		


    
   
   
