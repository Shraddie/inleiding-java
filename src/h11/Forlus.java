package h11;

import java.applet.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Forlus extends Applet {
	
	
	public void init(){
		setSize(450,800);	
	}
	
	public void paint(Graphics g){
		
		int x = 50;
		int y = 50;
		
		for (int j = 0; j < 30; j++){
			for (int i = 0; i < 30; i++){
				
				if ((j + i) % 2 == 0) {
					g.drawString("X", x, y);
					
				} else {
				g.drawString("O", x, y);
				x += 10;
			}
			x = 50;
			y += 20;
			
			}
		}
	}
}
