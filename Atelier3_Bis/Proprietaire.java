package Atelier3_Bis;

public class Proprietaire {
	protected String name;
	String adress;
	
	
	//Constructor
	
	public Proprietaire(String name, String adress) {
		this.name = name;
		this.adress = adress;
	}
	 // Getter
	  public String getName() {
	    return name;
	  }
	  public String getAdress() {
		    return adress;
		  }

	  // Setter
	  public void setAdress(String newAdress) {
	    this.adress = newAdress;
	  }
	  public String toString() {
			String message = name +"("+ adress+")";
							
			return message;
		}
	}

