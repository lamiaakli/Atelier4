package Atelier3;


	
	public  class Triangle extends Geometrie2D {

	    private double a;
	    private double b;
	    private double c;
	    private double hauteur;
	    
	    public Triangle(String name, double a, double b, double c, double hauteur) {
	        super(name);
	        this.a = a;
	        this.b = b;
	        this.c = c;
	        this.hauteur = hauteur;
	    }
	    
	    public double Surface() {
	        double surface = (b*hauteur)/2;
	        return surface;
	    }
	    
	    public double Perimetre() {
	        double perimetre = a + b + c;
	        return perimetre;
	    }
	    
	    public String toString() {
	        String message = "Vous venez de construire un triangle"
	                        + "\nSon Périmètre est de " + Perimetre() + "m"
	                        + "\nSa surface est de " + Surface() + "m²";
	        return message;
	    }
	}