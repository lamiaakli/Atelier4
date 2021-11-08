package Atelier3;

public  class Rectangle extends Geometrie2D {

	
	  private double a;
	   private double l;
	    private double h;
	    
	    public Rectangle (String name, double a, double l, double h ) {
	       super(name);
	        this.a = a;
	        this.l = l;
	        this.h = h;
	      
	    }
	    
	    public double Surface() {
	        double surface = l*h;
	        return surface;
	    }
	    
	    public double Perimetre() {
	        double perimetre = a+a+h+h;
	        return perimetre;
	    }
	    
	    public String toString() {
	        String message = "Vous venez de construire un Rectangle"
	                        + "\nSon Périmètre est de " + Perimetre() + "m"
	                        + "\nSa surface est de " + Surface() + "m²";
	        return message;
	    }
}
