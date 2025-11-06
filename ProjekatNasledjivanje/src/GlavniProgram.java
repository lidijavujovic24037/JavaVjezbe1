import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GlavniProgram {
    public static void main(String[] args, Object maloprodajnaCena) {
        Scanner scanner = new Scanner(System.in);
        List<EProizvodi> proizvodi = new ArrayList<>();
        boolean nastavak = true;

        while (nastavak) {
            System.out.println("Izaberite opciju:");
            System.out.println("1. Unesi uređaj");
            System.out.println("2. Prikaži sve uređaje sa maloprodajnom cenom");
            System.out.println("3. Prikaži uređaje po tipu");
            System.out.println("4. Izlaz");
            int izbor = scanner.nextInt();
            scanner.nextLine(); // čisti ulazni bafer

            switch (izbor) {
                case 1:
                    // Unos uređaja
                    System.out.print("Unesite opis proizvoda: ");
                    String opis = scanner.nextLine();
                    System.out.print("Unesite šifru proizvoda: ");
                    String sifra = scanner.nextLine();
                    System.out.print("Unesite uvoznu cenu proizvoda: ");
                    double uvoznaCena = scanner.nextDouble();
                    scanner.nextLine(); // čisti ulazni bafer
                    System.out.print("Unesite tip uređaja (racunar, telefon, tv): ");
                    String tipUredjaja = scanner.nextLine();
                    double velicinaEkrana = 0;

                    if (tipUredjaja.equalsIgnoreCase("telefon") || tipUredjaja.equalsIgnoreCase("tv")) {
                        System.out.print("Unesite veličinu ekrana (u inčima): ");
                        velicinaEkrana = scanner.nextDouble();
                        scanner.nextLine(); // čisti ulazni bafer
                    }

                    EProizvodi noviProizvod = new EProizvodi(opis, sifra, uvoznaCena, tipUredjaja, velicinaEkrana);
                    proizvodi.add(noviProizvod);
                    System.out.println("Uređaj je uspešno dodat.");
                    break;

                case 2:
                    // Prikaz svih uređaja sa maloprodajnom cenom
                    System.out.println("Svi uređaji sa maloprodajnom cenom:");
                    for (EProizvodi proizvod : proizvodi) {
                        double maloprodajnaCijena = proizvod.izracunajMaloprodajnuCijenu();
                        System.out.printf("Opis: %s, Šifra: %s, Maloprodajna cena: %.2f%n", 
                                          proizvod.getOpis_proizvoda(), proizvod.getSifre_proizvoda(), maloprodajnaCena);
                    }
                    break;

                case 3:
                    // Prikaz uređaja po tipu
                    System.out.print("Unesite tip uređaja za filtriranje (racunar, telefon, tv): ");
                    String tipZaFiltriranje = scanner.nextLine();
                    List<EProizvodi> filtriraniProizvodi = EProizvodi.filtrirajProizvode(proizvodi, tipZaFiltriranje);
                    System.out.println("Uređaji tipa " + tipZaFiltriranje + ":");
                    for (EProizvodi proizvod : filtriraniProizvodi) {
                        double maloprodajnaCijenu = proizvod.izracunajMaloprodajnuCijenu();
                        System.out.printf("Opis: %s, Šifra: %s, Maloprodajna cena: %.2f%n", 
                                          proizvod.getOpis_proizvoda(), proizvod.getSifre_proizvoda(), maloprodajnaCena);
                    }
                    break;

                case 4:
                    // Izlaz
                    nastavak = false;
                    System.out.println("Izlaz iz programa.");
                    break;

                default:
                    System.out.println("Nepoznata opcija, pokušajte ponovo.");
            }
        }

        scanner.close();
    }
}
