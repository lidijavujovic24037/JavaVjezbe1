public enum Student {
    MARKO("Marko Marković", 8, 9, 7),
    JANA("Jana Jovanović", 10, 9, 8),
    PETAR("Petar Petrović", 6, 5, 7),
    ANJA("Anja Anić", 9, 8, 10),
    IVAN("Ivan Ivanić", 7, 6, 8);

    private final String imePrezime;
    private final int ocjena1;
    private final int ocjena2;
    private final int ocjena3;

    // Konstruktor
    Student(String imePrezime, int ocjena1, int ocjena2, int ocjena3) {
        this.imePrezime = imePrezime;
        this.ocjena1 = ocjena1;
        this.ocjena2 = ocjena2;
        this.ocjena3 = ocjena3;
    }

    // Metoda za izračunavanje prosjeka
    public double izracunajProsjek() {
        return (ocjena1 + ocjena2 + ocjena3) / 3.0;
    }

    // Getter za ime i prezime
    public String getImePrezime() {
        return imePrezime;
    }
}

class TestStudenti {
    public static void main(String[] args) {
        // Ispis imena i prezimena studenata sa njihovim prosjekom
        for (Student student : Student.values()) {
            System.out.printf("%s - Prosjek: %.2f%n", student.getImePrezime(), student.izracunajProsjek());
        }
    }
}