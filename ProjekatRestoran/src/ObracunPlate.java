import java.util.ArrayList;
import java.util.List;

class ObracunPlate {
    private int mesec;
    private int godina;
    private Zaposleni zaposlen;
    private double iznos;
    private String napomena;

    public ObracunPlate(int mesec, int godina, Zaposleni zaposlen, double iznos, String napomena) {
        this.mesec = mesec;
        this.godina = godina;
        this.zaposlen = zaposlen;
        this.iznos = iznos;
        this.napomena = napomena;
    }

    @Override
    public String toString() {
        return String.format("Mesec: %d, Godina: %d, Zaposleni: %s, Iznos: %.2f, Napomena: %s",
                mesec, godina, zaposlen.prezime, iznos, napomena);
    }
}
