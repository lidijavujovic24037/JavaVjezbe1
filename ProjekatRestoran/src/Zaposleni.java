
public class Zaposleni {
	    protected int id;
	    protected String prezime;
	    protected double satnica;
	    protected int radniSati;

	    public Zaposleni(int id, String prezime, double satnica, int radniSati) {
	        this.id = id;
	        this.prezime = prezime;
	        this.satnica = satnica;
	        this.radniSati = radniSati;
	    }

	    public double izracunajPlatu() {
	       
	        return 0;
	    }

	    @Override
	    public String toString() {
	        return "Zaposleni ID: " + id + ", Prezime: " + prezime;
	    }

		public String getTip() {
			// TODO Auto-generated method stub
			return null;
		}

	
}
