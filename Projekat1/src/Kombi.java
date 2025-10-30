public class Kombi extends Vozila {
    private int kapacitetPutnika;
    //Konstruktor
    public Kombi(String proizvodjac, int godinaProizvodnje, double kubikaza, String boja, int kapacitetPutnika) {
        super();
        this.kapacitetPutnika = kapacitetPutnika;
    }
        
    //Geteri i seteri
	public int getKapacitetPutnika() {
		return kapacitetPutnika;
	}
	public void setKapacitetPutnika(int kapacitetPutnika) {
		this.kapacitetPutnika = kapacitetPutnika;
	}}

