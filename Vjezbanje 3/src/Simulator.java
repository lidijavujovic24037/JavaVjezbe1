//vektor2d,projektil
public class Simulator {
	    public static void main(String[] args) {
	        // Kreiranje projektila sa pozicijom (5, 5) i brzinom (2, 3)
	        Projektil projektil = new Projektil(5, 5, 2, 3);
	        
	        // Kreiranje vektora kao pomoćne tačke okvira
	        Vektor2D okvir = new Vektor2D(0, 0); // donji levi ugao okvira
	        double xMax = 10;
	        double yMax = 10;

	        // Simulacija
	        double dt = 1.0; // vremenski korak
	        for (int i = 0; i < 10; i++) {
	            projektil.update(dt); // ažuriranje pozicije
	            projektil.odbijAkoVanOkvira((int)okvir.getX(), (int)xMax, (int)okvir.getY(), (int)yMax); // provera okvira
	            
	            // Ispis trenutne pozicije projektila
	            System.out.println("Trenutna pozicija projektila: (" + projektil.getPozX() + ", " + projektil.getPozY() + ")");
	        }
	    }
	}

