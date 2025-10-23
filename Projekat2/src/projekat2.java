import java.util.ArrayList;

class Player {
private String ime;
private int x;
private int y;
private int width;
private int height;
private int health;
//Kontruktor
public Player(String ime, int x, int width, int height, int health) {
	    this.x=x;
	    this.y=y;
		this.width = width;
		this.height = height;
		this.health = health;
}
 @Override
public String toString() { 
return String.format("Player[ime=%s],@(%d,%d),%d%d,HP=%d,ime,x,y,width,height,health");
}
		 
		
//Geteri i seteri

	

public String getIme() {
	return ime;}
public void setIme(String ime) {
	this.ime = ime;}
public int getX() {
	return x;}
public void setX(int x) {
	this.x = x;}
public int getY() {
	return y;}
public void setY(int x) {
	this.x = y;}
public int getWidth() {
	return width;}
public void setWidth(int width) {
	this.width = width;}
public int getHeight() {
	return height;}
public void setHeight(int height) {
	this.height = height;}
public int getHealth() {
	return health;}
public void setHealth(int health) {
	this.health = health;}
{



if(health >=0 && health <=100) {
	this.health=health;

}else {
	System.out.println("Player mora biti izmedju 0 i 100.");

}
class Enemy {
	private String type;
	private int x;
	private int y;
	private int width;
	private int height;
	private int damage;
	//Kontruktor 
	public Enemy(String type, int x, int width, int height, int damage) {
	    this.x=x;
	    this.y=y;
		this.width = width;
		this.height = height;
		this.damage = damage;
	}
	 @Override
	public String toString() { 
	return String.format("Enemy[ime=%s],@(%d,%d),%d%d,DMG=%d,ime,x,y,width,height,damage");
	}
		
		
		//Geteri i seteri 
		
	

	public String getType() {
		return type;}
	public void setType(String type) {
		this.type = type;}
	public int getX() {
		return x;}
	public void setX(int x) {
		this.x = x;}
	public int getY() {
		return y;}
	public void setY(int y) {
		this.y = y;}
	public int getWidth() {
		return width;}
	public void setWidth(int width) {
		this.width = width;}
	public int getHeight() {
		return height;}
	public void setHeight(int height) {
		this.height = height;}
	public int getDamage() {
		return damage;}
	public void setDamage(int damage) {
		this.damage = damage;
		

	if(damage >=0 && damage <=100) {
		this.damage=damage;
	
	}else {
		System.out.println("damage mora biti izmedju 0 i 100.");
	}}

public class Game {

	public Player player; //objekat tipa player
	public ArrayList<Enemy>enemies;  //lista prijatelja
	public ArrayList<String>eventLog; //sta dogadjaja
	
//Konstruktor
	public Game() {
		this.player=null;
		this.enemies=new ArrayList<Enemy>();
		this.eventLog=new ArrayList<String>();
		
	}
	//Provjera sudara
	public static boolean checkCollision(Player p,Enemy e) {
		return(p.getX()<e.getX()+e.getWidth()&& p.getX()+p.getY()<e.getY()+e.getHeight()&& p.getHeight()>e.getY());
	}
//Smanji health ako ima suadara
public static void decreaseHealth(Player p,Enemy e) {
	if(checkCollision(p,e)) {
		int novoHealth=p.getHealth()-e.getDamage();
		if(novoHealth<0) novoHealth=0;
		p.setHealth(novoHealth);
		System.out.println("Kolizija ! Health smanjen na:" + p.getHealth());
		
	}
}}}}}
		
	



