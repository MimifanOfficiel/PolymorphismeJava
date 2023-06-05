package fr.mimifan.polymorphism;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import fr.mimifan.polymorphism.shapes.Rectangle;

@SuppressWarnings("serial")
public class Window extends JFrame implements KeyListener {
	
	private boolean[] keysPressed;
	public static JPanel mainPanel = new JPanel();
	
	public Window() {
		setTitle("Polymorphisme");
		setSize(500, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(buildContentPane());
		addKeyListener(this);
		
		keysPressed = new boolean[256];
	}
	
	private Container buildContentPane() {
		mainPanel.add(new Rectangle(Color.BLACK, getWidth() / 2, getHeight() / 2, 20, 45, 45));
        return mainPanel;
	}
	

	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
        if (!keysPressed[keyCode]) {
        	switch (keyCode) {
        		case KeyEvent.VK_R:
        			Rectangle rec = new Rectangle(Color.BLACK, getWidth()/2, getHeight()/2, 20, 45, 45);
        			mainPanel.add(rec);
        			break;
        			
        		case KeyEvent.VK_Q:
        			System.exit(0);
        			break;
        			
        	}
            keysPressed[keyCode] = true;
        }
        return;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
        keysPressed[keyCode] = false;
	}
	
	

	@Override
	public void keyTyped(KeyEvent e) {}
}
