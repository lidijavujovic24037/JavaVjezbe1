
public class GeometryApp {
	public static void main(String[] args) {
        // Kreiranje pravougaonika
        Pravougaonik pravougaonik = new Pravougaonik(2, 2, 5, 3);
        pravougaonik.ispisi();

        // Kreiranje tačke
        Tacka tacka = new Tacka(4, 3);
        tacka.ispisi();

        // Provera da li tačka pripada pravougaoniku
        boolean sadrzi = pravougaonik.sadrzi(tacka.getX(), tacka.getY());
        System.out.println("Da li pravougaonik sadrži tačku? " + sadrzi);

        // Provera preklapanja dva pravougaonika
        Pravougaonik drugiPravougaonik = new Pravougaonik(4, 1, 4, 3);
        boolean preklapa = proveriPreklapanje(pravougaonik, drugiPravougaonik);
        System.out.println("Da li se pravougaonici preklapaju? " + preklapa);
    }

    // Metod za proveru preklapanja dva pravougaonika
    public static boolean proveriPreklapanje(Pravougaonik r1,Pravougaonik r2) {
        return (r1.getX() < r2.getX() + r2.getWidth() &&
                r1.getX() + r1.getWidth() > r2.getX() &&
                r1.getY() < r2.getY() + r2.getHeight() &&
                r1.getY() + r1.getHeight() > r2.getY());
}}
