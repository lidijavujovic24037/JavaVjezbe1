
	public class Kamion extends Vozila {
	    private double kapacitetTerena;
	    private boolean prikolica;
	    //Konstruktor
	    public Kamion(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja, double kapacitetTerena, boolean prikolica) {
	        super();
	        this.kapacitetTerena = kapacitetTerena;
	        this.prikolica = prikolica;
	        
	    } //Gereri i seteri 
		public double getKapacitetTerena() {
			return kapacitetTerena;
		}
		public void setKapacitetTerena(double kapacitetTerena) {
			this.kapacitetTerena = kapacitetTerena;
		}
		public boolean isPrikolica() {
			return prikolica;
		}
		public void setPrikolica(boolean prikolica) {
			this.prikolica = prikolica;
		}
	@Override
    public double izracunajCijenuRegistracije() {
    
        double cijena = super.izracunajCijenuRegistracije();

        if (prikolica) {
            cijena += 50;
        }

        return cijena;
    }}

