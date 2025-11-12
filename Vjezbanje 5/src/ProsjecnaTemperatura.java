/*Dat je primjera log-a sa nekog senzora koji se koristi za mjerenje određenih 
parametara vazduha i to u sledećem obliku (tip podatka je string): 
"T=18.6C;H=55%;TS=2025-10-24T11:03|T=19.1C;H=54%;TS=2025-10-24T1
 1:08|...". Napisati metodu koja iz stringa izdvaja sve zapise i vraća prosječnu 
temperaturu (sa 1 decimalom) samo za zapise čiji je minut u intervalu [10,20). 
Ako postoji greška u formatu zapisa, taj zapis preskoči. */
import java.util.Scanner;

public class ProsjecnaTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Unesite log: ");
        String log = scanner.nextLine();
        
        double prosecnaTemperatura = izracunajProsecnuTemperaturu(log);
        System.out.printf("Prosečna temperatura: %.1f°C%n", prosecnaTemperatura);
    }

    public static double izracunajProsecnuTemperaturu(String log) {
        String[] zapisi = log.split("\\|");
        double suma = 0;
        int brojZapisa = 0;

        for (String zapis : zapisi) {
            String[] delovi = zapis.split(";");
            try {
                String tempString = delovi[0].split("=")[1].replace("C", "");
                String tsString = delovi[2].split("=")[1];
                
                String[] vreme = tsString.split("T")[1].split(":");
                int minut = Integer.parseInt(vreme[1]);

                if (minut >= 10 && minut < 20) {
                    double temperatura = Double.parseDouble(tempString);
                    suma += temperatura;
                    brojZapisa++;
                }
            } catch (Exception e) {
                
                continue;
            }
        }

        return brojZapisa > 0 ? suma / brojZapisa : 0;
    }
}