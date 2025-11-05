
public class Enemy {
	//atributi klase 
	private int x;
	private int y;
	private int height;
	private int width;
	private int damage;
	//Konstruktor
	public Enemy(int x, int y, int height, int width, int damage) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.damage = damage;
	}
	//Geteri i seteri 
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		if(damage<0) {
		this.damage = 0;
		} else if (damage > 100) {
            this.damage = 100;
	}else{
        this.damage = damage;
		
	}
	
	}}
