package h06;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Opdracht6_2 extends Applet{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
	}
		
		public void paint(Graphics g) {
			g.setColor(Color.black);
			g.drawString(" seconden in een uur:" +  60 * 60, 10, 10);
			g.drawString(" seconden in een dag:" +  60 * 60 * 24, 10, 30);
			g.drawString(" seconden in een jaar:" +  60 * 60 * 24 * 365, 10, 50);
		
		
		
		
		}
		
	}
	
	
