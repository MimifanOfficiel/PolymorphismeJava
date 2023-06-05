package fr.mimifan.polymorphism.shapes.base;

public class Point {

	int x, y, size = 3;
	
	public Point(int _x, int _y) {
		x=_x; y=_y;
	}
	
	public int getX() {return x;}
	public int getY() {return y;}
	public void setXY(int _x, int _y) {x=_x; y=_y;}
	public boolean isOver(int _x, int _y) {return ((x>_x ? x-_x : _x-x) <= size && (y>_y ? y-_y : _y-y) <= size);}
	
}
