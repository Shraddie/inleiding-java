package h06;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Opdracht6_3 extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	int pos1 = 15;
	int pos2 = 15;
	
    public static void main(String[] args) {
		
	}
    
    public void paint(Graphics g) {
		g.setColor(Color.blue);
		g.drawString("" + -pos1 + pos2, 20, 20);
		
		

		
	}
	
}
