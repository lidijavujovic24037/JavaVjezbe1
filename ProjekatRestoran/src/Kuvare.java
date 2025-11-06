class Kuvare extends Zaposleni {
    private static final double FIKSNI_IZNOS = 1500;

    public Kuvare(int id, String prezime, double satnica, int radniSati) {
        super(id, prezime, satnica, radniSati);
    }

    @Override
    public double izracunajPlatu() {
        double varijabilnaPlata = radniSati * satnica * 4; 
        return FIKSNI_IZNOS + varijabilnaPlata;
    }

    @Override
    public String getTip() {
        return "Kuvare";
    }

    @Override
    public String toString() {
        return super.toString() + ", Mesečna plata: " + izracunajPlatu() + " evra";
    }
}