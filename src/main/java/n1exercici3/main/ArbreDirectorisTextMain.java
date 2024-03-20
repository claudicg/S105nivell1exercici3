package n1exercici3.main;

import n1exercici3.handlers.ArbreDirectoriText;

public class ArbreDirectorisTextMain {

	public static void main(String[] args) {
		
		String path = "";
		if(args.length == 1) {
			path = args[0];	
		}
		
		ArbreDirectoriText demo = new ArbreDirectoriText();
		demo.escriureDirectoriTxt(demo.ordernarDirectori(path));

	}

}
