package h04;

import java.awt.*;
import java.applet.*;
public class Opdracht4_7 extends Applet{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void init(){
	}

public void paint(Graphics g) {
	g.fillRect(40, 40, 90, 90);
	g.setColor(Color.white);
	g.fillArc(50, 50, 30, 30, 360, 360);
	g.fillArc(90, 50, 30, 30, 360, 360);
	g.fillArc(50, 90, 30, 30, 360, 360);
	g.fillArc(90, 90, 30, 30, 360, 360);
	
	
	
	

}}

