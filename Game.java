//Lidija Vujovic 24/037,Ana Kovacevic 24/075,Vasilisa Kurilova 24/061

package vjezbanje;
public class Player {
	private int x;
	private int y;
	private int width;
	private int height;
	private int health;
	

	//Konstruktor
	public class Player (int x,int y,int widht,int height,int health) {
		this.x=x;
		this.y=y;
		this.widht=widht;
		this.height=height;
		sethealth(health);
		
	//geteri
		public int getX() {return x;
		}
		public int getY() {return y;
		}
		public int getWidht() {return widht;
		}
		public int getHeight() {return height;
		}
		public int getHealth() {return health;
		}
		
		//seteri
		public void sethealth(int health) {
			if (health<0) this.health=100;
			else this.health=health;

	
	public class Enemy{
		private int x;
		private int y;
		private int widht;
		private int height;
		private int damage;
		
		public Emeny(int x,int y,int widht,int height,int damage) {
			
		}
	}
			
		}
		
	
		

	}

}
