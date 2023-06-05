package fr.mimifan.polymorphism.shapes.base;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public abstract class Shape extends JPanel {
	
	Color color;
	boolean selected = false, filled;
	int thickness;
	Point anchor;
	
	public Shape(Color _color, int x, int y, int _thickness, boolean _filled) {
		color=_color; anchor = new Point(x, y); thickness=_thickness; filled=_filled;
	}
	public Shape(Color _color, int x, int y, int _thickness) {
		color=_color; anchor = new Point(x, y); thickness=_thickness;
	}

	
	public Color getColor() {return color;}
	public void setColor(Color color) {this.color = color;}
	
	public boolean isSelected() {return selected;}
	public void setSelected(boolean selected) {this.selected = selected;}
	
	public boolean isFilled() {return filled;}
	public void setFilled(boolean filled) {this.filled = filled;}
	
	public int getThickness() {return thickness;}
	public void setThickness(int thickness) {this.thickness = thickness;}
	
	public Point getAnchor() {return anchor;}
	public void setAnchor(Point anchor) {this.anchor = anchor;}
	
	public boolean isOver(int _x, int _y) { return anchor.isOver(_x, _y); }
	
	public abstract String getTypename();
	@Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Appel à la méthode paintComponent de la classe parente
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(getColor());
        
        // Dessiner le rectangle
        g2d.drawRect(getWidth() / 2, getHeight() / 2, 50, 50);
        if (isFilled()) {
            g2d.fillRect(getWidth() / 2, getHeight() / 2, 50, 50);
        }
    }
	
}
