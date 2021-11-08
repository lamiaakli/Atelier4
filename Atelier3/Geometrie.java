package Atelier3;

public abstract class Geometrie 
{
	
	private String name;
	private String identifiant;
	private static int nbG;
	
	
	public 	Geometrie (String name) {
		this.name = name;
		nbG++;
		this.identifiant = name + "_n";
		
		
	}
public abstract double Surface();
}
