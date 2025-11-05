/*U ovom zadatku staza je prsten između krugova sa centrom (cx
 , cy
 ) i poluprečnicima 
R1
 <R2
 . Unosi se N tačaka (xi
 ,yi
 ). Potrebno je prebrojati trkače koji su u prstenu 
uključujući granice i u gornjoj poluravni yi
 ≥cy
 . Takođe je potrebno izračunati 
najudaljenijeg trkačima od centra, po euklidskom rastojanju.*/
import java.util.Scanner;
public class Prsten {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Unos centra i poluprečnika
        System.out.print("Unesite koordinate centra (cx, cy): ");
        double cx = scanner.nextDouble();
        double cy = scanner.nextDouble();

        System.out.print("Unesite poluprečnike R1 i R2: ");
        double R1 = scanner.nextDouble();
        double R2 = scanner.nextDouble();

        System.out.print("Unesite broj tačaka N: ");
        int N = scanner.nextInt();
     // Inicijalizacija brojača i najudaljenijeg rastojanja
        int brojac = 0;
        double najudaljenijiRastojanje = 0;

        // Unos tačaka i obrada
        for (int i = 0; i < N; i++) {
            System.out.print("Unesite koordinate tačke " + (i + 1) + " (xi, yi): ");
            double xi = scanner.nextDouble();
            double yi = scanner.nextDouble();

            // Izračunavanje euklidskog rastojanja
            double rastojanje = Math.sqrt(Math.pow(xi - cx, 2) + Math.pow(yi - cy, 2));

            // Proveravanje da li je tačka u prstenu i gornjoj poluravni
            if (rastojanje >= R1 && rastojanje <= R2 && yi >= cy) {
                brojac++;
                if (rastojanje > najudaljenijiRastojanje) {
                	najudaljenijiRastojanje = rastojanje;
                }
            }
        }

        // Prikaz rezultata
        System.out.println("Broj trkača u prstenu: " + brojac);
        System.out.println("Najudaljeniji trkač je na rastojanju: " + najudaljenijiRastojanje);

        scanner.close();
                }

	}


