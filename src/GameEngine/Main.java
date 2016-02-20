package GameEngine;

import java.io.IOException;

import javax.swing.JFrame;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Main() {
		setSize(2160, 1080);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GameCanvas canvas = new GameCanvas(this.getContentPane().getWidth(), this.getContentPane().getHeight());
		add(canvas);
		pack();
	}

	public static void main(String[] args) throws IOException {
		Main main = new Main();
		
	}

}