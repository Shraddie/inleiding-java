package h04;

import java.awt.*;
import java.applet.*;
public class Opdracht4_6 extends Applet{



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void init() {	
	}

public void paint(Graphics g) {
	g.fillRect(40, 40, 70, 150);
	g.fillRect(60, 170, 30, 90);
	g.setColor(Color.red);
	g.fillArc(48, 43, 55, 45, 360, 360);
	g.setColor(Color.orange);
	g.fillArc(48, 90, 55, 45, 360, 360);
	g.setColor(Color.green);
	g.fillArc(48, 137, 55, 45, 360, 360);
	
}}
