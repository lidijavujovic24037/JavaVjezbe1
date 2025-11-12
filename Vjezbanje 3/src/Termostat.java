//soba 
public class Termostat {
	private int minTemp = 16; // minimalna temperatura
    private int maxTemp = 28; // maksimalna temperatura
    private String mod;       // "GRIJANJE" ili "HLADJENJE"

    // Konstruktor
    public Termostat(String mod) {
        setMod(mod);
    }

    // Getere
    public int getMinTemp() {
        return minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public String getMod() {
        return mod;
    }

    // Setere
    public void setMod(String mod) {
        if (mod.equals("GRIJANJE") || mod.equals("HLADJENJE")) {
            this.mod = mod;
        } else {
            throw new IllegalArgumentException("Mod mora biti 'GRIJANJE' ili 'HLADJENJE'.");
        }
    }

    // Metod korakPromjene
    public int korakPromjene(int tren, int cilj) {
        if (mod.equals("GRIJANJE")) {
            return (tren < cilj) ? tren + 1 : tren;
        } else if (mod.equals("HLADJENJE")) {
            return (tren > cilj) ? tren - 1 : tren;
        }
        return tren; // U slučaju greške, vraća trenutnu temperaturu
    }
}

