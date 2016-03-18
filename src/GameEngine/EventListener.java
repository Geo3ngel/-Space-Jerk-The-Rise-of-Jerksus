package GameEngine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import EntityDef.Controller;

public class EventListener implements ActionListener{
	Scanner scan = new Scanner(System.in);

	@Override
	public void actionPerformed(ActionEvent e) {
		Controller.controller(scan.nextLine());
	}
	
}
