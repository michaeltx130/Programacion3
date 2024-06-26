//Michelle Jesús Obeso Sánchez IDS TV

package pacman;

import java.awt.Rectangle;

public class Obstaculo {
	
	int x;
	int y;
	int w;
	int h;
	String color;
	
	public Obstaculo() {
	}

	public Obstaculo(int x, int y, int w, int h, String color) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.color = color;
	}

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

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getH() {
		return h;
	}

	public void setH(int h) {
		this.h = h;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	//Esto crea un objeto Rectangle que representa y obtiene los límites del obstáculo
	public Rectangle getBounds() {
        return new Rectangle(x, y, w, h);
    }
}
