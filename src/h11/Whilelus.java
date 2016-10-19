package h11;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Whilelus extends Applet {
	
	
	public void init () {
		setSize(600,600);
	}
	
	public void paint(Graphics g) {
		
		int i = 0;
		int j = 0;
		int x = 50;
		int y = 50;
		
		while (j <30) {
			
			
			
		
		
		while (i < 30) {
			
			g.drawString("X", x, y);
			x = x + 10;
			i++;
			y += 20;
			
		}
		x = 50;
		y += 20;
		j++;
		
		}
	}
}
