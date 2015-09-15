package h06;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


@SuppressWarnings("serial")
public class Opdracht6_1 extends Applet {
    int totaal = 113;
    int over = totaal % 4;
    double per = totaal / 4;
    
    public static void main(String[] args) {
    
    
	}
    
    
    public void paint(Graphics g) {
		g.setColor(Color.black);
		g.drawString("Jan krijgt €" + per, 10, 50);
		g.drawString("Ali krijgt €" + per, 10, 70);
		g.drawString("Jeanette krijgt €" + per, 10, 90);
		g.drawString("Ik krijg €" + per, 10, 110);
		g.drawString("" + totaal + " is gedeeld in 4, ieder krijgt" + per, 10, 130);
		g.drawString("Er blijft een aantal over, €" + over , 10, 150);
	}
    
    
    
    }