/*Napisati klasu Vektor2D sa atributima: x (double), y (double). Potrebno je kreirati: 
a. Konstruktor; getere/setere. 
b. Metod pomjeri(double dx, double dy) koji dodaje na koordinate.  
c. Metod postavi(double nx, double ny).  
Napisati klasu Projektil sa atributima: pozX (double), pozY (double), velX (double), 
velY (double). Potrebno je kreirati: 
a. konstruktor; getere/setere.  
b. Metod update(double dt) koji ažurira poziciju:  
pozX += velX * dt, pozY += velY * dt.  
c. Metod odbijAkoVanOkvira(int xMin, int xMax, int yMin, int yMax) koji 
invertuje odgovarajuću komponentu brzine i “zalijepi” poziciju na granicu ako 
izađe.  
Napisati glavnu klasu Simulator koja kreira jedan Projektil i jedan Vektor2D kao 
pomoćnu tačku okvira (npr. za lakši ispis ili reset). Više puta poziva update(dt), zatim 
odbijAkoVanOkvira(...), i ispisuje poziciju.*/
public class Vektor2D {
	private double x; // x koordinata
    private double y; // y koordinata

    // Konstruktor
    public Vektor2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getere
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // Setere
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Metod pomjeri
    public void pomjeri(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    // Metod postavi
    public void postavi(double nx, double ny) {
        this.x = nx;
        this.y = ny;
    }
}

