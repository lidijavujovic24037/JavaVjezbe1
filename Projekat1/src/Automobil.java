
	public class Automobil extends Vozila {
	    private int brojVrata;
	    private String tipMotora;
	    //Kontruktor
	    public Automobil(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja, int brojVrata, String tipMotora) {
	        super();
	        this.brojVrata = brojVrata;
	        this.tipMotora = tipMotora;

	    }
	    //Geteri i seteri
		public int getBrojVrata() {
			return brojVrata;
		}
		public void setBrojVrata(int brojVrata) {
			this.brojVrata = brojVrata;
		}
		public String getTipMotora() {
			return tipMotora;
		}
		public void setTipMotora(String tipMotora) {
			this.tipMotora = tipMotora;
		}}

