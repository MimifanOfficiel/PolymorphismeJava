package fr.mimifan.polymorphism.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import fr.mimifan.polymorphism.shapes.base.Shape;

@SuppressWarnings("serial")
public class Rectangle extends Shape {
	
	int width, height;

	public Rectangle(Color _color, int x, int y, int _thickness, int _width, int _height) {
	    super(_color, x, y, _thickness);
	    width = _width;
	    height = _height;
	}


	@Override
	public String getTypename() {return "Rectangle";}
	
	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}
	
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Appel à la méthode paintComponent de la classe parente
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(getColor());
        
        // Dessiner le rectangle
        g2d.drawRect(getWidth() / 2, getHeight() / 2, width, height);
        if (isFilled()) {
            g2d.fillRect(getWidth() / 2, getHeight() / 2, width, height);
        }
    }
	
	
}
