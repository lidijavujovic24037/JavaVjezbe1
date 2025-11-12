//Kreirati StringBuilder sa sadržajem „programiranje“. Obrisati slova od 3. do 6. indeksa.
public class UkloniSlova {
    public static void main(String[] args) {
       
        StringBuilder sb = new StringBuilder("programiranje");

       
        System.out.println("Originalni sadržaj: " + sb.toString());

       
        sb.delete(3, 7);

     
        System.out.println("Ažurirani sadržaj: " + sb.toString());
    }
}