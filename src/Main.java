import java.util.ArrayList;

import processing.core.PApplet;

public class Main extends PApplet {

	private ArrayList<Cuadrado> SquareList;// Squares arraylist
	private Cuadrado square; // object

	public Main() {
	}

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}

	public void settings() {
		size(800, 800);

	}

	public void setup() {
		SquareList = new ArrayList<Cuadrado>(); // Squares arraylist
		rectMode(CENTER); // place the dot in the center of the square
		frameRate(60); // time when the squears appear (interval)

	}

	public void draw() {
		background(109,159,171);
		initSquare(); // calling method in the mousePressed
		drawSquare(); // calling method in the mousePressed
		removeSquares(); //remove squares 
	}

	public void mousePressed() {
		clickSquares(); // calling method in the mousePressed
	}

	private void initSquare() {
		if (frameCount == 60) {
			int tam = (int) random(30, 60);
			int posX = (int) random(50, 750);
			SquareList.add(new Cuadrado(posX, -50, tam, tam, this));
			System.out.println(SquareList.size());
			frameCount = 0;
		}
	}
	
	private void drawSquare() {  
		for (int i = 0; i < SquareList.size(); i++) {
			SquareList.get(i).drawRect();
			
		}
	}

	private void clickSquares() { //sensitive range method
		for (int i = 0; i < SquareList.size(); i++) {
			if (mouseX > (SquareList.get(i).getPosX() - (SquareList.get(i).getTamX() / 2))
					&& mouseX < (SquareList.get(i).getPosX() + (SquareList.get(i).getTamX() / 2))
					&& mouseY > (SquareList.get(i).getPosY() - (SquareList.get(i).getTamY() / 2))
					&& mouseY < (SquareList.get(i).getPosY() + (SquareList.get(i).getTamY() / 2))) {
				SquareList.get(i).setMov(!SquareList.get(i).isMov());
			}
		}
	}
	
	private void removeSquares() { //remove squares 
		
		for (int i=0; i<SquareList.size(); i++) {
			if (SquareList.get(i).getPosY()< 1 && SquareList.get(i).getDir()==-1){
				SquareList.remove(i);	
			}
		}
	

	}

}
