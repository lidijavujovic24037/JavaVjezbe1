//vektor2d,
public class Projektil {
	private double pozX; // trenutna x pozicija
    private double pozY; // trenutna y pozicija
    private double velX; // brzina po x
    private double velY; // brzina po y

    // Konstruktor
    public Projektil(double pozX, double pozY, double velX, double velY) {
        this.pozX = pozX;
        this.pozY = pozY;
        this.velX = velX;
        this.velY = velY;
    }

    // Getere
    public double getPozX() {
        return pozX;
    }

    public double getPozY() {
        return pozY;
    }

    public double getVelX() {
        return velX;
    }

    public double getVelY() {
        return velY;
    }

    // Setere
    public void setPozX(double pozX) {
        this.pozX = pozX;
    }

    public void setPozY(double pozY) {
        this.pozY = pozY;
    }

    public void setVelX(double velX) {
        this.velX = velX;
    }

    public void setVelY(double velY) {
        this.velY = velY;
    }

    // Metod update
    public void update(double dt) {
        pozX += velX * dt;
        pozY += velY * dt;
    }

    // Metod odbijAkoVanOkvira
    public void odbijAkoVanOkvira(int xMin, int xMax, int yMin, int yMax) {
        if (pozX < xMin) {
            pozX = xMin;
            velX = -velX; // inverzija brzine
        } else if (pozX > xMax) {
            pozX = xMax;
            velX = -velX; // inverzija brzine
        }

        if (pozY < yMin) {
            pozY = yMin;
            velY = -velY; // inverzija brzine
        } else if (pozY > yMax) {
            pozY = yMax;
            velY = -velY; // inverzija brzine
        }
    }
}

