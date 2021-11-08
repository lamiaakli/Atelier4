package Atelier3;

public class Parallélogramme extends Geometrie2D {
	private double a;

	   private double l;
	    private double h;
	    private double b;
	    
	    public Parallélogramme(String name, double b, double l, double h , double a) {
	        super(name);
	        this.b = b;
	        this.l = l;
	        this.h = h;
	        this.a = a;
	    }
	    public double Surface() {
	        double surface = l*h;
	        return surface;
	    }
	    
	    public double Perimetre() {
	        double perimetre = 2* (a+b) ;
	        return perimetre;
	    }
	    
	
	    public String toString() {
	        String message = "Vous venez de construire un Parallelogramme"
	                        + "\nSon Périmètre est de " + Perimetre() + "m"
	                        + "\nSa surface est de " + Surface() + "m²";
	        return message;
	    }
}



