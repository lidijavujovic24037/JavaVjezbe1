//soba,termostat 
public class SmartHome {
	public static void main(String[] args) {
        // Kreiranje sobe
        Soba soba = new Soba(20, 25); // trenutna temperatura 20, ciljna 25

        // Kreiranje termostata u modu GRIJANJE
        Termostat termostat = new Termostat("GRIJANJE");

        // Postavljanje ciljane temperature u opsegu [minTemp, maxTemp]
        int ciljTemp = soba.getCiljTemp();
        if (ciljTemp < termostat.getMinTemp() || ciljTemp > termostat.getMaxTemp()) {
            System.out.println("Ciljna temperatura mora biti u opsegu [" + termostat.getMinTemp() + ", " + termostat.getMaxTemp() + "]");
            return;
        }

        // Ažuriranje trenutne temperature nekoliko puta
        for (int i = 0; i < 10; i++) {
            int trenTemp = soba.getTrenTemp();
            soba.setTrenTemp(termostat.korakPromjene(trenTemp, ciljTemp));
            System.out.println("Trenutna temperatura sobe: " + soba.getTrenTemp());
        }
    }
}
	

	


