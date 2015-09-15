package h05;

import java.awt.*;
import java.applet.Applet;

public class Opdracht5_1 extends Applet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte; 
   
    public void init() { 
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
        }
        
        public void paint(Graphics g) {{
        	
            g.drawLine(100, 60, 300, 60);
            g.drawRect(100, 100, breedte, hoogte);
            g.drawRoundRect(100, 225, breedte, hoogte, 30, 30);
            g.setColor(opvulkleur);
            g.fillRect(315, 100, breedte, hoogte);
            g.setColor(lijnkleur);
            g.drawOval(315, 100, breedte, hoogte);
            g.setColor(opvulkleur);
            g.fillOval(315, 225, breedte, hoogte);
            g.setColor(lijnkleur);
            g.drawOval(530, 100, breedte, hoogte);
            g.setColor(opvulkleur);
            g.fillArc(530, 100, breedte, hoogte, 0, 45);
            g.setColor(lijnkleur);
            g.drawArc(560, 225, 120, 100, 360, 360);
            
            
        
        
        
        
        
        
        
    }}}
