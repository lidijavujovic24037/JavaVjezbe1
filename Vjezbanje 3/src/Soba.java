/*Napisati klasu Soba sa atributima: trenTemp (int), ciljTemp (int). Potrebno je odraditi 
konstruktor; getere/setere.  
Napisati klasu Termostat sa atributima: minTemp (int = 16), maxTemp (int = 28), mod 
(String: "GRIJANJE" ili "HLADJENJE"). Potrebno je odraditi:  
a. konstruktor; getere/setere (validacija moda).  
b. Metod korakPromjene(int tren, int cilj) koji vraća novu temperaturu:  
a. Ako je mod GRIJANJE i tren < cilj, vrati tren + 1, inače tren.  
b. Ako je mod HLADJENJE i tren > cilj, vrati tren - 1, inače tren.  
Napisati glavnu klasu SmartHome koja kreira sobu i termostat. Postavlja ciljnu 
temperaturu u opsegu [minTemp, maxTemp]. Nekoliko puta ažurira trenTemp = 
termostat.korakPromjene(trenTemp, ciljTemp) i ispisuje promjene.*/
public class Soba {
	private int trenTemp; // trenutna temperatura
    private int ciljTemp; // ciljna temperatura

    // Konstruktor
    public Soba(int trenTemp, int ciljTemp) {
        this.trenTemp = trenTemp;
        this.ciljTemp = ciljTemp;
    }

    // Getere
    public int getTrenTemp() {
        return trenTemp;
    }

    public int getCiljTemp() {
        return ciljTemp;
    }
 // Setere
    public void setTrenTemp(int trenTemp) {
        this.trenTemp = trenTemp;
    }

    public void setCiljTemp(int ciljTemp) {
        this.ciljTemp = ciljTemp;
    }
}


