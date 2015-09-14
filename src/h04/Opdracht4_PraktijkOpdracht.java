package h04;

import java.awt.*;
import java.applet.*;
public class Opdracht4_PraktijkOpdracht extends Applet{

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public void init(){
	}

     public void paint(Graphics g){ 
    	 g.drawLine(10, 10, 100, 10);
    	 g.drawString("Lijn", 40, 30);
    	 g.drawRect(10, 50, 90, 50);
    	 g.drawString("Rechthoek", 25, 120);
    	 g.drawRoundRect(10, 130, 90, 60, 10, 10);
    	 g.drawString("Afgeronde rechthoek", 10, 210);
    	 g.setColor(Color.magenta);
    	 g.fillRect(150, 50, 90, 50);
    	 g.setColor(Color.blue);
    	 g.drawArc(150, 50, 90, 50, 360, 360);
    	 g.setColor(Color.black);
    	 g.drawString("Gevulde rechthoek met ovaal", 130, 120);
    	 g.setColor(Color.magenta);
    	 g.fillArc(150, 130, 90, 50, 360, 360);
    	 g.setColor(Color.black);
    	 g.drawString("Gevulde ovaal", 155, 210);
    	 g.setColor(Color.magenta);
    	 g.fillArc(320, 50, 90, 50, 0, 45);
    	 g.setColor(Color.blue);
    	 g.drawArc(320, 50, 90, 50, 360, 360);
    	 g.setColor(Color.black);
    	 g.drawString("Taartpunt met ovaal eromheen", 300, 120);
    	 g.setColor(Color.blue);
    	 g.drawArc(340, 130, 50, 50, 360, 360);
    	 g.setColor(Color.black);
    	 g.drawString("Cirkel", 350, 210);
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
    	 
     }}
     