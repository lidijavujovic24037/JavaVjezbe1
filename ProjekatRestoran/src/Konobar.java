
	class Konobar extends Zaposleni {
	    protected int prekovremeniSati; 

	    public Konobar(int id, String prezime, double satnica, int radniSati, int prekovremeniSati) {
	        super(id, prezime, satnica, radniSati);
	        this.prekovremeniSati = prekovremeniSati;
	    }

	    public int getPrekovremeniSati() { 
	        return prekovremeniSati;
	    }

	    @Override
	    public double izracunajPlatu() {
	        double osnovnaPlata = radniSati * satnica * 4; 
	        double prekovremenaPlata = prekovremeniSati * (satnica * 1.2);
	        return osnovnaPlata + prekovremenaPlata;
	    }

	    @Override
	    public String getTip() {
	        return "Konobar";
	    }

	    @Override
	    public String toString() {
	        return super.toString() + ", Mesečna plata: " + izracunajPlatu() + " evra";
	    }
	}
