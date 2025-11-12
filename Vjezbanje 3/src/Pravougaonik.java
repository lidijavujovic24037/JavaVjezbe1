/*Napisati klasu Pravougaonik sa atributima: x (int), y (int), width (int), height (int). 
Potrebno je odraditi:  
a. Konstruktor; getere/setere. 
b.  Metod sadrzi(int tx, int ty) koji vraća true ako je tačka sa koordinatama (tx, 
ty) unutar pravougaonika (ivice uključene).  
c. Metod ispisi() za stampanje informacija o pravouganiku.  
Napisati klasu Tacka sa atributima: x (int), y (int). Potrebno je odraditi konstruktor; 
getere/setere; ispisi().  
Napisati glavnu klasu GeometryApp (naziv fajla) koja kreira jedan Pravougaonik i 
jednu Tacka. Poziva sadrzi(tacka.getX(), tacka.getY()) i ispisuje rezultat. Provjeri 
preklapanje dva pravougaonika korišćenjem samo njihovih koordinata u ovoj klasi.*/
public class Pravougaonik {
	 private int x;      // x koordinata donjeg levog ugla
	    private int y;      // y koordinata donjeg levog ugla
	    private int width;  // širina pravougaonika
	    private int height; // visina pravougaonika

	    // Konstruktor
	    public Pravougaonik(int x, int y, int width, int height) {
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	    }
	    // Getere
	    public int getX() {
	        return x;
	    }

	    public int getY() {
	        return y;
	    }

	    public int getWidth() {
	        return width;
	    }

	    public int getHeight() {
	        return height;
	    }

	    // Setere
	    public void setX(int x) {
	        this.x = x;
	    }
	    public void setY(int y) {
	        this.y = y;
	    }

	    public void setWidth(int width) {
	        this.width = width;
	    }

	    public void setHeight(int height) {
	        this.height = height;
	    }

	    // Metod sadrzi
	    public boolean sadrzi(int tx, int ty) {
	        return (tx >= x && tx <= (x + width)) && (ty >= y && ty <= (y + height));
	    }
	    public void ispisi() {
	        System.out.println("Pravougaonik [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]");
	    }
	
}
