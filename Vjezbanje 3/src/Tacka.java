
public class Tacka {
	private int x; // x koordinata
    private int y; // y koordinata

    // Konstruktor
    public Tacka(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getere
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
 // Setere
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Metod ispisi
    public void ispisi() {
        System.out.println("Tacka [x=" + x + ", y=" + y + "]");
    }
}

