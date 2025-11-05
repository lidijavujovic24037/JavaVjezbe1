
public class Game {

	    // Metoda za proveru sudara između igrača i neprijatelja
	    public static boolean checkCollision(Player p, Enemy e) {
	        // Proveravamo da li se igrač i neprijatelj preklapaju
	        return (p.getX() < e.getX() + e.getWidth() &&
	                p.getX() + p.getWidth() > e.getX() &&
	                p.getY() < e.getY() + e.getHeight() &&
	                p.getY() + p.getHeight() > e.getY());
	    }

	    // Metoda za smanjenje zdravlja igrača
	    public static void decreaseHealth(Player p, Enemy e) {
	        int newHealth = p.getHealth() - e.getDamage(); // Smanjujemo zdravlje igrača
	        p.setHealth(newHealth); // Postavljamo novo zdravlje
	    }
	    public static void main(String[] args) {
	        // Kreiramo igrača
	        Player player = new Player(10, 10, 50, 50, 100);
	        
	        // Kreiramo neprijatelje
	        Enemy enemy1 = new Enemy(30, 30, 50, 50, 20);
	        Enemy enemy2 = new Enemy(100, 100, 50, 50, 30);

	        // Proveravamo sudar sa neprijateljem 1
	        if (checkCollision(player, enemy1)) {
	            System.out.println("Sudar sa neprijateljem 1!");
	            decreaseHealth(player, enemy1);
	            System.out.println("Zdravlje igrača nakon sudara: " + player.getHealth());
	        } else {
	            System.out.println("Nema sudara sa neprijateljem 1.");
	        }

	        // Proveravamo sudar sa neprijateljem 2
	        if (checkCollision(player, enemy2)) {
	            System.out.println("Sudar s neprijateljem 2!");
	            		decreaseHealth(player, enemy1);
	                    System.out.println("Zdravlje igrača nakon sudara: " + player.getHealth());
	                } else {
	                    System.out.println("Nema sudara sa neprijateljem 1.");
	                }

	                // Proveravamo sudar sa neprijateljem 2
	                if (checkCollision(player, enemy2)) {
	                    System.out.println("Sudar sa neprijateljem 2!");
	                    decreaseHealth(player, enemy2);
	                    System.out.println("Zdravlje igrača nakon sudara: " + player.getHealth());
	                } else {
	                    System.out.println("Nema sudara sa neprijateljem 2.");
	                }
	            }
	        }

