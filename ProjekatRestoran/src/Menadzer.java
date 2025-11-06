class Menadžer extends Zaposleni {
    private static final double FIKSNI_IZNOS = 1300;
    double bonus;

    public Menadžer(int id, String prezime, double satnica, int radniSati, double bonus) {
        super(id, prezime, satnica, radniSati);
        this.bonus = bonus;
    }

    @Override
    public double izracunajPlatu() {
        double varijabilnaPlata = radniSati * satnica * 4; 
        return FIKSNI_IZNOS + varijabilnaPlata + bonus;
    }

    @Override
    public String getTip() {
        return "Menadžer";
    }

    @Override
    public String toString() {
        return super.toString() + ", Mesečna plata: " + izracunajPlatu() + " evra";
    }
}

