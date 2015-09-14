package h04;

import java.awt.*;
import java.applet.*;
public class Opdracht4_4 extends Applet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void init(){
		
		
	}
	public void paint(Graphics g) {
		g.drawString("Valerie", 60, 200 );
		g.drawString("Jeroen", 130, 200);
		g.drawString("Hans", 200, 200);
		g.drawString("20", 30, 170);
		g.drawString("40", 30, 140);
		g.drawString("60", 30, 110);
		g.drawString("80", 30, 80);
		g.drawString("100", 25, 50);
		g.drawLine(50, 180, 50, 40);
		g.drawLine(50, 180, 250, 180);
		g.setColor(Color.red);
		g.fillRect(51, 135, 50, 45);
		g.setColor(Color.blue);
		g.fillRect(126, 45, 50, 135);
		g.setColor(Color.yellow);
		g.fillRect(190, 75, 50, 105);
	}
	
	}

