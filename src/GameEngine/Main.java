package GameEngine;

import java.awt.Component;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;

import EntityDef.Controller;
import EntityDef.entityMove;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// Fix to actually fit screen ratio
	public static final int WINDOW_WIDTH = 1920;
	public static final int WINDOW_HEIGHT = 1080;

	static Scanner scan = new Scanner(System.in);

	public Main() {
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GameCanvas canvas = new GameCanvas(this.getContentPane().getWidth(), this.getContentPane().getHeight());
		add(canvas);

		this.addComponentListener(new ComponentAdapter() {
			public void componentResized(ComponentEvent evt) {
				Component c = (Component) evt.getSource();
				canvas.updateScale(c.getWidth(), c.getHeight());
			}
		});

		pack();
	}

	public static void main(String[] args) throws IOException {
		Main main = new Main();
	}
}