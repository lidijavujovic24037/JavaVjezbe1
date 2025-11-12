/*Kreirati enumeraciju Sezona sa konstantama PROLJEĆE, LJETO, JESEN,
ZIMA. Svaka konstanta ima prosječnu minimalnu i maksimalnu temperaturu
(npr. 5 i 20 za proljeće). Dodati metodu opis() koja vraća tekstualni opis u
formatu: „U sezoni LJETO prosječne temperature se kreću od 20°C do 35°C.“
U glavnom programu, za svaku sezonu prikazati njen opis, a posebno pronaći
sezonu sa najvećim temperaturnim rasponom*/
public enum Sezona {
    PROLJEĆE(5, 20),
    LJETO(20, 35),
    JESEN(10, 25),
    ZIMA(-5, 10);

    private final int minTemperatura; // Minimalna temperatura
    private final int maxTemperatura; // Maksimalna temperatura

    // Konstruktor za inicijalizaciju temperatura
    Sezona(int minTemperatura, int maxTemperatura) {
        this.minTemperatura = minTemperatura;
        this.maxTemperatura = maxTemperatura;
    }

    // Metoda za opis sezone
    public String opis() {
        return String.format("U sezoni %s prosječne temperature se kreću od %d°C do %d°C.", 
                this.name(), minTemperatura, maxTemperatura);
    }

    // Metoda za izračunavanje temperaturnog raspona
    public int temperaturniRaspon() {
        return maxTemperatura - minTemperatura;
    }
}
