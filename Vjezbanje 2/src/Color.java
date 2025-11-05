/*Kreirati klasu Color koja ima tri privatna atributa: red, green i blue (vrijednosti 
0–255). Napraviti konstruktor koji postavlja početne vrijednosti svih atributa. 
a. Napraviti getere i setere za sve atribute. U seterima treba provjeriti da li je 
vrijednost između 0 i 255. Ako nije, ispisati poruku i ne mijenjati vrijednost.  
b. Napraviti metode addRed(int change), addGreen(int change) i addBlue(int 
change) koje mijenjaju vrijednost odgovarajuće boje za zadatu količinu 
(pozitivnu ili negativnu). Ako promjena izađe van [0,255], ispisati poruku i 
postaviti vrijednost na granicu (0 ili 255).  
c. Napraviti metodu printColor() koja ispisuje vrijednosti svih boja u obliku: "red: 
X, green: Y, blue: Z".*/
public class Color {
//atributi
private int red;
private int green;
private int blue;
//Kontruktor koji postavlja pocetne vrijednosti
public Color(int red, int green, int blue) {
	this.red = red;
	this.green = green;
	this.blue = blue;
}
//Getteri
public int getRed() {
    return red;
}

public int getGreen() {
    return green;
}

public int getBlue() {
    return blue;
}
//Setteri
public void setRed(int red) {
    if (red >= 0 && red <= 255) {
        this.red = red;
    } else {
        System.out.println("Nevažeća vrednost za crvenu boju. Mora biti između 0 i 255.");
    }
}

public void setGreen(int green) {
    if (green >= 0 && green <= 255) {
        this.green = green;
    } else {
        System.out.println("Nevažeća vrednost za zelenu boju. Mora biti između 0 i 255.");
    }
}

public void setBlue(int blue) {
    if (blue >= 0 && blue <= 255) {
        this.blue = blue;
    } else {
        System.out.println("Nevažeća vrednost za plavu boju. Mora biti između 0 i 255.");
    }
}

//Metode za promenu boje
public void addRed(int change) {
    int newRed = red + change;
    if (newRed < 0) {
        red = 0;
        System.out.println("Crvena boja je postavljena na 0.");
    } else if (newRed > 255) {
        red = 255;
        System.out.println("Crvena boja je postavljena na 255.");
    } else {
        red = newRed;
    }}


public void addGreen(int change) {
    int newGreen = green + change;
    if (newGreen < 0) {
        green = 0;
        System.out.println("Zelena boja je postavljena na 0.");
    } else if (newGreen > 255) {
        green = 255;
        System.out.println("Zelena boja je postavljena na 255.");
    } else {
        green = newGreen;
    }
}
public void addBlue(int change) {
    int newBlue = blue + change;
    if (newBlue < 0) {
        blue = 0;
        System.out.println("Plava boja je postavljena na 0.");
    } else if (newBlue > 255) {
        blue = 255;
        System.out.println("Plava boja je postavljena na 255.");
    } else {
        blue = newBlue;
    }
}
// Metoda za ispis boje
public void printColor() {
    System.out.printf("red: %d, green: %d, blue: %d\n", red, green, blue);
}
}
