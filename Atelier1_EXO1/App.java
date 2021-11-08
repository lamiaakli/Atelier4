package Atelier1_EXO1;

public class App {
	public static void main(String[] args) {

        De monDe = null;
        try {
            monDe = new De(2,"Toto");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println(monDe);

    }

}
