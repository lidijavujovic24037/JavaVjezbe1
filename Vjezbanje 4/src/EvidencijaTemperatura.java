import java.util.Scanner;

public class EvidencijaTemperatura {
    private double[] temperature;

    // Konstruktor
    public EvidencijaTemperatura(int velicina) {
        this.temperature = new double[velicina];
    }

    // Geter za temperature
    public double[] getTemperature() {
        return temperature;
    }

    // Seters za temperature
    public void setTemperature(double[] temperature) {
        this.temperature = temperature;
    }

    // Metoda za izračunavanje prosečne temperature
    public double prosjecnaTemperatura() {
        double suma = 0;
        for (double temp : temperature) {
            suma += temp;
        }
        return suma / temperature.length;
    }

    // Metoda za pronalaženje maksimalne temperature
    public double maksimalnaTemperatura() {
        double max = temperature[0];
        for (double temp : temperature) {
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    // Metoda za uklanjanje temperature iz niza
    public double[] ukloniTemperaturu(double tempZaUklanjanje) {
        int brojPojava = 0;

        // Brojanje pojava temperature koju treba ukloniti
        for (double temp : temperature) {
            if (temp == tempZaUklanjanje) {
                brojPojava++;
            }
        }

        // Ako nema pojavljivanja, vraćamo originalni niz
        if (brojPojava == 0) {
            return temperature;
        }

        // Kreiranje novog niza
        double[] noviNiz = new double[temperature.length - brojPojava];
        int index = 0;

        // Popunjavanje novog niza
        for (double temp : temperature) {
            if (temp != tempZaUklanjanje) {
                noviNiz[index++] = temp;
            }
        }

        return noviNiz;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kreiranje instance EvidencijaTemperatura
        EvidencijaTemperatura evidencija = new EvidencijaTemperatura(5);

        // Unos temperatura
        System.out.println("Unesite 5 temperatura:");
        for (int i = 0; i < 5; i++) {
            evidencija.getTemperature()[i] = scanner.nextDouble();
        }

        // Ispis dužine niza i temperatura
        System.out.println("Dužina niza: " + evidencija.getTemperature().length);
        System.out.println("Unesene temperature:");
        for (double temp : evidencija.getTemperature()) {
            System.out.print(temp + " ");
        }
        System.out.println();

        // Unos temperature za pretragu
        System.out.print("Unesite temperaturu koju želite provjeriti: ");
        double tempZaProvjeru = scanner.nextDouble();
        boolean postoji = false;

        // Provjera da li temperatura postoji
        for (double temp : evidencija.getTemperature()) {
            if (temp == tempZaProvjeru) {
                postoji = true;
                break;
            }
        }

        if (postoji) {
            System.out.println("Temperatura " + tempZaProvjeru + " se nalazi u nizu.");
        } else {
            System.out.println("Temperatura " + tempZaProvjeru + " se ne nalazi u nizu.");
        }

        // Uklanjanje temperature iz niza
        double[] azuriraniNiz = evidencija.ukloniTemperaturu(tempZaProvjeru);
        evidencija.setTemperature(azuriraniNiz);

        // Prikaz ažuriranog niza
        System.out.println("Ažurirani niz temperatura:");
        for (double temp : evidencija.getTemperature()) {
            System.out.print(temp + " ");
        }
        System.out.println();

        // Ispis prosečne i maksimalne temperature
        System.out.printf("Prosečna temperatura: %.2f%n", evidencija.prosjecnaTemperatura());
        System.out.printf("Maksimalna temperatura: %.2f%n", evidencija.maksimalnaTemperatura());
    }
}