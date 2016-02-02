package h12;

import java.applet.Applet;
import java.awt.*;

@SuppressWarnings({ "serial" })
public class Opdracht12_3 extends Applet {
	
	TextField[] tekstveld;
	public void init() {

		tekstveld = new TextField[5];
		
		for (int i = 0; i < tekstveld.length; i++) {
			tekstveld[i] = new TextField("",5);
			this.add(tekstveld[i]);
			
		}

	}
	
	
	
	
	
	
}
