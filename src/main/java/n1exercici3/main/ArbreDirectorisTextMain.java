package n1exercici3.main;

import n1exercici3.handlers.ArbreDirectoriText;

public class ArbreDirectorisTextMain {

	public static void main(String[] args) {
		
		ArbreDirectoriText demo = new ArbreDirectoriText();
		demo.escriureDirectoriTxt(demo.ordernarDirectori("src/main/resources"));

	}

}
