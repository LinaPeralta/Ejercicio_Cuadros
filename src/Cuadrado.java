import processing.core.PApplet;

public class Cuadrado {
	
	private int posX, posY, tamX,tamY;
	private boolean isMov;
	int alt = -5;
	int velocidad = 2;
	private int dir = 1;
	int r,g,b;
	private PApplet app;
	
	public Cuadrado (int posX,int posY,int tamX,int tamY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.tamX = tamX;
		this.tamY = tamY;
		isMov = true;
		//rebote = true;
		this.app = app;
		this.dir = dir;
		
	}
	
	public void drawRect () {
		app.noStroke();
		app.fill(135,71,118);
		//app.fill(app.random(255),app.random(255),app.random(255));
		app.rect(posX,posY,tamX,tamY);
		mov();
	}
	
	public void mov() {
		
		if (isMov) {
	
			posY += velocidad*dir;
			

			if (posY>=800) {
			 dir =- dir;
			} 
			
		}
	}
			
	public void setMov (boolean isMov) {
		this.isMov =  isMov;
	}
	
	public boolean isMov() {
		return isMov;
	}

	public int getPosX() {
		return posX;
	}


	public int getPosY() {
		return posY;
	}

	public int getTamX() {
		return tamX;
	}

	public int getTamY() {
		return tamY;
	}
	
	public int getVelocidad() {
		return velocidad;
	}
	
	public int getDir() {
		return dir;
	}
	
	

	
	

	
	
}
